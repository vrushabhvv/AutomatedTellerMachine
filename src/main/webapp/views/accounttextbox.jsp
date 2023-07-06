<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@include file="./base.jsp"%>

 

 

 

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>login page</title>

<style>

     body {

             background: url(image/signup-background.jpg);

            background-size: cover;

          }

    .center{

  width: 100%;

  height: 100vh;

  display: flex;

  align-items: center;

  justify-content: center;

  background: #00C9A7;

}

      

</style>

</head>

<body>

<% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% } else { %>

         <%@include file="navbar.jsp"%>

      <% } %>

<div class="center">

    <div class="container">

        <div class="row">

            <div class="col-md-6 offset-md-3">

                <div class="card mt-3">

                    <div class="card-header custom-bg  text-center">

                    <%@include file="message.jsp" %>

                        <h3>Provide Account Number</h3>

                    </div>

                    <div class="card-body">

                        <form action="searchaccount" method="post">

                            <div class="form-group">

                                <label for="exampleInputEmail1">Account Number</label> <input

                                    type="text" class="form-control" id="exampleInputEmail1"

                                    name="cust_acc_number" aria-describedby="emailHelp"

                                    placeholder="Enter email" required="required">

                            </div>

                            <div class="container text-center">

                                <button type="submit" class="btn btn-primary bg-dark">Submit</button>
                            </div>
                        </form>

                    </div>

                                         

                </div>

                         

            </div>

                       

        </div>

               

    </div>

</div>

</body>

</html>