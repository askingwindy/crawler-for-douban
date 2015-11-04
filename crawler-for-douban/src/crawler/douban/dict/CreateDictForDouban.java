/**
 * Alps and AskingWindy Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */

package crawler.douban.dict;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CreateDictForDouban {
	
	/**
	 * 文件容纳的名字个数（默认为10M:1000*1000*10
	 */
	private final static int FILE_SIZE = 1000*1000*10;

    /**
     * 字典
     */
    private EngWord engWord;
    
    /**
     * 输出的文件
     */
    private File outputFile;
    
    /**
     * 写入文件的wirter
     */
    private Writer writer;
    
    /**
     * 输出的文件名
     */
    private String fileName ;
    
    /**
     * 输出的文字编号
     */
    private Integer fileNo;
    
    /**
     * 输出文件的相对地址,默认是本工程根目录下的src下的resource
     */
    private String fileRoute = ".\\src\\resource\\";
    
    /**
     * 文件从0开始编号
     */
    private int fileCount = 0;
    
    /**
     * 构造方法
     */
    public CreateDictForDouban(){
    	engWord = new EngWord();
    }
    
    /**
     * 初始化文件,writer
     */
    public void init(String fileName, Integer fileNo){
    	this.fileName = fileName;
    	this.fileNo = fileNo;
    	
    	buildFile();
    		
    }
    
    
    /**
     * 构建立file
     */
    private void buildFile(){

    	this.outputFile = new File(fileRoute+this.fileName+this.fileNo+".data");
    	try {
			this.writer = new FileWriter(outputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * 得到下一个fileNo
     * @return
     */
    private Integer getNextFileNo(){
    	this.fileNo += 1;
    	return this.fileNo;
    }
    

    /**
     * 写字典
     * @param writer
     * @param startLength 期望的名字的开始长度 如果为1，那么从长度为1开始
     * @param nameLength 期望的名字的长度
     */
    public void algCreateDict(Integer startLength, Integer nameLength){
    	if(startLength < 1){
    		startLength = 1;
    	}
    	String[] engWord = this.engWord.getAplha();
    	StringBuilder sb = new StringBuilder();
    	
    	helper(startLength, nameLength, sb,  engWord);
    	
    	try {
    		//关闭打开的流
			this.writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    /**
     * 构造字典辅助算法，利用递归得到名字
     * @param startLength 期望的名字的开始长度 如果为1，那么从长度为1开始
     * @param nameLength 期望的名字的长度
     * @param rst
     * @param engWord
     */
    private void helper(Integer startLength, Integer nameLength,
    		StringBuilder rst, 
    		String[] engWord){
    	//需要比较rst的长度是否<期望的名字长度
    	//因为是append操作，如果期望长度是4，rst长度是4，那么rst不需要再append(这样rst长度就变为5了)
    	if(rst.length()>=  nameLength){
    		return;
    	}
    	
    	for(int i=0; i<engWord.length; i++){
    		rst.append(engWord[i]);
    		//如果rst的长度>=期望名字的开始长度，那么写入到文件中
    		if(rst.length() >= startLength){
    			    		
	    		writeInFile(rst.toString());
	    		
	    		//如果文件名字个数超过了期待值，那么重新打开一个新的文件
	    		if(fileCount >= FILE_SIZE){
	    			this.fileCount = 0;
	    			this.getNextFileNo();
	    			
	    			this.buildFile();
	    		}
    		}
    		
    		helper(startLength, nameLength, rst, engWord);
    		rst.deleteCharAt(rst.length()-1);
    	}
    }
    
    /**
     * 写入字符串
     * @param name
     */
    private void writeInFile(String name){
    	try {
    		//文件中名字计数
    		this.fileCount += 1;
			this.writer.write(name);
			this.writer.write("\n");
			this.writer.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    }



    public EngWord getEngWord() {
        return engWord;
    }


	public void setOutputFile(File outputFile) {
		this.outputFile = outputFile;
	}

	public Writer getWriter() {
		return writer;
	}


	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getFileNo() {
		return fileNo;
	}

	public void setFileNo(Integer fileNo) {
		this.fileNo = fileNo;
	}
	
	public static void main(String[] args){
		CreateDictForDouban create = new CreateDictForDouban();
		create.init("test", 0);
		create.algCreateDict(4, 4);//输出为AAAA...zzzz
	}
    
    
    
    
}
