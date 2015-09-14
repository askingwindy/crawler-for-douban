/**
 * Alps and Askingwindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.crawler;

import java.io.IOException;
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
    private Log4Crawler logger;

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
    }


    /**
     * 对页面内容进行爬取
     * @param dict
     * @return
     */
    public PersonInfo crawler() {
        //获得页面的Html代码
        Document pageDoc = this.getHtml();

        return convertDoc2PersonInfo(pageDoc);
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
                //                System.out.print(doc.html());
            } catch (IOException e) {
                System.out.println("error in get html code");
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
        info.setUserId(id);
        info.setHomePageUrl(url);
        if (doc == null) {
            return null;
        }
        Elements nameHtml = doc.select("title");
        //        Elements sexHtml = doc.select("sex"); //页面想好像没有性别
        //        Elements ageHtml = doc.select("age"); //页面想暂时无法获取年龄
        Elements joinDateHtml = doc.select("div[class=\"user-info\"] div[class=\"pl\"]");
        Elements obssinHtml = doc.select("div[class=\"obssin\"");
        Elements readingBookHtml = null;
        Elements wantBookHtml = null;
        Elements wantMovieHtml = null;
        Elements watchedMovieHtml = null;
        Elements listeningMusicHtml = null;
        Elements wantMusicHtml = null;
        Elements oftenGroupHtml = doc.select("dl[class=\"ob\"] dd a");
        Elements friendHtml = doc.select("div[id=\"friend\"]");
        Elements fellowPeopleNumHtml = null;
        Elements fellowedPeopleNumHtml = null;
        if (friendHtml != null) {
            fellowPeopleNumHtml = friendHtml.select("a");
            fellowedPeopleNumHtml = friendHtml.select("p[class=\"rev-link\"]");

        } else {
            info.setFellowedPeopleNum(null);
            info.setFellowPeopleNum(null);
            logger.infoLog("empty fellow and fellowed");
        }
        if (obssinHtml != null) {
            for (Element books : obssinHtml) {
                Elements substatus = books.select("div[class=\"substatus\"]");
                if (substatus.text().equals("在读")) {
                    readingBookHtml = books.select("li[class=\"aob\"] a img");
                }
                if (substatus.text().equals("想读")) {
                    wantBookHtml = books.select("li[class=\"aob\"] a img");
                }
                if (substatus.text().equals("想看")) {
                    wantMovieHtml = books.select("li[class=\"aob\"] a");
                }
                if (substatus.text().equals("看过")) {
                    watchedMovieHtml = books.select("li[class=\"aob\"] a");
                }
                if (substatus.text().equals("在听")) {
                    listeningMusicHtml = books.select("li[class=\"aob\"] a");
                }
                if (substatus.text().equals("想听")) {
                    wantMusicHtml = books.select("li[class=\"aob\"] a");
                }
            }
        } else {
            logger.infoLog("empty book");
        }
        //关注人数
        if (fellowPeopleNumHtml != null) {
            String fellowPeopleNum = UtilsMethod.findFirstStringByRegex("成员[0-9]+",
                fellowPeopleNumHtml.text());
            if (fellowPeopleNum != null) {
                fellowPeopleNum = fellowPeopleNum.replaceAll("[\\D]+", "");
                if (fellowPeopleNum != null) {
                    info.setFellowPeopleNum(fellowPeopleNum);
                } else {
                    info.setFellowPeopleNum(null);
                }
            } else {
                info.setFellowPeopleNum(null);
            }
        } else {
            info.setFellowPeopleNum(null);
        }
        //被关注人数
        if (fellowedPeopleNumHtml != null) {
            String fellowedPeopleNum = UtilsMethod.findFirstStringByRegex("被[0-9]+人关注",
                fellowedPeopleNumHtml.text());
            if (fellowedPeopleNum != null) {
                fellowedPeopleNum = fellowedPeopleNum.replaceAll("[\\D]+", "");
                if (fellowedPeopleNum != null) {
                    info.setFellowedPeopleNum(fellowedPeopleNum);
                } else {
                    info.setFellowedPeopleNum(null);
                }
            } else {
                info.setFellowedPeopleNum(null);
            }
        } else {
            info.setFellowedPeopleNum(null);
        }

        //常去的小组
        if (oftenGroupHtml != null) {
            List<String> oftenGroup = new ArrayList<String>();
            for (Element group : oftenGroupHtml) {
                oftenGroup.add(group.text());
            }
            info.setOftenGroup(oftenGroup);
        } else {
            info.setOftenGroup(null);
            logger.infoLog("empty often group");
        }

        //获取在读的书列表
        if (readingBookHtml != null) {
            List<String> readingBook = new ArrayList<String>();
            for (Element book : readingBookHtml) {
                readingBook.add(book.attr("alt"));
            }
            info.setReadingBook(readingBook);
        } else {
            info.setReadingBook(null);
            logger.infoLog("empty reading book");
        }
        //获取想读的书列表
        if (wantBookHtml != null) {
            List<String> wantBook = new ArrayList<String>();
            for (Element book : wantBookHtml) {
                wantBook.add(book.attr("alt"));
            }
            info.setWantBook(wantBook);
        } else {
            info.setWantBook(null);
            logger.infoLog("empty want book");
        }
        //想看的电影
        if (wantMovieHtml != null) {
            List<String> wantMovie = new ArrayList<String>();
            for (Element movie : wantMovieHtml) {
                wantMovie.add(movie.attr("title"));
            }
            info.setWantMovie(wantMovie);
        } else {
            info.setWantMovie(null);
            logger.infoLog("empty want movie");
        }
        //看过的电影
        if (watchedMovieHtml != null) {
            List<String> watchedMovie = new ArrayList<String>();
            for (Element movie : watchedMovieHtml) {
                watchedMovie.add(movie.attr("title"));
            }
            info.setWatchedMovie(watchedMovie);
        } else {
            info.setWatchedMovie(null);
            logger.infoLog("empty watched movie");
        }
        //在听的歌
        if (listeningMusicHtml != null) {
            List<String> listeningMusic = new ArrayList<String>();
            for (Element music : listeningMusicHtml) {
                listeningMusic.add(music.attr("title"));
            }
            info.setListeningMusic(listeningMusic);
        } else {
            info.setListeningMusic(null);
            logger.infoLog("empty listening music");
        }
        //想听的歌
        if (wantMusicHtml != null) {
            List<String> wantMusic = new ArrayList<String>();
            for (Element music : wantMusicHtml) {
                wantMusic.add(music.attr("title"));
            }
            info.setWantMusic(wantMusic);
        } else {
            info.setWantMusic(null);
            logger.infoLog("empty want music");
        }
        //加入时间
        String joinDate = UtilsMethod.findFirstStringByRegex("[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}",
            joinDateHtml.text());
        if (joinDate != null) {
            info.setJoinDate(joinDate);
        } else {
            logger.infoLog("empty join date");
        }
        //性别
        info.setSex("n");
        //年龄
        info.setAge("0");

        //姓名
        if (nameHtml != null) {
            info.setUserName(nameHtml.text());
        } else {
            logger.infoLog("empty name");
        }
        

        return info;
    }

}
