<%@ page import="java.io.Writer" %><%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/16/22
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Here's Your Favorite Color</title>
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>
<body style="background: <%= request.getParameter("color") %>;">
    <h1>Your favorite color is: <%= request.getParameter("color") %></h1>
</body>
</html>
