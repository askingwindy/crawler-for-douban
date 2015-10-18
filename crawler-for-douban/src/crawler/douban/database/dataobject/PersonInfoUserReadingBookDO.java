/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoUserReadingBook.java,v 0.1 2015年9月17日 下午5:56:53 alps Exp $
 */
public class PersonInfoUserReadingBookDO {

    /** user id **/
    private String       userId;
    /** 正在读的书列表 */
    private String readingBook;

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
        * Getter method for property <tt>readingBook</tt>.
        * 
        * @return property value of readingBook
        */
    public String getReadingBook() {
        return readingBook;
    }

    /**
        * Setter method for property <tt>readingBook</tt>.
        * 
        * @param readingBook value to be assigned to property readingBook
        */
    public void setReadingBook(String readingBook) {
        this.readingBook = readingBook;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoUserReadingBookDO [userId=" + userId + ", readingBook=" + readingBook
               + "]";
    }


}
