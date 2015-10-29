/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoUserWantBookDO.java,v 0.1 2015年9月17日 下午5:58:16 alps Exp $
 */
public class PersonInfoUserWantBookDO {
    /** user id **/
    private String       userId;
    /** 想要读的书 */
    private String wantBook;

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
        * Getter method for property <tt>wantBook</tt>.
        * 
        * @return property value of wantBook
        */
    public String getWantBook() {
        return wantBook;
    }

    /**
        * Setter method for property <tt>wantBook</tt>.
        * 
        * @param wantBook value to be assigned to property wantBook
        */
    public void setWantBook(String wantBook) {
        this.wantBook = wantBook;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoUserWantBookDO [userId=" + userId + ", wantBook=" + wantBook + "]";
    }


}
