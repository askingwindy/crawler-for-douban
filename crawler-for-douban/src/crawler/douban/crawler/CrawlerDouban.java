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
 * @version $Id: CrawlerDouban.java,v 0.1 2015��8��26�� ����10:20:09 alps Exp $
 */
public class CrawlerDouban {
    /** ��ȡ���ݵ�ҳ��url */
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
     * ��ҳ�����ݽ�����ȡ
     * @param dict
     * @return
     */
    public PersonInfo crawlerDouban(String dict) {
        //���ҳ���Html����
        Document pageDoc = this.getHtml();

        return convertDoc2PersonInfo(pageDoc);
    }

    /**
     * ��ȡҳ������ݣ���ŵ�Document�
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
     * ����ҳHtml����ת��ΪPersonInfo����
     * @param doc
     * @return
     */
    public PersonInfo convertDoc2PersonInfo(Document doc) {
        PersonInfo info = new PersonInfo();
        return info;
    }

}
