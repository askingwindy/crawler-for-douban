/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */

package crawler.douban.user;

import crawler.douban.dict.EngWord;



/**
 * @author hry
 *
 * �������ֵĹ�����
 */
public class UserGeneratorUtil {
	private UserGeneratorUtil(){}
	
	/**
	 * �õ���һ�����ֵ��㷨
	 * A����һ������:B
	 * Z����һ��������AA
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
	 * ������ת��Ϊ��ĸ
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
	 * ��nameת��Ϊһ�����к�
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
	 * ��char�ַ�ת��Ϊ����
	 * ��1��ʼ����
	 * dict.getFirstOriginChar()=='A'
	 * �õ�'a'-'A'+1�����
	 * 
	 * @param c
	 * @return
	 */
	private static Integer getInt(EngWord dict, char c){
		int res = c-dict.getFirstOriginChar()+1;
		return res;
	}
	
	
	/**
	 * ����ת��Ϊchar
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
