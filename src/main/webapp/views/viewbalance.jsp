<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Current Balance</title>
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        /* Custom CSS styles */
        body{
        background: #DFE8F1;
        }
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
<% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% }else { %>

         <%@include file="navbar.jsp"%>

      <% } %>
      <div class="adjust">
    <div class="container text-center">
        <div class="balance bg-info text-white p-3 rounded">
            <b>Current balance: </b> rs.${currentbalance}
        </div>
    </div>
    </div>

    <!-- Add Bootstrap JS (Optional, for additional functionality) -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
      

    