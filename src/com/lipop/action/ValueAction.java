package com.lipop.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lipop.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueAction extends ActionSupport{



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User("СU","aaa");
	private List<User> userList = new ArrayList<User>();
	private Map<String, User> map = new HashMap<String,User>();
	
	
	

	public List<User> getUserList() {
		return userList;
	}



	public void setUserList(List<User> userList) {
		this.userList = userList;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Map<String, User> getMap() {
		return map;
	}



	public void setMap(Map<String, User> map) {
		this.map = map;
	}



	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		ValueStack valueStack = actionContext.getValueStack();
		Map<String, Object> v = valueStack.getContext();
		v.put("name", "����");
		
		Map<String, Object> session = actionContext.getSession();
		session.put("name", "����");
		
		Map<String, Object> application = actionContext.getApplication();
		application.put("name", "����");
		
		userList.add(new User("С��", "111"));
		
		map.put("Сm", new User("M","123456"));
		return SUCCESS;
		
		
	}

}
