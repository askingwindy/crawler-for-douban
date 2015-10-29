/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;

/**
 * @author alps
 * @version $Id: PersonInfoUserDO.java,v 0.1 2015��9��17�� ����5:40:54 alps Exp $
 */
public class PersonInfoUserDO {
    /** �û�ΨһID */
    private String userId;

    /** �û���ҳurl */
    private String homePageUrl;

    /** �û��� */
    private String userName;

    /** �Ա� */
    private String sex;

    /** ���� */
    private String age;

    /** ���붹��ʱ�� */
    private String joinDate;

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
        return "PersonInfoUserDO [userId=" + userId + ", homePageUrl=" + homePageUrl
               + ", userName=" + userName + ", sex=" + sex + ", age=" + age + ", joinDate="
               + joinDate + ", fellowPeopleNum=" + fellowPeopleNum + ", fellowedPeopleNum="
               + fellowedPeopleNum + "]";
    }

}
