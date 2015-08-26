/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.crawler;

import java.util.List;

/**
 * �û�������Ϣ
 * @author alps
 * @version $Id: PersonInfo.java,v 0.1 2015��8��12�� ����2:27:27 alps Exp $
 */
public class PersonInfo {
    /** �û�ΨһID */
    private String userId;
    
    /** �û���ҳurl */
    private  String homePageUrl;
    
    /** �û��� */
    private String userName;
    
    /** �Ա� */
    private String sex;
    
    /** ���� */
    private String age;
    
    /** ���붹��ʱ�� */
    private String joinDate;
    
    /** ���ڶ������б� */
    private List<String> readingBook;
    
    /** ��Ҫ������ */
    private List<String> wantBook;
    
    /** �����ĵ�Ӱ */
    private List<String> watchedMovie;
    
    /** �뿴�ĵ�Ӱ */
    private List<String> wantMovie;
    
    /** �������ĸ� */
    private List<String> listeningMusic;
    
    /** ��Ҫ���ĸ� */
    private List<String> wantMusic;
    
    /** ����ȥ��С�� */
    private List<String> oftenGroup;
    
    /** ��ע������ */
    private String fellowPeopleNum;
    
    /** ��ע�������� */
    private String fellowedPeopleNum;

    /**
        * Getter method for property <tt>userId</tt>.
        * 
        * @return property value of userId
        */
    public String getUserId() {
        return userId;
    }

    /**
        * Setter method for property <tt>userId</tt>.
        * 
        * @param userId value to be assigned to property userId
        */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
        * Getter method for property <tt>homePageUrl</tt>.
        * 
        * @return property value of homePageUrl
        */
    public String getHomePageUrl() {
        return homePageUrl;
    }

    /**
        * Setter method for property <tt>homePageUrl</tt>.
        * 
        * @param homePageUrl value to be assigned to property homePageUrl
        */
    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    /**
        * Getter method for property <tt>userName</tt>.
        * 
        * @return property value of userName
        */
    public String getUserName() {
        return userName;
    }

    /**
        * Setter method for property <tt>userName</tt>.
        * 
        * @param userName value to be assigned to property userName
        */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
        * Getter method for property <tt>sex</tt>.
        * 
        * @return property value of sex
        */
    public String getSex() {
        return sex;
    }

    /**
        * Setter method for property <tt>sex</tt>.
        * 
        * @param sex value to be assigned to property sex
        */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
        * Getter method for property <tt>age</tt>.
        * 
        * @return property value of age
        */
    public String getAge() {
        return age;
    }

    /**
        * Setter method for property <tt>age</tt>.
        * 
        * @param age value to be assigned to property age
        */
    public void setAge(String age) {
        this.age = age;
    }

    /**
        * Getter method for property <tt>joinDate</tt>.
        * 
        * @return property value of joinDate
        */
    public String getJoinDate() {
        return joinDate;
    }

    /**
        * Setter method for property <tt>joinDate</tt>.
        * 
        * @param joinDate value to be assigned to property joinDate
        */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    /**
        * Getter method for property <tt>readingBook</tt>.
        * 
        * @return property value of readingBook
        */
    public List<String> getReadingBook() {
        return readingBook;
    }

    /**
        * Setter method for property <tt>readingBook</tt>.
        * 
        * @param readingBook value to be assigned to property readingBook
        */
    public void setReadingBook(List<String> readingBook) {
        this.readingBook = readingBook;
    }

    /**
        * Getter method for property <tt>wantBook</tt>.
        * 
        * @return property value of wantBook
        */
    public List<String> getWantBook() {
        return wantBook;
    }

    /**
        * Setter method for property <tt>wantBook</tt>.
        * 
        * @param wantBook value to be assigned to property wantBook
        */
    public void setWantBook(List<String> wantBook) {
        this.wantBook = wantBook;
    }

    /**
        * Getter method for property <tt>watchedMovie</tt>.
        * 
        * @return property value of watchedMovie
        */
    public List<String> getWatchedMovie() {
        return watchedMovie;
    }

    /**
        * Setter method for property <tt>watchedMovie</tt>.
        * 
        * @param watchedMovie value to be assigned to property watchedMovie
        */
    public void setWatchedMovie(List<String> watchedMovie) {
        this.watchedMovie = watchedMovie;
    }

    /**
        * Getter method for property <tt>wantMovie</tt>.
        * 
        * @return property value of wantMovie
        */
    public List<String> getWantMovie() {
        return wantMovie;
    }

    /**
        * Setter method for property <tt>wantMovie</tt>.
        * 
        * @param wantMovie value to be assigned to property wantMovie
        */
    public void setWantMovie(List<String> wantMovie) {
        this.wantMovie = wantMovie;
    }

    /**
        * Getter method for property <tt>listeningMusic</tt>.
        * 
        * @return property value of listeningMusic
        */
    public List<String> getListeningMusic() {
        return listeningMusic;
    }

    /**
        * Setter method for property <tt>listeningMusic</tt>.
        * 
        * @param listeningMusic value to be assigned to property listeningMusic
        */
    public void setListeningMusic(List<String> listeningMusic) {
        this.listeningMusic = listeningMusic;
    }

    /**
        * Getter method for property <tt>wantMusic</tt>.
        * 
        * @return property value of wantMusic
        */
    public List<String> getWantMusic() {
        return wantMusic;
    }

    /**
        * Setter method for property <tt>wantMusic</tt>.
        * 
        * @param wantMusic value to be assigned to property wantMusic
        */
    public void setWantMusic(List<String> wantMusic) {
        this.wantMusic = wantMusic;
    }

    /**
        * Getter method for property <tt>oftenGroup</tt>.
        * 
        * @return property value of oftenGroup
        */
    public List<String> getOftenGroup() {
        return oftenGroup;
    }

    /**
        * Setter method for property <tt>oftenGroup</tt>.
        * 
        * @param oftenGroup value to be assigned to property oftenGroup
        */
    public void setOftenGroup(List<String> oftenGroup) {
        this.oftenGroup = oftenGroup;
    }

    /**
        * Getter method for property <tt>fellowPeopleNum</tt>.
        * 
        * @return property value of fellowPeopleNum
        */
    public String getFellowPeopleNum() {
        return fellowPeopleNum;
    }

    /**
        * Setter method for property <tt>fellowPeopleNum</tt>.
        * 
        * @param fellowPeopleNum value to be assigned to property fellowPeopleNum
        */
    public void setFellowPeopleNum(String fellowPeopleNum) {
        this.fellowPeopleNum = fellowPeopleNum;
    }

    /**
        * Getter method for property <tt>fellowedPeopleNum</tt>.
        * 
        * @return property value of fellowedPeopleNum
        */
    public String getFellowedPeopleNum() {
        return fellowedPeopleNum;
    }

    /**
        * Setter method for property <tt>fellowedPeopleNum</tt>.
        * 
        * @param fellowedPeopleNum value to be assigned to property fellowedPeopleNum
        */
    public void setFellowedPeopleNum(String fellowedPeopleNum) {
        this.fellowedPeopleNum = fellowedPeopleNum;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfo [userId=" + userId + ", homePageUrl=" + homePageUrl + ", userName="
               + userName + ", sex=" + sex + ", age=" + age + ", joinDate=" + joinDate
               + ", readingBook=" + readingBook + ", wantBook=" + wantBook + ", watchedMovie="
               + watchedMovie + ", wantMovie=" + wantMovie + ", listeningMusic=" + listeningMusic
               + ", wantMusic=" + wantMusic + ", oftenGroup=" + oftenGroup + ", fellowPeopleNum="
               + fellowPeopleNum + ", fellowedPeopleNum=" + fellowedPeopleNum + "]";
    }
    
}
