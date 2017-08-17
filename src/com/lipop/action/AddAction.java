package com.lipop.action;

import java.util.List;

import com.lipop.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<User> userList;
	
	

	

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public String execute() throws Exception {
		for (User user : userList) {
			System.out.println(user);
		}
		return null;
	}

}
