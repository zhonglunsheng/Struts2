package com.lipop.action;

import com.opensymphony.xwork2.ActionSupport;

public class HobbyAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] hobby;
	private String flag;
	
	

	public String getFlag() {
		return flag;
	}


	public void setFlag(String flag) {
		this.flag = flag;
	}


	public String[] getHobby() {
		return hobby;
	}


	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}


	@Override
	public String execute() throws Exception {
		if (!(hobby==null)) {
			for (String h : hobby) {
				System.out.println(h);
			}
			return SUCCESS;
		}else{
			flag="hobbyΪ�գ���ָ���쳣����";
			return "msg";
		}
	}
	
	public String show(){
		flag="��Ȥ��ʾ";
		return SUCCESS;
	}

}
