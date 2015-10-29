/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoUserWatchedMovieDO.java,v 0.1 2015年9月17日 下午5:59:26 alps Exp $
 */
public class PersonInfoUserWatchedMovieDO {
    /** user id **/
    private String       userId;
    /** 看过的电影 */
    private String watchedMovie;

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
        * Getter method for property <tt>watchedMovie</tt>.
        * 
        * @return property value of watchedMovie
        */
    public String getWatchedMovie() {
        return watchedMovie;
    }

    /**
        * Setter method for property <tt>watchedMovie</tt>.
        * 
        * @param watchedMovie value to be assigned to property watchedMovie
        */
    public void setWatchedMovie(String watchedMovie) {
        this.watchedMovie = watchedMovie;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoUserWatchedMovieDO [userId=" + userId + ", watchedMovie=" + watchedMovie
               + "]";
    }


}
