/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoWantMovieDO.java,v 0.1 2015年9月17日 下午6:00:21 alps Exp $
 */
public class PersonInfoUserWantMovieDO {
    /** user id **/
    private String       userId;
    /** 想看的电影 */
    private String wantMovie;

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
        * Getter method for property <tt>wantMovie</tt>.
        * 
        * @return property value of wantMovie
        */
    public String getWantMovie() {
        return wantMovie;
    }

    /**
        * Setter method for property <tt>wantMovie</tt>.
        * 
        * @param wantMovie value to be assigned to property wantMovie
        */
    public void setWantMovie(String wantMovie) {
        this.wantMovie = wantMovie;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoWantMovieDO [userId=" + userId + ", wantMovie=" + wantMovie + "]";
    }


}
