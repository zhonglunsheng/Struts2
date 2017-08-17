<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="zh">
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
</head>
<body>
<h1>用户添加</h1>
<form action="student" method="post">
<s:token></s:token>
账号：<input type="text" name="user.userName"><br/>
密码：<input type="password" name="user.password"><br />
<input type="submit" value="添加">
</form>
</body>
</html>