<%--
  Created by IntelliJ IDEA.
  User: yangxiaoxiao
  Date: 2019-09-10
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <% String loginUser=(String) session.getAttribute("loginUser");%>
</head>
<body>
<center>
    <h1>
        图书后台管理系统<span style="font-size:12px">您好，<%=loginUser%></span>
    </h1>
</center>
</body>
</html>
