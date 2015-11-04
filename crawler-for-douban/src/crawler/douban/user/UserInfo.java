/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package crawler.douban.user;

import crawler.douban.dict.EngWord;



/**
 * @author hry
 *
 */
public class UserInfo {
	
	
	private static String curName = "";
	
	private static EngWord dict = new EngWord();
	
	/**
	 * 得到当前的名字
	 * @return
	 */
	public static String getCurName(){
		return UserInfo.curName;
	}
	
	/**
	 * 得到下一个名字
	 * @return
	 */
	public static String getNextName(){
		UserInfo.curName = UserGeneratorUtil.findNameAlgorithm(dict, UserInfo.curName);
		return UserInfo.curName;
	}
	
	/**
	 * 得到name的下一个名字，同时将curName赋予name
	 * @param name
	 * @return
	 */
	public static String getNextName(String name){
		UserInfo.curName = name.toLowerCase();
		UserInfo.curName = UserGeneratorUtil.findNameAlgorithm(dict, UserInfo.curName);
		return UserInfo.curName;
	}
	
	/**
	 * 测试main方法
	 * @param args
	 */
	public static void main(String[] args){
		while(true){
			System.out.println(UserInfo.getNextName());
		}
		
	}
}
