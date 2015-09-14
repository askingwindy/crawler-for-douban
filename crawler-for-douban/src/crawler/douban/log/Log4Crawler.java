/**
 * Alps and AskingWindy
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.log;

import java.util.Date;

/**
 * @author alps
 * @version $Id: Log4Crawler.java,v 0.1 2015年9月11日 下午4:34:03 alps Exp $
 */
public class Log4Crawler {
    /**
     * the log content
     */
    String logContent;

    /**
     * log create time
     */
    Date   date;

    /**
     * constructer for log
     */
    public Log4Crawler() {
        super();
    }

    /**
        * Getter method for property <tt>logContent</tt>.
        * 
        * @return property value of logContent
        */
    public String getLogContent() {
        return logContent;
    }

    /**
        * Setter method for property <tt>logContent</tt>.
        * 
        * @param logContent value to be assigned to property logContent
        */
    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    /**
        * Getter method for property <tt>date</tt>.
        * 
        * @return property value of date
        */
    public Date getDate() {
        return date;
    }

    /**
        * Setter method for property <tt>date</tt>.
        * 
        * @param date value to be assigned to property date
        */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * information log function for log to database
     * @param logContent
     */
    public void infoLog(String logContent) {
        this.date = new Date();
        System.out.println(logContent + "-" + date);
    }

    /**
     * this log is for debug
     * @param logContent
     */
    public void debugLog(String logContent) {

    }

    /**
     * this is a log when warn action
     * @param logContent
     */
    public void warnLog(String logContent) {

    }

    /**
     * this log is for error happen
     * @param logContent
     */
    public void errorLog(String logContent) {

    }

}
