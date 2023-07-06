<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@include file="./base.jsp"%>

 

 

 

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>change pin page</title>

<style>

   

    .center{

  width: 100%;

  height: 100vh;

  display: flex;

  align-items: center;

  justify-content: center;

  background: #ADD8E6;

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

                        <h3>Change pin Here</h3>

                    </div>

                    <div class="card-body">

                        <form action="updatepin" method="post">

                            <div class="form-group">

                                <label for="exampleInputEmail1">old pin</label> <input

                                    type="password" class="form-control" id="exampleInputEmail1"

                                    name="currentpin" aria-describedby="emailHelp"

                                    placeholder="Enter old pin" required="required">

                            </div>

                             

                            <div class="form-group">

                                <label for="exampleInputPassword1">new pin</label> <input

                                    type="password" class="form-control" id="exampleInputPassword1"

                                    name="newpin" placeholder="enter new pin" required="required">

                            </div>
                            
                            <div class="container text-center">

                                <button type="submit" class="btn btn-primary bg-dark">Change</button>

                            </div>s

                        </form>

                    </div>

                                         

                </div>

                         

            </div>

                       

        </div>

               

    </div>

</div>

</body>

</html>