/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import crawler.douban.crawler.PersonInfo;
import crawler.douban.database.dataobject.PersonInfoUserDO;
import crawler.douban.database.dataobject.PersonInfoUserListeningMusicDO;
import crawler.douban.database.dataobject.PersonInfoUserOftenGroupDO;
import crawler.douban.database.dataobject.PersonInfoUserReadingBookDO;
import crawler.douban.database.dataobject.PersonInfoUserWantBookDO;
import crawler.douban.database.dataobject.PersonInfoUserWantMovieDO;
import crawler.douban.database.dataobject.PersonInfoUserWantMusicDO;
import crawler.douban.database.dataobject.PersonInfoUserWatchedMovieDO;
import crawler.douban.database.utils.PersonInfo2DO;
import crawler.douban.log.Log4Crawler;

/**
 * @author alps
 * @version $Id: PersonInfoDAO.java,v 0.1 2015年8月26日 下午6:48:06 alps Exp $
 */
public class PersonInfoDAO {

    private final Log4Crawler logger;
    Connection                con;
    Statement                 stmt;
    
    /**
     * construct for PersonInfoDAO
     * @throws ClassNotFoundException 
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws SQLException 
     */
    public PersonInfoDAO() throws InstantiationException, IllegalAccessException,
                          ClassNotFoundException, SQLException {
        super();
        logger = new Log4Crawler();
        stmt = connectDatabase();
    }

    private Statement connectDatabase() throws InstantiationException, IllegalAccessException,
                                       ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //MYSQL驱动
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tongji", "chen",
            "chenfushan");
        stmt = con.createStatement(); //创建声明
        logger.infoLog("connect mysql success!");
        return stmt;
    }

    public boolean insertPersonInfo(PersonInfo personInfo) {
        try {

            //convert the person information to data object
            PersonInfoUserDO userDO = PersonInfo2DO.convertToPersonInfoUserDO(personInfo);
            List<PersonInfoUserListeningMusicDO> listeningMusicDO = PersonInfo2DO
                .convertToPersonInfoUserListeningMusicDO(personInfo);
            List<PersonInfoUserWantMusicDO> wantMusicDO = PersonInfo2DO
                .convertToPersonInfoUserWantMusicDO(personInfo);
            List<PersonInfoUserReadingBookDO> readingBookDO = PersonInfo2DO
                .convertToPersonInfoReadingBookDO(personInfo);
            List<PersonInfoUserWantBookDO> wantBookDO = PersonInfo2DO
                .convertToPersonInfoWantBookDO(personInfo);
            List<PersonInfoUserWatchedMovieDO> watchedMovieDO = PersonInfo2DO
                .convertToPersonInfoUserWatchedMovieDO(personInfo);
            List<PersonInfoUserWantMovieDO> wantMovieDO = PersonInfo2DO
                .convertToPersonInfoWantMovieDO(personInfo);
            List<PersonInfoUserOftenGroupDO> oftenGroupDO = PersonInfo2DO
                .converToPersonInfoUserOftenGroupDO(personInfo);
            //insert the data object to database

            if (!insertUserDO(userDO)) {
                logger.warnLog("insert user Error!");
            }
            if (!insertListeningMusicDO(listeningMusicDO)) {
                logger.warnLog("insert listeningMusicDO Error!");
            }
            if (!insertWantMusicDO(wantMusicDO)) {
                logger.warnLog("insert wantMusicDO Error!");
            }
            if (!insertReadingBookDO(readingBookDO)) {
                logger.warnLog("insert readingBookDO Error!");
            }
            if (!insertWantBookDO(wantBookDO)) {
                logger.warnLog("insert wantBookDo Error!");
            }
            if (!insertWatchedMovieDO(watchedMovieDO)) {
                logger.warnLog("insert watchedMovieDO Error!");
            }
            if (!insertWantMovieDO(wantMovieDO)) {
                logger.warnLog("insert wantMovieDO Error!");
            }
            if (!insertOftenGroupDO(oftenGroupDO)) {
                logger.warnLog("insert oftenGroup Error!");
            }
        } catch (Exception e) {
            System.out.print("MYSQL ERROR:" + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * insert user info data object
     * @param userDO
     * @return
     */
    private boolean insertUserDO(PersonInfoUserDO userDO) {
        String sql = "insert into user(user_id,user_name, user_home_page_url, user_sex, user_age, user_join_date, fellow_people_num, fellowed_people_num) values('"
                     + userDO.getUserId()
                     + "','"
                     + userDO.getUserName()
                     + "','"
                     + userDO.getHomePageUrl()
                     + "','"
                     + userDO.getSex()
                     + "','"
                     + userDO.getAge()
                     + "','"
                     + userDO.getJoinDate()
                     + "','"
                     + userDO.getFellowPeopleNum()
                     + "','"
                     + userDO.getFellowedPeopleNum() + "');";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            logger.warnLog("insert User Error!");
            return false;
        }
        return true;
    }
    
    /**
     * insert user listening music list data object
     * @param listeningMusicDOList
     * @return
     */
    private boolean insertListeningMusicDO(List<PersonInfoUserListeningMusicDO> listeningMusicDOList) {
        for (PersonInfoUserListeningMusicDO music : listeningMusicDOList) {
            String sql = "insert into listening_music(user_id, music_name) values('"
                         + music.getUserId() + "','" + music.getListeningMusic() + "')";
            try {
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert listening music Error!");
                //                return false;
            }
        }
        return true;
    }

    /**
     * insert user want to listen music list data object
     * @param wantMusicDOList
     * @return
     */
    private boolean insertWantMusicDO(List<PersonInfoUserWantMusicDO> wantMusicDOList) {
        for (PersonInfoUserWantMusicDO wantMusicDO : wantMusicDOList) {
            String sql = "insert into want_music(user_id, music_name) values('"
                         + wantMusicDO.getUserId() + "','" + wantMusicDO.getWantMusic() + "');";
            try{
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert want music Error!");
            }
        }
        return true;
    }

    /**
     * insert user reading book list data object
     * @param readingBookDOList
     * @return
     */
    private boolean insertReadingBookDO(List<PersonInfoUserReadingBookDO> readingBookDOList) {
        for (PersonInfoUserReadingBookDO readingBookDO : readingBookDOList) {
            String sql = "insert into reading_book(user_id, book_name) values('"
                         + readingBookDO.getUserId() + "','" + readingBookDO.getReadingBook()
                         + "')";
            try {
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert reading book Error!");
            }
        }
        return true;
    }

    /**
     * insert user want to read book list data object
     * @param wantBookDOList
     * @return
     */
    private boolean insertWantBookDO(List<PersonInfoUserWantBookDO> wantBookDOList) {
        for (PersonInfoUserWantBookDO wantBookDO : wantBookDOList) {
            String sql = "insert into want_book(user_id, book_name) values('"
                         + wantBookDO.getUserId() + "','" + wantBookDO.getWantBook() + "');";
            try {
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert want book Error!");
            }
        }
        return true;
    }

    /**
     * insert user have been watched movie list data object
     * @param watchedMovieDOList
     * @return
     */
    private boolean insertWatchedMovieDO(List<PersonInfoUserWatchedMovieDO> watchedMovieDOList) {
        for (PersonInfoUserWatchedMovieDO watchedMovieDO : watchedMovieDOList) {
            String sql = "insert into watched_movie(user_id, movie_name) values('"
                         + watchedMovieDO.getUserId() + "','" + watchedMovieDO.getWatchedMovie()
                         + "')";
            try {
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert watched movie Error!");
            }
        }
        return true;
    }

    /**
     * insert user want to watch movie list data object
     * @param wantMovieDOList
     * @return
     */
    private boolean insertWantMovieDO(List<PersonInfoUserWantMovieDO> wantMovieDOList) {
        for (PersonInfoUserWantMovieDO wantMovieDO : wantMovieDOList) {
            String sql = "insert into want_movie(user_id, movie_name) values('"
                         + wantMovieDO.getUserId() + "','" + wantMovieDO.getWantMovie() + "')";
            try {
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert want movie Error!");
            }
        }
        return true;
    }

    /**
     * insert the group which user often to watch
     * @param oftenGroupDOList
     * @return
     */
    private boolean insertOftenGroupDO(List<PersonInfoUserOftenGroupDO> oftenGroupDOList) {
        for (PersonInfoUserOftenGroupDO oftenGroupDO : oftenGroupDOList) {
            String sql = "insert into often_group(user_id, group_name) values('"
                         + oftenGroupDO.getUserId() + "', '" + oftenGroupDO.getOftenGroup() + "')";
            try {
                stmt.execute(sql);
            } catch (SQLException e) {
                logger.warnLog("insert often group Error!");
            }
        }
        return true;
    }

}
