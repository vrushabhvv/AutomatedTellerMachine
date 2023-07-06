<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    <%@include file="./base.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

<style>

    body {

      background-color: #f8f9fa;

      font-family: Arial, sans-serif;
      background: #DFE8F1;


    }




    .container {

      max-width: 400px;
      

      margin: 0 auto;
      margin-top:70px;

      padding: 40px;

      background-color: #ffffff;

      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);

    }

 

    .form-group {

      margin-bottom: 20px;

    }

 

    .form-group label {

      font-weight: bold;

    }

 

    .form-group input[type="text"],

    .form-group input[type="number"] {

      width: 100%;

      padding: 10px;

      border: 1px solid #ced4da;

      border-radius: 4px;

    }

 

    .form-group input[type="submit"] {

      width: 100%;

      padding: 10px;

      background-color: #007bff;

      border: none;

      color: #ffffff;

      font-weight: bold;

      border-radius: 4px;

      cursor: pointer;

    }

 

    .form-group input[type="submit"]:hover {

      background-color: #0069d9;

    }

 

    h1 {

      text-align: center;

      margin-bottom: 30px;

    }

  </style>

</head>

<body>

<% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% } else { %>

         <%@include file="navbar.jsp"%>

      <% } %>
      <div class="outsidecontainer">

  <div class="container">

    <h1>Withdraw Money</h1>
    
     <%@include file="message.jsp" %>

    <form action="withdrawByGet" method="post">

      <div class="form-group">

        <label for="amount">Amount:</label>

        <input type="number" id="amountId" name="amount" placeholder="Enter amount" required>

      </div>

      <div class="form-group">

        <label for="account">Security Pin:</label>

        <input type="text" id="pinId" name="pin" placeholder="Enter Security pin" required>

      </div>

      <div class="form-group">

        <input type="submit" value="Withdraw">

      </div>

    </form>

  </div>
</div>
 

</body>

</html>