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
     * ��ҳ�����ݽ�����ȡ
     * @param dict
     * @return
     */
    public PersonInfo crawler() {
        //���ҳ���Html����
        Document pageDoc = this.getHtml();

        return convertDoc2PersonInfo(pageDoc);
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
                //                System.out.print(doc.html());
            } catch (IOException e) {
                System.out.println("error in get html code");
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
        info.setUserId(id);
        info.setHomePageUrl(url);
        if (doc == null) {
            return null;
        }
        Elements nameHtml = doc.select("title");
        //        Elements sexHtml = doc.select("sex"); //ҳ�������û���Ա�
        //        Elements ageHtml = doc.select("age"); //ҳ������ʱ�޷���ȡ����
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
                if (substatus.text().equals("�ڶ�")) {
                    readingBookHtml = books.select("li[class=\"aob\"] a img");
                }
                if (substatus.text().equals("���")) {
                    wantBookHtml = books.select("li[class=\"aob\"] a img");
                }
                if (substatus.text().equals("�뿴")) {
                    wantMovieHtml = books.select("li[class=\"aob\"] a");
                }
                if (substatus.text().equals("����")) {
                    watchedMovieHtml = books.select("li[class=\"aob\"] a");
                }
                if (substatus.text().equals("����")) {
                    listeningMusicHtml = books.select("li[class=\"aob\"] a");
                }
                if (substatus.text().equals("����")) {
                    wantMusicHtml = books.select("li[class=\"aob\"] a");
                }
            }
        } else {
            logger.infoLog("empty book");
        }
        //��ע����
        if (fellowPeopleNumHtml != null) {
            String fellowPeopleNum = UtilsMethod.findFirstStringByRegex("��Ա[0-9]+",
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
        //����ע����
        if (fellowedPeopleNumHtml != null) {
            String fellowedPeopleNum = UtilsMethod.findFirstStringByRegex("��[0-9]+�˹�ע",
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

        //��ȥ��С��
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

        //��ȡ�ڶ������б�
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
        //��ȡ��������б�
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
        //�뿴�ĵ�Ӱ
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
        //�����ĵ�Ӱ
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
        //�����ĸ�
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
        //�����ĸ�
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
        //����ʱ��
        String joinDate = UtilsMethod.findFirstStringByRegex("[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}",
            joinDateHtml.text());
        if (joinDate != null) {
            info.setJoinDate(joinDate);
        } else {
            logger.infoLog("empty join date");
        }
        //�Ա�
        info.setSex("n");
        //����
        info.setAge("0");

        //����
        if (nameHtml != null) {
            info.setUserName(nameHtml.text());
        } else {
            logger.infoLog("empty name");
        }
        

        return info;
    }

}
