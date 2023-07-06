<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    <%@include file="./base.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>
<style>
        /* Custom CSS styles */
        .adjust {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 90vh;
        }
        
        .balance {
            font-size: 24px;
            font-weight: bold;
            margin-top: 20px;
        }
    </style>

</head>

<body>
  <%

    if (session.getAttribute("user") == null) {

    %>

    <%@include file="navbarmodified.jsp"%>

    <%

    } else {

    %>

    <%@include file="navbar.jsp"%>

    <%

    }

    %>

    <div class="adjust">
    <div class="container text-center">
        <div class="balance bg-info text-white p-3 rounded">
            <b>successfully withdrawn</b>
        </div>
    </div>
    </div>

</body>

</html>
