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
    欢迎[${requestScope.user.username}]登录<br>
    访问request作用范围域中的user对象:[${requestScope.user.username}]<br>
    访问session作用范围域中的user对象:[${sessionScope.user.username}]<br>
<br>
</body>
</html>