<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2017/7/26
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    欢迎[${requestScope.user.username}]登录
    <hr>
    <h3>访问FormController类中@ModelAttribute注解的对象:${requestScope.loginname}</h3>
<br>
</body>
</html>
