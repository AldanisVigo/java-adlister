<%--
  Created by IntelliJ IDEA.
  User: aldanisvigo
  Date: 12/15/22
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <style>
    input {
      border-radius: 30px;
      border: 1px solid black;
      padding: 8px;
    }

    form{
      display: flex;
      flex-direction: column;
      gap: 8px;
      margin-left: auto;
      margin-right: auto;
      max-width: 200px;
      position: relative;
      top: calc(100vh / 2 - 200px);
    }

    button {
      border-radius: 30px;
      padding: 20px;
    }

    button:hover {
      cursor: pointer;
    }

    .commune-text{
      background-image: linear-gradient(60deg, #E21143, #FFB03A);
      -webkit-background-clip: text;
      display: inline-block;
      color: transparent;
      animation: animate 10s forwards infinite alternate;

    }

    @-webkit-keyframes animate {
      0% {
        background-position: left 0 top 50px;
      }
      20% {
        background-position: left 800px top -50px;
      }
      40% {
        background-position: left 1800px top -60px;
      }
      60% {
        background-position: left 2400px top -80px;
      }
      80% {
        background-position: left 3400px top -50px;
      }
      100% {
        background-position: left 4400px top 50px;
      }
    }
  </style>
</head>
