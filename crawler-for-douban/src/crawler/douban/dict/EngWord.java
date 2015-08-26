package crawler.douban.dict;

import java.util.Arrays;

/**
 * @author alps
 * @version $Id: EngWord.java,v 0.1 2015年8月11日 下午8:43:01 alps Exp $
 */
public class EngWord {
    private String[] aplha = new String[52];
    
    /**
     * constructor for EngWord
     */
    public EngWord(){
        int i = 0;
        for(; i < 26; i++){
            aplha[i] = Character.toString ((char) ('A'+i));
        }
        for(;i < 52;i++){
            aplha[i] = Character.toString((char)('a'-26+i));
        }
    }
    
    /**
     * 获得aplha的某个值
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
