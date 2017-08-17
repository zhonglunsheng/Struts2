package com.lipop.action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class DownAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fileName;
	


	public String getFileName() throws UnsupportedEncodingException {
		fileName = new String(fileName.getBytes(), "ISO8859-1");
		return fileName;
	}



	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	/*public InputStream getInputStream() throws FileNotFoundException{
		File file = new File("F:/天下第一美人.jpg");
		this.fileName="美女.jpg";
		return new FileInputStream(file);
	}*/
	
	public InputStream getInputStream()throws Exception{
		File file=new File("F:/天下第一美人.jpg");
		this.fileName="美女1号.jpg";
		return new FileInputStream(file);
	}


}
