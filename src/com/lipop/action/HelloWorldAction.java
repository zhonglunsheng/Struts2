package com.lipop.action;

import com.lipop.model.User;
import com.lipop.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	private String flag;
	
	
	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	UserService userService = new UserService();

	public String c(){
		return "chain";
	}
	
	public String rc(){
		return "rc";
	}
	@Override
	public String execute() throws Exception {
		if (userService.userLogin(user)) {
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
