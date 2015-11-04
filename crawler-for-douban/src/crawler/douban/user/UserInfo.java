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
	 * �õ���ǰ������
	 * @return
	 */
	public static String getCurName(){
		return UserInfo.curName;
	}
	
	/**
	 * �õ���һ������
	 * @return
	 */
	public static String getNextName(){
		UserInfo.curName = UserGeneratorUtil.findNameAlgorithm(dict, UserInfo.curName);
		return UserInfo.curName;
	}
	
	/**
	 * �õ�name����һ�����֣�ͬʱ��curName����name
	 * @param name
	 * @return
	 */
	public static String getNextName(String name){
		UserInfo.curName = name.toLowerCase();
		UserInfo.curName = UserGeneratorUtil.findNameAlgorithm(dict, UserInfo.curName);
		return UserInfo.curName;
	}
	
	/**
	 * ����main����
	 * @param args
	 */
	public static void main(String[] args){
		while(true){
			System.out.println(UserInfo.getNextName());
		}
		
	}
}
