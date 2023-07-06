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
      background: #DFE8F1;

      font-family: Arial, sans-serif;


    }

 .outsidecontainer{
      display: flex;

      justify-content: center;

      align-items: center;
      
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

    .form-group input[type="text"] {

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

    <h1>Deposite Money</h1>
    
     <%@include file="message.jsp" %>

    <form action="depositeByCheque" method="post">

      <div class="form-group">

        <label for="amount">cheque number</label>

        <input type="text" id="amountId" name="chequenumber" placeholder="Enter cheque number" required>

      </div>

      <div class="form-group">

        <label for="account">Account Number</label>

        <input type="text" id="pinId" name="accountnumber" placeholder="Enter Account Number" required>

      </div>

      <div class="form-group">

        <input type="submit" value="deposit">

      </div>

    </form>

  </div>
</div>
 

</body>

</html>
