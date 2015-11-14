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
 * @version $Id: CrawlerDouban.java,v 0.1 2015��8��26�� ����10:20:09 alps Exp $
 */
public class CrawlerDouban {
    /** ��ȡ���ݵ�ҳ��url */
    private String url;

    /**
     * ��ȡ�û���id
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
     * ��ҳ�����ݽ�����ȡ
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
        //���ҳ���Html����
        Document pageDoc = this.getHtml();
        //����Ҫ�����û������ڵ�ҳ���ж�
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
     * ��ȡҳ������ݣ���ŵ�Document�
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
     * ����ҳHtml����ת��ΪPersonInfo����
     * @param doc
     * @return
     */
    private PersonInfo convertDoc2PersonInfo(Document doc) {
        PersonInfo info = new PersonInfo();
        if (doc == null) {
            return null;
        }

        Elements obssinHtml = doc.select("div[class=\"obssin\"");

        //�û�id
        info.setUserId(id);
        //�û���ҳurl
        info.setHomePageUrl(url);

        //��ע������
        String fellowPeopleNum = getFellowPeopleNum(doc);
        info.setFellowPeopleNum(fellowPeopleNum);
        if (fellowPeopleNum == null) {
            logger.infoLog("User:" + id + ": empty fellow people");
        }

        //����ע������
        String fellowedPeopleNum = getFellowedPeopleNum(doc);
        info.setFellowedPeopleNum(fellowedPeopleNum);
        if (fellowedPeopleNum == null) {
            logger.infoLog("User:" + id + ": empty fellowed people");
        }

        //��ȥ��С��
        List<String> oftenGroup = getOftenGroup(doc);
        info.setOftenGroup(oftenGroup);
        if (oftenGroup == null) {
            logger.infoLog("User:" + id + ": empty often group");
        }

        //��ȡ�ڶ������б�
        List<String> readingBook = getReadingBook(obssinHtml);
        info.setReadingBook(readingBook);
        if (readingBook == null) {
            logger.infoLog("User:" + id + ": empty reading book");
        }

        //��ȡ��������б�
        List<String> wantBook = getWantBook(obssinHtml);
        info.setWantBook(wantBook);
        if (wantBook == null) {
            logger.infoLog("User:" + id + ": empty want book");
        }

        //�뿴�ĵ�Ӱ
        List<String> wantMovie = getWantMovie(obssinHtml);
        info.setWantMovie(wantMovie);
        if (wantMovie == null) {
            logger.infoLog("User:" + id + ": empty want movie");
        }

        //�����ĵ�Ӱ
        List<String> watchedMovie = getWatchedMovie(obssinHtml);
        info.setWatchedMovie(watchedMovie);
        if (watchedMovie == null) {
            logger.infoLog("User:" + id + ": empty watched movie");
        }

        //�����ĸ�
        List<String> listeningMusic = getListeningMusic(obssinHtml);
        info.setListeningMusic(listeningMusic);
        if (listeningMusic == null) {
            logger.infoLog("User:" + id + ": empty listening music");
        }

        //�����ĸ�
        List<String> wantMusic = getWantMusic(obssinHtml);
        info.setWantMusic(wantMusic);
        if (wantMusic == null) {
            logger.infoLog("User:" + id + ": empty want music");
        }

        //����ʱ��
        String joinDate = getJoinDate(doc);
        info.setJoinDate(joinDate);
        if (joinDate == null) {
            logger.infoLog("User:" + id + ": empty join date");
        }
        //�Ա���ʱ�޷���ȡ������Ĭ��ֵ��
        info.setSex("n");
        //���䣨��ʱ�޷���ȡ������Ĭ��ֵ��
        info.setAge("0");
        //����
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
            if (substatus.text().equals("�ڶ�")) {
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
            if (substatus.text().equals("���")) {
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
            if (substatus.text().equals("�뿴")) {
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
            if (substatus.text().equals("����")) {
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
            if (substatus.text().equals("����")) {
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
            if (substatus.text().equals("����")) {
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
            //��ע����
            if (fellowPeopleNumHtml != null) {
                String fellowPeopleNum = UtilsMethod.findFirstStringByRegex("��Ա[0-9]+",
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
            String fellowedPeopleNum = UtilsMethod.findFirstStringByRegex("��[0-9]+�˹�ע",
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
        //����
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
