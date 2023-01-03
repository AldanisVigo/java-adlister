<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/15/22
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="partials/header.jsp"%>
<body>
    <%@ include file="partials/navbar.jsp"%>
    <%@ include file="partials/login_form.jsp" %>

    <script>
        //Get all query parameters from the url
        const params = new Proxy(new URLSearchParams(window.location.search), {
            get: (searchParams, prop) => searchParams.get(prop)
        })

        //Get the error messages from the url query parameters
        let errorMessage = params.error;

        //If there's an error message
        if(errorMessage){
            //Let the user know what the error was.
            alert(errorMessage)
        }
    </script>
</body>
</html>
