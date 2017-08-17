<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html lang="zh">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
</head>
<body>
<form action="add" method="post">
<h1>添加账号和密码</h1>
账号：<input type="text" name="userList[0].userName"/>
密码：<input type="password" name="userList[0].password"/><br />
账号：<input type="text" name="userList[1].userName"/>
密码：<input type="password" name="userList[1].password"/><br />
账号：<input type="text" name="userList[2].userName"/>
密码：<input type="password" name="userList[2].password"/><br />
<input type="submit" value="添加">
</form>
</body>
</html>