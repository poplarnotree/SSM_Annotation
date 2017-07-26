<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <a href="pathVariableTest/1">测试@pathVarible注解</a><br><br>
    <a href="requestHeaderTest">测试@RequestHeader注解</a><br><br>
    <a href="cookieValueTest">测试@CookieValue注解</a><br><br>
    <hr>
    <h3>测试@ModelAttribute的不同用法</h3>
    <hr>
    <a href="form/loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法</a><br><br>
    <a href="loginForm2">测试@ModelAttribute注释void返回值的方法</a>
    <a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a>
    <a href="loginForm4">测试@ModelAttribute和@RequestMapping同时注释一个方法</a>
    <a href="loginForm5">测试@ModelAttribute注释一个方法的参数</a>
</body>
</html>
