/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */

package crawler.douban.user;

import crawler.douban.dict.EngWord;



/**
 * @author hry
 *
 * 产生名字的工具类
 */
public class UserGeneratorUtil {
	private UserGeneratorUtil(){}
	
	/**
	 * 得到下一个名字的算法
	 * A的下一个名字:B
	 * Z的下一个名字是AA
	 * 
	 * @param dict
	 * @param name
	 * @return
	 */
	public static String findNameAlgorithm(EngWord dict, String name){

		
		int number = UserGeneratorUtil.nameToNumber(dict, name);
		
		String rst = UserGeneratorUtil.numberToName(dict, number+1);
		
		return rst;
	}
	
	/**
	 * 1->A
	 * 2->B
	 * ...
	 * 26->Z
	 * 27->a
	 * ..
	 * 52->z
	 * 53->AA
	 * 
	 * 将数字转化为字母
	 * 
	 * @param dict
	 * @param number
	 * @return
	 */
	public static String numberToName(EngWord dict ,Integer number){
		if(number == 0){
			return "";
		}
		int r = (number-1)%dict.getDictLength();
		char c = UserGeneratorUtil.toStr(dict, r);
		return numberToName(dict, (number-r)/dict.getDictLength())+c;
	}

	
	/**
	 * 将name转化为一个序列号
	 * A->1
	 * B->2
	 * ...
	 * Z->26
	 * a->27
	 * ...
	 * AA->53
	 * 
	 * @param dict
	 * @param name
	 * @return
	 */
	public static Integer nameToNumber(EngWord dict ,String name){
		if(name==null || name.length()==0) {
			return 0;
		}
		
		char[] array = name.toCharArray();
		
		int res = 0;
		
		for(int i=0; i<array.length; i++){
			int temp = UserGeneratorUtil.getInt(dict, array[i]);
			res = res*dict.getDictLength()+temp;
		}
		return res;
	}
	
	/**
	 * 
	 * 将char字符转化为数字
	 * 从1开始计数
	 * dict.getFirstOriginChar()=='A'
	 * 得到'a'-'A'+1的序号
	 * 
	 * @param c
	 * @return
	 */
	private static Integer getInt(EngWord dict, char c){
		int res = c-dict.getFirstOriginChar()+1;
		return res;
	}
	
	
	/**
	 * 数字转化为char
	 * dict.getFirstOriginChar()=='A'
	 * 
	 * @param dict
	 * @param num
	 * @return
	 */
	private static char toStr(EngWord dict, Integer num){
		return (char)(num+dict.getFirstOriginChar());
	}
}
