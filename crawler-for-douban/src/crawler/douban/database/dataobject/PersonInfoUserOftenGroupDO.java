/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoUserOftenGroup.java,v 0.1 2015年9月17日 下午6:01:16 alps Exp $
 */
public class PersonInfoUserOftenGroupDO {

    /** user id **/
    private String       userId;

    /** 经常去的小组 */
    private String oftenGroup;

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
        * Getter method for property <tt>oftenGroup</tt>.
        * 
        * @return property value of oftenGroup
        */
    public String getOftenGroup() {
        return oftenGroup;
    }

    /**
        * Setter method for property <tt>oftenGroup</tt>.
        * 
        * @param oftenGroup value to be assigned to property oftenGroup
        */
    public void setOftenGroup(String oftenGroup) {
        this.oftenGroup = oftenGroup;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoUserOftenGroupDO [userId=" + userId + ", oftenGroup=" + oftenGroup + "]";
    }


}
