package com.lipop.action;

import com.lipop.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("��ʼ���ѧ��");
		Thread.sleep(2000);
		System.out.println("��ӳɹ���"+user.getUserName());
		return SUCCESS;
	}

}
