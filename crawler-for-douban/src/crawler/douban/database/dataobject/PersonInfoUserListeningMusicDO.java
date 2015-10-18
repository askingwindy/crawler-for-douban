/**
 * Alps Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.database.dataobject;


/**
 * @author alps
 * @version $Id: PersonInfoUserListeningMusicDO.java,v 0.1 2015年9月17日 下午5:49:38 alps Exp $
 */
public class PersonInfoUserListeningMusicDO {
    /** user id **/
    private String       userId;

    /** 正在听的歌 */
    private String listeningMusic;

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
        * Getter method for property <tt>listeningMusic</tt>.
        * 
        * @return property value of listeningMusic
        */
    public String getListeningMusic() {
        return listeningMusic;
    }

    /**
        * Setter method for property <tt>listeningMusic</tt>.
        * 
        * @param listeningMusic value to be assigned to property listeningMusic
        */
    public void setListeningMusic(String listeningMusic) {
        this.listeningMusic = listeningMusic;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PersonInfoUserListeningMusicDO [userId=" + userId + ", listeningMusic="
               + listeningMusic + "]";
    }


}
