<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/15/22
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="partials/header.jsp" %>
<body>
    <%@ include file="partials/navbar.jsp" %>
    <div id="contents">
    </div>

    <script defer>
        //Get all query parameters from the url
        const params = new Proxy(new URLSearchParams(window.location.search), {
            get: (searchParams, prop) => searchParams.get(prop)
        })

        //Get the username from the url query parameters
        let username = params.username;

        //Get the contents container
        const contents = document.getElementById('contents')

        //Check if there's a username in the query parameters
        if(username){ //If there's a username
            //Set the contents to a welcome message with their username
            contents.innerText = `Welcome ` + username
        }else{ //Otherwise
            //Set the contents to a message letting them know they have to log in first.
            contents.innerText = "You must be logged in to view the profile."

            //Create a button to redirect the user back to the login page
            const loginBtn = document.createElement("button")

            loginBtn.textContent = "Login Now" //Add the text Login Now to the button

            loginBtn.onclick = () => { //When the user clicks this button
                window.location.href="/login.jsp" //Redirect them to the login page
            }
        }
    </script>
</body>
</html>
