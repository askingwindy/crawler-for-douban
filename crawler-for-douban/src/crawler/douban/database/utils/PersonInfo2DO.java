/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.utils;

import java.util.ArrayList;
import java.util.List;

import crawler.douban.crawler.PersonInfo;
import crawler.douban.database.dataobject.PersonInfoUserDO;
import crawler.douban.database.dataobject.PersonInfoUserListeningMusicDO;
import crawler.douban.database.dataobject.PersonInfoUserOftenGroupDO;
import crawler.douban.database.dataobject.PersonInfoUserReadingBookDO;
import crawler.douban.database.dataobject.PersonInfoUserWantBookDO;
import crawler.douban.database.dataobject.PersonInfoUserWantMusicDO;
import crawler.douban.database.dataobject.PersonInfoUserWatchedMovieDO;
import crawler.douban.database.dataobject.PersonInfoUserWantMovieDO;

/**
 * @author alps
 * @version $Id: PersonInfo2DO.java,v 0.1 2015年9月17日 下午6:10:51 alps Exp $
 */
public class PersonInfo2DO {

    /**
     * convert person information to user data object
     * @param person
     * @return
     */
    public static PersonInfoUserDO convertToPersonInfoUserDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        PersonInfoUserDO userDo = new PersonInfoUserDO();
        userDo.setUserId(person.getUserId());
        userDo.setAge(person.getAge());
        userDo.setSex(person.getSex());
        userDo.setHomePageUrl(person.getHomePageUrl());
        userDo.setUserName(person.getUserName());
        userDo.setJoinDate(person.getJoinDate());
        userDo.setFellowPeopleNum(person.getFellowPeopleNum());
        userDo.setFellowedPeopleNum(person.getFellowedPeopleNum());

        return userDo;
    }

    /**
     * convert person information to user reading book list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserReadingBookDO> convertToPersonInfoReadingBookDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserReadingBookDO> readingBookDOList = new ArrayList<PersonInfoUserReadingBookDO>();
        for (String tempReadingBook : person.getReadingBook()) {
            PersonInfoUserReadingBookDO readingBookDO = new PersonInfoUserReadingBookDO();
            readingBookDO.setUserId(person.getUserId());
            readingBookDO.setReadingBook(tempReadingBook);
            readingBookDOList.add(readingBookDO);
        }
        return readingBookDOList;
    }

    /**
     * convert person information to user want book list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserWantBookDO> convertToPersonInfoWantBookDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserWantBookDO> wantBookDOList = new ArrayList<PersonInfoUserWantBookDO>();
        for (String tempWantBook : person.getWantBook()) {
            PersonInfoUserWantBookDO wantBookDO = new PersonInfoUserWantBookDO();
            wantBookDO.setUserId(person.getUserId());
            wantBookDO.setWantBook(tempWantBook);
            wantBookDOList.add(wantBookDO);
        }
        return wantBookDOList;
    }

    /**
     * convert person information to user listening music list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserListeningMusicDO> convertToPersonInfoUserListeningMusicDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserListeningMusicDO> listeningMusicDOList = new ArrayList<PersonInfoUserListeningMusicDO>();
        for (String tempListeningMusic : person.getListeningMusic()) {
            PersonInfoUserListeningMusicDO listeningMusicDO = new PersonInfoUserListeningMusicDO();
            listeningMusicDO.setUserId(person.getUserId());
            listeningMusicDO.setListeningMusic(tempListeningMusic);
            listeningMusicDOList.add(listeningMusicDO);
        }
        return listeningMusicDOList;
    }

    /**
     * convert person information to user want to listen music list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserWantMusicDO> convertToPersonInfoUserWantMusicDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserWantMusicDO> wantMusicDOList = new ArrayList<PersonInfoUserWantMusicDO>();
        for (String tempWantMusic : person.getWantMusic()) {
            PersonInfoUserWantMusicDO wantMusicDO = new PersonInfoUserWantMusicDO();
            wantMusicDO.setUserId(person.getUserId());
            wantMusicDO.setWantMusic(tempWantMusic);
            wantMusicDOList.add(wantMusicDO);
        }
        return wantMusicDOList;
    }

    /**
     * convert person information to user have been watched movie list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserWatchedMovieDO> convertToPersonInfoUserWatchedMovieDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserWatchedMovieDO> watchedMovieDOList = new ArrayList<PersonInfoUserWatchedMovieDO>();
        for (String tempWatchMovie : person.getWantMovie()) {
            PersonInfoUserWatchedMovieDO watchedMovieDO = new PersonInfoUserWatchedMovieDO();
            watchedMovieDO.setUserId(person.getUserId());
            watchedMovieDO.setWatchedMovie(tempWatchMovie);
            watchedMovieDOList.add(watchedMovieDO);
        }
        return watchedMovieDOList;
    }

    /**
     * convert person information to user want to watch movie list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserWantMovieDO> convertToPersonInfoWantMovieDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserWantMovieDO> wantMovieDOList = new ArrayList<PersonInfoUserWantMovieDO>();
        for (String tempWantMovie : person.getWantMovie()) {
            PersonInfoUserWantMovieDO wantMovieDO = new PersonInfoUserWantMovieDO();
            wantMovieDO.setUserId(person.getUserId());
            wantMovieDO.setWantMovie(tempWantMovie);
            wantMovieDOList.add(wantMovieDO);
        }
        return wantMovieDOList;
    }

    /**
     * convert person information to user often group list data object
     * @param person
     * @return
     */
    public static List<PersonInfoUserOftenGroupDO> converToPersonInfoUserOftenGroupDO(PersonInfo person) {
        if (person == null) {
            return null;
        }
        List<PersonInfoUserOftenGroupDO> oftenGroupDOList = new ArrayList<PersonInfoUserOftenGroupDO>();
        for (String tempOftenGroup : person.getOftenGroup()) {
            PersonInfoUserOftenGroupDO oftenGroupDO = new PersonInfoUserOftenGroupDO();
            oftenGroupDO.setUserId(person.getUserId());
            oftenGroupDO.setOftenGroup(tempOftenGroup);
            oftenGroupDOList.add(oftenGroupDO);
        }
        return oftenGroupDOList;
    }
}
