/**
 * Alps and AskingWindy
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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
     * Connect to mysql
     */
    Connection con;
    /**
     * statement for mysql
     */
    Statement  stmt;

    DateFormat dateFormat; ;
    /**
     * constructer for log
     */
    public Log4Crawler() {
        super();
        try {
            // there should do some thing to catch the exception
            stmt = connectDatabase();
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,
            Locale.CHINA);
    }

    private Statement connectDatabase() throws InstantiationException, IllegalAccessException,
                                       ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver").newInstance(); //MYSQL驱动
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tongji", "chen",
            "chenfushan");
        stmt = con.createStatement(); //创建声明
        return stmt;
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
        int logLevel = 1;
        String formatDate = dateFormat.format(date);
        String sql = "insert into crawler_log(log_content, log_date, log_level) values('"
                     + logContent + "','" + formatDate + "', '" + logLevel + "')";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("insert info log error! log content -" + sql + "-" + date);
        }
    }

    /**
     * this log is for debug
     * @param logContent
     */
    public void debugLog(String logContent) {
        this.date = new Date();
        int logLevel = 2;
        String formatDate = dateFormat.format(date);
        String sql = "insert into crawler_log(log_content, log_date, log_level) values('"
                     + logContent + "','" + formatDate + "', '" + logLevel + "')";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("insert debug log error! log content -" + logContent + "-" + date);
        }
    }

    /**
     * this is a log when warn action
     * @param logContent
     */
    public void warnLog(String logContent) {
        this.date = new Date();
        int logLevel = 3;
        String formatDate = dateFormat.format(date);
        String sql = "insert into crawler_log(log_content, log_date, log_level) values('"
                     + logContent + "','" + formatDate + "', '" + logLevel + "')";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("insert warn log error! log content -" + logContent + "-" + date);
        }
    }

    /**
     * this log is for error happen
     * @param logContent
     */
    public void errorLog(String logContent) {
        this.date = new Date();
        int logLevel = 4;
        String formatDate = dateFormat.format(date);
        String sql = "insert into crawler_log(log_content, log_date, log_level) values('"
                     + logContent + "','" + formatDate + "', '" + logLevel + "')";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("insert error log error! log content -" + logContent + "-" + date);
        }
    }

}
