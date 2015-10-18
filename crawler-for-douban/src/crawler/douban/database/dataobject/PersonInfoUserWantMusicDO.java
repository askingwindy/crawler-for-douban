/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoUserWantMusic.java,v 0.1 2015年9月17日 下午5:55:03 alps Exp $
 */
public class PersonInfoUserWantMusicDO {
    /** user id **/
    private String       userId;
    /** 想要听的歌 */
    private String wantMusic;

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
        * Getter method for property <tt>wantMusic</tt>.
        * 
        * @return property value of wantMusic
        */
    public String getWantMusic() {
        return wantMusic;
    }

    /**
        * Setter method for property <tt>wantMusic</tt>.
        * 
        * @param wantMusic value to be assigned to property wantMusic
        */
    public void setWantMusic(String wantMusic) {
        this.wantMusic = wantMusic;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoUserWantMusicDO [userId=" + userId + ", wantMusic=" + wantMusic + "]";
    }


}
