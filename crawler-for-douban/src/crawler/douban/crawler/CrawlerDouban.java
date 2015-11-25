/**
 * Alps and Askingwindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.crawler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import crawler.douban.global.GlobalVariable;
import crawler.douban.log.Log4Crawler;

/**
 * @author alps
 * @version $Id: CrawlerDouban.java,v 0.1 2015年8月26日 上午10:20:09 alps Exp $
 */
public class CrawlerDouban {
    /** 爬取内容的页面url */
    private String url;

    /**
     * 爬取用户的id
     */
    private String id;

    /**
     * log class
     */
    private final Log4Crawler logger;

    /**
     * construct
     */
    public CrawlerDouban() {
        super();
        logger = new Log4Crawler();
    }

    /**
     * construct
     * @param url
     */
    public CrawlerDouban(String id) {
        super();
        this.id = id;
        this.url = GlobalVariable.PREURL + id;
        logger = new Log4Crawler();
    }

    /**
     * construct the url
     * @param id
     */
    public void constructUrl(String id) {
        this.id = id;
        this.url = GlobalVariable.PREURL + id;
    }


    /**
     * 对页面内容进行爬取
     * @param dict
     * @return
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    public PersonInfo crawler() throws InstantiationException, IllegalAccessException,
                            ClassNotFoundException, SQLException {
        if (this.url == null) {
            logger.warnLog("empty url");
            return null;
        }
        //获得页面的Html代码
        Document pageDoc = this.getHtml();
        //这里要加上用户不存在的页面判断
        if (pageDoc == null) {
            return null;
        }
        PersonInfo info = convertDoc2PersonInfo(pageDoc);

        if (info == null) {
            return null;
        } else {
            return info;
        }
    }



    /**
     * 获取页面的内容，存放到Document里。
     * @return
     */
    private Document getHtml() {
        Document doc = null;
        if (this.url == null) {
            return null;
        } else {
            try {
                doc = Jsoup.connect(url).data("query", "Java").userAgent("Mozilla").timeout(3000)
                    .get();
            } catch (IOException e) {
                //                System.out.println("error in get html code");
                logger.infoLog(url + " -- not exist!");
            }
        }
        return doc;
    }

    /**
     * 把网页Html代码转换为PersonInfo对象
     * @param doc
     * @return
     */
    private PersonInfo convertDoc2PersonInfo(Document doc) {
        PersonInfo info = new PersonInfo();
        if (doc == null) {
            return null;
        }

        Elements obssinHtml = doc.select("div[class=\"obssin\"");

        //用户id
        info.setUserId(id);
        //用户主页url
        info.setHomePageUrl(url);

        //关注的人数
        String fellowPeopleNum = getFellowPeopleNum(doc);
        info.setFellowPeopleNum(fellowPeopleNum);
        if (fellowPeopleNum == null) {
            logger.infoLog("User:" + id + ": empty fellow people");
        }

        //被关注的人数
        String fellowedPeopleNum = getFellowedPeopleNum(doc);
        info.setFellowedPeopleNum(fellowedPeopleNum);
        if (fellowedPeopleNum == null) {
            logger.infoLog("User:" + id + ": empty fellowed people");
        }

        //常去的小组
        List<String> oftenGroup = getOftenGroup(doc);
        info.setOftenGroup(oftenGroup);
        if (oftenGroup == null) {
            logger.infoLog("User:" + id + ": empty often group");
        }

        //获取在读的书列表
        List<String> readingBook = getReadingBook(obssinHtml);
        info.setReadingBook(readingBook);
        if (readingBook == null) {
            logger.infoLog("User:" + id + ": empty reading book");
        }

        //获取想读的书列表
        List<String> wantBook = getWantBook(obssinHtml);
        info.setWantBook(wantBook);
        if (wantBook == null) {
            logger.infoLog("User:" + id + ": empty want book");
        }

        //想看的电影
        List<String> wantMovie = getWantMovie(obssinHtml);
        info.setWantMovie(wantMovie);
        if (wantMovie == null) {
            logger.infoLog("User:" + id + ": empty want movie");
        }

        //看过的电影
        List<String> watchedMovie = getWatchedMovie(obssinHtml);
        info.setWatchedMovie(watchedMovie);
        if (watchedMovie == null) {
            logger.infoLog("User:" + id + ": empty watched movie");
        }

        //在听的歌
        List<String> listeningMusic = getListeningMusic(obssinHtml);
        info.setListeningMusic(listeningMusic);
        if (listeningMusic == null) {
            logger.infoLog("User:" + id + ": empty listening music");
        }

        //想听的歌
        List<String> wantMusic = getWantMusic(obssinHtml);
        info.setWantMusic(wantMusic);
        if (wantMusic == null) {
            logger.infoLog("User:" + id + ": empty want music");
        }

        //加入时间
        String joinDate = getJoinDate(doc);
        info.setJoinDate(joinDate);
        if (joinDate == null) {
            logger.infoLog("User:" + id + ": empty join date");
        }
        //性别（暂时无法获取，设置默认值）
        info.setSex("n");
        //年龄（暂时无法获取，设置默认值）
        info.setAge("0");
        //姓名
        String name = getName(doc);
        info.setUserName(name);
        if (name == null) {
            logger.infoLog("User:" + id + ": empty name");
        }
        
        return info;
    }

    /**
     * get the person often look group
     * @param doc
     * @return
     */
    private List<String> getOftenGroup(Document doc) {
        Elements oftenGroupHtml = doc.select("dl[class=\"ob\"] dd a");
        if (oftenGroupHtml != null) {
            List<String> oftenGroup = new ArrayList<String>();
            for (Element group : oftenGroupHtml) {
                oftenGroup.add(group.text());
            }
            return oftenGroup;
        } else {
            return null;
        }
    }

    /**
     * get reading book list
     * @param obssinHtml
     * @return
     */
    private List<String> getReadingBook(Elements obssinHtml) {
        if (obssinHtml == null) {
            return null;
        }
        for (Element books : obssinHtml) {
            Elements substatus = books.select("div[class=\"substatus\"]");
            if (substatus.text().equals("在读")) {
                Elements readingBookHtml = books.select("li[class=\"aob\"] a img");
                if (readingBookHtml != null) {
                    List<String> readingBook = new ArrayList<String>();
                    for (Element book : readingBookHtml) {
                        readingBook.add(book.attr("alt"));
                    }
                    return readingBook;
                } else {
                    return null;
                }
            }




        }
        return null;
    }

    /**
     * get the want to read book list
     * @param obssinHtml
     * @return
     */
    private List<String> getWantBook(Elements obssinHtml) {
        if (obssinHtml == null) {
            return null;
        }
        for (Element books : obssinHtml) {
            Elements substatus = books.select("div[class=\"substatus\"]");
            if (substatus.text().equals("想读")) {
                Elements wantBookHtml = books.select("li[class=\"aob\"] a img");
                if (wantBookHtml != null) {
                    List<String> wantBook = new ArrayList<String>();
                    for (Element book : wantBookHtml) {
                        wantBook.add(book.attr("alt"));
                    }
                    return wantBook;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * get want to see movie
     * @param obssinHtml
     * @return
     */
    private List<String> getWantMovie(Elements obssinHtml) {
        if (obssinHtml == null) {
            return null;
        }
        for (Element books : obssinHtml) {
            Elements substatus = books.select("div[class=\"substatus\"]");
            if (substatus.text().equals("想看")) {
                Elements wantMovieHtml = books.select("li[class=\"aob\"] a");
                if (wantMovieHtml != null) {
                    List<String> wantMovie = new ArrayList<String>();
                    for (Element movie : wantMovieHtml) {
                        wantMovie.add(movie.attr("title"));
                    }
                    return wantMovie;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * get the movie which watched
     * @param obssinHtml
     * @return
     */
    private List<String> getWatchedMovie(Elements obssinHtml) {
        if (obssinHtml == null) {
            return null;
        }
        for (Element books : obssinHtml) {
            Elements substatus = books.select("div[class=\"substatus\"]");
            if (substatus.text().equals("看过")) {
                Elements watchedMovieHtml = books.select("li[class=\"aob\"] a");
                if (watchedMovieHtml != null) {
                    List<String> watchedMovie = new ArrayList<String>();
                    for (Element movie : watchedMovieHtml) {
                        watchedMovie.add(movie.attr("title"));
                    }
                    return watchedMovie;
                } else {
                    return null;
                }
            }

        }
        return null;
    }

    /**
     * get the listening music list
     * @param obssinHtml
     * @return
     */
    private List<String> getListeningMusic(Elements obssinHtml) {
        if (obssinHtml == null) {
            return null;
        }
        for (Element books : obssinHtml) {
            Elements substatus = books.select("div[class=\"substatus\"]");
            if (substatus.text().equals("在听")) {
                Elements listeningMusicHtml = books.select("li[class=\"aob\"] a");
                if (listeningMusicHtml != null) {
                    List<String> listeningMusic = new ArrayList<String>();
                    for (Element music : listeningMusicHtml) {
                        listeningMusic.add(music.attr("title"));
                    }
                    return listeningMusic;
                } else {
                    return null;
                }
            }

        }
        return null;
    }

    /**
     * get want to listen music list
     * @param obssinHtml
     * @return
     */
    private List<String> getWantMusic(Elements obssinHtml) {
        if (obssinHtml == null) {
            return null;
        }
        for (Element books : obssinHtml) {
            Elements substatus = books.select("div[class=\"substatus\"]");
            if (substatus.text().equals("想听")) {
                Elements wantMusicHtml = books.select("li[class=\"aob\"] a");
                if (wantMusicHtml != null) {
                    List<String> wantMusic = new ArrayList<String>();
                    for (Element music : wantMusicHtml) {
                        wantMusic.add(music.attr("title"));
                    }
                    return wantMusic;
                } else {
                    return null;
                }
            }

        }
        return null;
    }

    /**
     * achieve the num of people him/her fellowed
     * @param doc
     * @return
     */
    private String getFellowPeopleNum(Document doc) {
        Elements friendHtml = doc.select("div[id=\"friend\"]");
        Elements fellowPeopleNumHtml = null;

        if (friendHtml != null) {
            fellowPeopleNumHtml = friendHtml.select("a");
            //关注人数
            if (fellowPeopleNumHtml != null) {
                String fellowPeopleNum = UtilsMethod.findFirstStringByRegex("成员[0-9]+",
                    fellowPeopleNumHtml.text());
                if (fellowPeopleNum != null) {
                    fellowPeopleNum = fellowPeopleNum.replaceAll("[\\D]+", "");
                    if (fellowPeopleNum != null) {
                        return fellowPeopleNum;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * achieve the num of people fellow him/her
     * @param doc
     * @return
     */
    private String getFellowedPeopleNum(Document doc) {
        Elements friendHtml = doc.select("p[class=\"rev-link\"]");
        if (friendHtml != null) {
            String fellowedPeopleNum = UtilsMethod.findFirstStringByRegex("被[0-9]+人关注",
                friendHtml.text());
            if (fellowedPeopleNum != null) {
                fellowedPeopleNum = fellowedPeopleNum.replaceAll("[\\D]+", "");
                if (fellowedPeopleNum != null) {
                    return fellowedPeopleNum;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * achieve the person name on douban
     * @param doc
     * @return
     */
    private String getName(Document doc) {
        Elements nameHtml = doc.select("title");
        //姓名
        if (nameHtml != null) {
            return nameHtml.text();
        } else {
            return null;
        }
    }

    /**
     * achieve the person join douban date
     * @param doc
     * @return
     */
    private String getJoinDate(Document doc) {
        Elements joinDateHtml = doc.select("div[class=\"user-info\"] div[class=\"pl\"]");
        if (joinDateHtml != null) {
            return UtilsMethod.findFirstStringByRegex("[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}",
                joinDateHtml.text());
        } else {
            return null;
        }
    }

}
