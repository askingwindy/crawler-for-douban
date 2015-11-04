/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */


package crawler.douban.dict;

import java.util.Arrays;

/**
 * @author alps
 * @version $Id: EngWord.java,v 0.1 2015��8��11�� ����8:43:01 alps Exp $
 */
public class EngWord {
    /**
     * �ֵ��С���ֵ䲻���ִ�Сд��
     */
    private static final int DICT_SIZE = 26;
    /**
     * �ֵ俪ʼ������ĸ
     */
    private static final char START_CHAR = 'a';
    
    /**
     * �ֵ�
     */
    private String[] aplha = new String[DICT_SIZE];
    
    
    /**
     * constructor for EngWord
     */
    public EngWord(){
        int i = 0;
        for(; i < 26; i++){
            aplha[i] = Character.toString ((char) (EngWord.START_CHAR+i));
        }
    }
    
    /**
     * 
     * ����һ��char���ҵ������ֵ��е�λ��
     * @param character
     * @return
     */
    public Integer getIndex(Character character){
    	int rst = 0;
    	for(int i=0; i<aplha.length; i++){
    		if(aplha[i].equals(character.toString())){
    			rst = i;
    			break;
    		}
    	}
    	return rst;
    }
    
    /**
     * �õ��ֵ�ĳ���
     * @return
     */
    public Integer getDictLength(){
    	return this.aplha.length;
    }
    
    /**
     * �õ��ֵ������ĸ
     * @return
     */
    public char getFirstOriginChar(){
    	return EngWord.START_CHAR;
    }
    
    /**
     * ���aplha��ĳ��ֵ
     * @param num
     * @return
     */
    public String getElement(Integer num){
        return aplha[num];
    }

    /**
        * Getter method for property <tt>aplha</tt>.
        * 
        * @return property value of aplha
        */
    public String[] getAplha() {
        return aplha;
    }

    /**
        * Setter method for property <tt>aplha</tt>.
        * 
        * @param aplha value to be assigned to property aplha
        */
    public void setAplha(String[] aplha) {
        this.aplha = aplha;
    }

    /**
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EngWord [aplha=" + Arrays.toString(aplha) + "]";
    }
    
}
