
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/test/register.do"  method="post">
     姓名:<input type="text" name="name"/><br>
     密码:<input type="password" name="password"/><br>
     <input type="submit" value="注册"/><br>
 </form>
</body>
</html>
