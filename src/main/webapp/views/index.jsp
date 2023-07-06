<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@include file="base.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>index page</title>

<!-- <link href="../style.css" rel="stylesheet"> -->

</head>

<body>

  <% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% } else { %>

         <%@include file="navbar.jsp"%>

      <% }%>

    <div class="video-container">

        <video autoplay muted loop id="video-background">

            <source src="" type="video/mp4">

        </video>

        <div class="text-center">

            <h1>Welcome to Automated Teller Machine</h1>

            <p>"Simplify your banking experience with our user-friendly ATM web app.
            Experience modern banking at your fingertips."</p>

        </div>

    </div>

 

 

 

</body>

</html>