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
		System.out.println("����");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��");
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
			String error = "�û������������������<a href='index.jsp'>��¼</a>";
			request.setAttribute("error", error);
			return "error";
		}
			return result;
		
	}

}
