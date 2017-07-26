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
    欢迎[${requestScope.user.username}]登录<br><br>
    访问request作用范围域中的user对象:[${requestScope.user.username}]<br><br>
    访问session作用范围域中的user对象:[${sessionScope.user.username}]<br><br>
    <br>
    <hr>
    欢迎访问ModelAttribute1Controller类跳转来的，request作用域中的loginname${requestScope.loginname}<br><br>
    <hr>
    欢迎访问ModelAttribute2Controller类跳转来的，request作用域中的loginname=${requestScope.loginname}<br><br>
    欢迎访问ModelAttribute2Controller类跳转来的，request作用域中的password=${requestScope.password}<br><br>
    <hr>
    欢迎访问ModelAttribute3Controller类跳转来的，request作用域中的loginname=${requestScope.user.loginname}<br><br>
    欢迎访问ModelAttribute3Controller类跳转来的，request作用域中的password=${requestScope.user.password}<br><br>
    欢迎访问ModelAttribute3Controller类跳转来的，request作用域中的password=${requestScope.user.username}<br><br>
    <hr>
    欢迎访问ModelAttribute5Controller类跳转来的，request作用域中的loginname=${requestScope.user.loginname}<br><br>
    欢迎访问ModelAttribute5Controller类跳转来的，request作用域中的password=${requestScope.user.password}<br><br>
    欢迎访问ModelAttribute5Controller类跳转来的，request作用域中的password=${requestScope.user.username}<br><<br>
</body>
</html>
