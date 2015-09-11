/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.test;

import crawler.douban.crawler.CrawlerDouban;

/**
 * @author alps
 * @version $Id: TestCrawler.java,v 0.1 2015年8月26日 下午2:44:41 alps Exp $
 */
public class TestCrawler {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CrawlerDouban cr = new CrawlerDouban("Tina");
        cr.crawler();
    }

}
