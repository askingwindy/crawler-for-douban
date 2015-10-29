/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.crawler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is a Utils class for use
 * @author alps
 * @version $Id: UtilsMethod.java,v 0.1 2015年9月11日 下午9:50:14 alps Exp $
 */
public class UtilsMethod {
    /**
     * find the first match regular expression string in input
     * if not exist return null
     * 
     * @param regx
     * @param input
     * @return
     */
    public static String findFirstStringByRegex(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        if (match.find()) {
            return match.group();
        } else {
            return null;
        }
    }
}
