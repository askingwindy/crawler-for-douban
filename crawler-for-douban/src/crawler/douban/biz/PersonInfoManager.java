/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.biz;

import java.sql.SQLException;

import crawler.douban.crawler.CrawlerDouban;
import crawler.douban.crawler.PersonInfo;
import crawler.douban.database.PersonInfoDAO;
import crawler.douban.log.Log4Crawler;

/**
 * @author alps
 * @version $Id: PersonInfoManager.java,v 0.1 2015年8月26日 下午6:48:34 alps Exp $
 */
public class PersonInfoManager {
    /**
     * crawler object
     */
    CrawlerDouban             crawlerDouban;

    /**
     * log class
     */
    private final Log4Crawler logger;

    String                    userId;

    /**
     * constructor
     */
    public PersonInfoManager(String userId) {
        super();
        this.userId = userId;
        logger = new Log4Crawler();
        crawlerDouban = new CrawlerDouban(userId);
    }

    public boolean managePersonInfo() throws InstantiationException, IllegalAccessException,
                                     ClassNotFoundException, SQLException {
        PersonInfo info = crawlerDouban.crawler();
        if (info == null) {
            logger.infoLog("User:" + userId + ": empty person information");
            return true;
        }
        if (insertPersonInfo(info) == true) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * insert the person information to database
     * @param info
     * @return
     * @throws SQLException 
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     */
    private boolean insertPersonInfo(PersonInfo info) throws InstantiationException,
                                                     IllegalAccessException,
                                                     ClassNotFoundException, SQLException {
        PersonInfoDAO personInfoDAO = new PersonInfoDAO();
        boolean insertResult = personInfoDAO.insertPersonInfo(info);
        return insertResult;
    }
}
