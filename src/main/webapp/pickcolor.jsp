<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/16/22
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Your Favorite Color</title>
    <style>
      body {
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(to bottom, gray, black);
      }

      form {
        display: grid;
        grid-template-columns: 1fr;
        grid-template-rows: auto;
        border-radius: 30px;
        background: linear-gradient(to bottom, red, lightcoral);
        padding: 40px;
      }
    </style>
</head>
<body>
  <form action="/setcolor" method="POST">
    <label for="color">
      Please enter your favorite color:
      <input type="color" id="color" name="color">
    </label>
    <br/>
    <button type="submit">Ok</button>
  </form>
</body>
</html>
