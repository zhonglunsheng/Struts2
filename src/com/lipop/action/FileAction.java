package com.lipop.action;


import java.io.File;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File image;
	private String imageFilesName;
	private String imageContentType;
	
	

	public File getImage() {
		return image;
	}



	public void setImage(File image) {
		this.image = image;
	}



	public String getImageFileName() {
		return imageFilesName;
	}



	public void setImageFileName(String imageFileName) {
		this.imageFilesName = imageFileName;
	}



	public String getImageContentType() {
		return imageContentType;
	}



	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}



	@Override
	public String execute() throws Exception {
		System.out.println("文件名："+imageFilesName);
		System.out.println("文件类型："+imageContentType);
		String filePath = "F:/"+imageFilesName;
		File file = new File(filePath);
		FileUtils.copyFile(image, file);
		return SUCCESS;
	}

}
