<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 1/3/23
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <c:forEach var="ad" items="${ads}">

            <c:out value="${ad.title}"/>: <c:out value="${ad.description}"/> <br>

        </c:forEach>
    </table>
</body>
</html>
