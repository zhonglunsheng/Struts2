<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="zh">
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<%
	request.setAttribute("name", "小傻逼啊");
%>
</head>
<body>
ValueStrack数据：<s:property value="name"/><br />
#parameters <s:property value="#parameters.name"/><br />
#request <s:property value="#request.name"/><br />
#session <s:property value="#session.name"/><br />
#application <s:property value="#application.name"/><br />
#attr <s:property value="#attr.name"/>

javaBean:<s:property value="user.userName"/>
集合：<s:property value="userList[0].userName"/>
map：<s:property value="map['小m'].userName"/>

靜態成員：<s:property value="@com.lipop.common.StaticData@userName"/><br/>
靜態方法：<s:property value="@com.lipop.common.StaticData@show()"/><br/>
</body>
</html>