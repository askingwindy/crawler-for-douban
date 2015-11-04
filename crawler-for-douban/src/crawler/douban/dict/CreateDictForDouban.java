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
	 * �ļ����ɵ����ָ�����Ĭ��Ϊ10M:1000*1000*10
	 */
	private final static int FILE_SIZE = 1000*1000*10;

    /**
     * �ֵ�
     */
    private EngWord engWord;
    
    /**
     * ������ļ�
     */
    private File outputFile;
    
    /**
     * д���ļ���wirter
     */
    private Writer writer;
    
    /**
     * ������ļ���
     */
    private String fileName ;
    
    /**
     * ��������ֱ��
     */
    private Integer fileNo;
    
    /**
     * ����ļ�����Ե�ַ,Ĭ���Ǳ����̸�Ŀ¼�µ�src�µ�resource
     */
    private String fileRoute = ".\\src\\resource\\";
    
    /**
     * �ļ���0��ʼ���
     */
    private int fileCount = 0;
    
    /**
     * ���췽��
     */
    public CreateDictForDouban(){
    	engWord = new EngWord();
    }
    
    /**
     * ��ʼ���ļ�,writer
     */
    public void init(String fileName, Integer fileNo){
    	this.fileName = fileName;
    	this.fileNo = fileNo;
    	
    	buildFile();
    		
    }
    
    
    /**
     * ������file
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
     * �õ���һ��fileNo
     * @return
     */
    private Integer getNextFileNo(){
    	this.fileNo += 1;
    	return this.fileNo;
    }
    

    /**
     * д�ֵ�
     * @param writer
     * @param startLength ���������ֵĿ�ʼ���� ���Ϊ1����ô�ӳ���Ϊ1��ʼ
     * @param nameLength ���������ֵĳ���
     */
    public void algCreateDict(Integer startLength, Integer nameLength){
    	if(startLength < 1){
    		startLength = 1;
    	}
    	String[] engWord = this.engWord.getAplha();
    	StringBuilder sb = new StringBuilder();
    	
    	helper(startLength, nameLength, sb,  engWord);
    	
    	try {
    		//�رմ򿪵���
			this.writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    /**
     * �����ֵ丨���㷨�����õݹ�õ�����
     * @param startLength ���������ֵĿ�ʼ���� ���Ϊ1����ô�ӳ���Ϊ1��ʼ
     * @param nameLength ���������ֵĳ���
     * @param rst
     * @param engWord
     */
    private void helper(Integer startLength, Integer nameLength,
    		StringBuilder rst, 
    		String[] engWord){
    	//��Ҫ�Ƚ�rst�ĳ����Ƿ�<���������ֳ���
    	//��Ϊ��append�������������������4��rst������4����ôrst����Ҫ��append(����rst���Ⱦͱ�Ϊ5��)
    	if(rst.length()>=  nameLength){
    		return;
    	}
    	
    	for(int i=0; i<engWord.length; i++){
    		rst.append(engWord[i]);
    		//���rst�ĳ���>=�������ֵĿ�ʼ���ȣ���ôд�뵽�ļ���
    		if(rst.length() >= startLength){
    			    		
	    		writeInFile(rst.toString());
	    		
	    		//����ļ����ָ����������ڴ�ֵ����ô���´�һ���µ��ļ�
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
     * д���ַ���
     * @param name
     */
    private void writeInFile(String name){
    	try {
    		//�ļ������ּ���
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
		create.algCreateDict(4, 4);//���ΪAAAA...zzzz
	}
    
    
    
    
}
