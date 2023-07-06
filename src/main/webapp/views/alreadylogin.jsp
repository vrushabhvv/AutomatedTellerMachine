<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@include file="./base.jsp"%>

<%@include file="./navbar.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>already logged in</title>

<style>

     body {

    background: url(image/signup-background.jpg);

    background-size: cover;

          

}

 

.center {

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

 

    

      

         

      

    <div class="center">

        <div class="container">

            <div class="row">

                <div class="col-md-6 offset-md-3">

                    <div class="card mt-3">

                        <div class="card-header custom-bg  text-center">

                            <%@include file="message.jsp"%>

                            <h3>Login Here</h3>

                        </div>

                        <div class="card-body">

                            <form action="loginsearch" method="post">

                                <div class="form-group">

                                    <label for="exampleInputEmail1">Account Number</label> <input

                                        type="email" class="form-control" id="exampleInputEmail1"

                                        name="email" aria-describedby="emailHelp"

                                        placeholder="Enter email">

                                </div>

                                 

                                <div class="form-group">

                                    <label for="exampleInputPassword1">Password</label> <input

                                        type="password" class="form-control"

                                        id="exampleInputPassword1" name="password"

                                        placeholder="Password">

                                </div>

                                <a href="/forgotpassword" class=" d-block mb-4">Forgot Password?</a>

                                <div class="container text-center">

                                    <button type="submit" class="btn btn-primary bg-dark">Login</button>

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