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

                        <h3>Update Password</h3>

                    </div>

                    <div class="card-body">

                        <form>

                            <div class="form-group">

                                <label for="exampleInputEmail1">old password</label> <input

                                    type="password" class="form-control" id="exampleInputEmail1"

                                    name="oldpassword" aria-describedby="emailHelp"

                                    placeholder="Enter old password" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}$" required="required">

                            </div>

                             

                            <div class="form-group">

                                <label for="exampleInputPassword1">new password</label> <input

                                    type="password" class="form-control" id="exampleInputPassword1"

                                    name="newpassword" placeholder="Password" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}$" required="required">

                                     <small id="emailHelp" class="form-text text-muted">please ensure that you entering  atleast 8 characters with uppercase,lowercase and number along with specail characters.</small>

                            </div>


                            <div class="container text-center">

                                <button type="submit" class="btn btn-primary bg-dark">Update</button>

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