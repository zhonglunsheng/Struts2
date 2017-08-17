package com.lipop.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.lipop.model.User;
import com.lipop.service.UserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private UserService userService = new UserService();
	private String error;
	
	
	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		if (userService.userLogin(user)) {
			ActionContext actionContext=ActionContext.getContext();
			Map<String, Object>session = actionContext.getSession();
			session.put("user", user);
			return SUCCESS;
		}else{
			error="用户名或密码错误";
			return ERROR;
		}
	}

}
