/**
 * Alps and Askingwindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import crawler.douban.global.GlobalVariable;

/**
 * @author alps
 * @version $Id: CrawlerDouban.java,v 0.1 2015年8月26日 上午10:20:09 alps Exp $
 */
public class CrawlerDouban {
    /** 爬取内容的页面url */
    private String url;

    /**
     * construct
     */
    public CrawlerDouban() {
        super();
    }

    /**
     * construct
     * @param url
     */
    public CrawlerDouban(String url) {
        super();
        this.url = GlobalVariable.PREURL + url;
    }


    /**
     * 对页面内容进行爬取
     * @param dict
     * @return
     */
    public PersonInfo crawlerDouban(String dict) {
        //获得页面的Html代码
        Document pageDoc = this.getHtml();

        return convertDoc2PersonInfo(pageDoc);
    }

    /**
     * 获取页面的内容，存放到Document里。
     * @return
     */
    public Document getHtml() {
        Document doc = null;
        if (this.url == null) {
            return null;
        } else {
            try {
                doc = Jsoup.connect(url).timeout(60000).get();
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
    public PersonInfo convertDoc2PersonInfo(Document doc) {
        PersonInfo info = new PersonInfo();
        return info;
    }

}
