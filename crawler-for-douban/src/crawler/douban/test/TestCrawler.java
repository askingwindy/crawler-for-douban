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

    private static PersonInfoManager infoManager;

    /**
     * @param args
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
                                          ClassNotFoundException, SQLException {
        String nextName = UserInfo.getNextName("a");
        System.out.println(nextName);
        infoManager = new PersonInfoManager(nextName);
        boolean result = infoManager.managePersonInfo();
        while (result) {
            System.out.println("true");
            nextName = UserInfo.getNextName();
            System.out.println(nextName);
            infoManager = new PersonInfoManager(nextName);
            result = infoManager.managePersonInfo();
        }
        //        System.out.println(result);
        //        Date date = new Date();
        //        int logLevel = 1;
        //        String sql = "insert into crawler_log(log_id, log_content, log_date, log_level) values('','"
        //                     + date + "','" + date + "', '" + logLevel + "')";
        //        System.out.println(sql);
    }

}
