package com.lipop.Interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.sun.net.httpserver.Authenticator.Success;

public class UserInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("初始化");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object>session = invocation.getInvocationContext().getSession();
		Object currentUser = session.get("user");
		String result = null;
		if (currentUser!=null) {
			result = invocation.invoke();
		}else{
			HttpServletRequest request = (HttpServletRequest)invocation.getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
			String error = "用户名或密码错误，请重新<a href='index.jsp'>登录</a>";
			request.setAttribute("error", error);
			return "error";
		}
			return result;
		
	}

}
