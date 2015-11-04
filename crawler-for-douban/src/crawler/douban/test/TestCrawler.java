/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.test;

import java.sql.SQLException;

import crawler.douban.biz.PersonInfoManager;
import crawler.douban.user.UserInfo;


/**
 * @author alps
 * @version $Id: TestCrawler.java,v 0.1 2015年8月26日 下午2:44:41 alps Exp $
 */
public class TestCrawler {

    /**
     * @param args
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
                                          ClassNotFoundException, SQLException {
        //        CrawlerDouban cr = new CrawlerDouban("Tina");
        //        cr.crawler();
        UserInfo userInfo = new UserInfo();
        String nextName = userInfo.getNextName("CHEO");
        //        System.out.println(nextName);
        PersonInfoManager infoManager = new PersonInfoManager(nextName);
        boolean result = infoManager.managePersonInfo();
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
