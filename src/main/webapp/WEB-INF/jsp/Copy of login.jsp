<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/loginSubmit.action" method="post">
用户账号：<input type="text" name="userId"/><br/>
密码：<input type="text" name="pwd"/><br/>
<input type="submit" value="登录"/>
</form>
</body>
</html>