<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@include file="./base.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

  <style>

    .center-div {

      display: flex;

      align-items: center;

      justify-content: center;

    /*   min-height: 100vh; */

    }
    body{
    background: #A7BED7;
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

    <h2 class="text-center mt-4 mb-4">Welcome to Automated Teller Machine</h2>

    <div class="center-div mt-0">

        <div class="container">

            <div class="row">

                <div class="col-md-6">

                    <div class="card">

                        <div class="card-header">Get Cash(withdraw)</div>

                        <div class="card-body">

                        <a href="/getcash">

                            <button type="button" class="btn btn-primary">Get Cash</button>

                            </a>

                        </div>

                    </div>

                </div>

 

                <div class="col-md-6">

                    <div class="card">

                        <div class="card-header">Fast Cash(withdraw)</div>

                        <div class="card-body">
                        <a href="/fastcash">
                            <button type="button" class="btn btn-primary">Fast Cash</button>
                            </a>
                        </div>

                    </div>

                </div>

 

            </div>

 

            <div class="row mt-4">

                <div class="col-md-6">

                    <div class="card">

                        <div class="card-header">By Check(deposit)</div>

                        <div class="card-body">
                        <a href="/bycheque">
                            <button type="button" class="btn btn-primary">By Check</button>
						</a>
                        </div>

                    </div>

                </div>

 

                <div class="col-md-6">

                    <div class="card">

                        <div class="card-header">View Balance</div>

                        <div class="card-body">
                        <a href="/viewbalance">
                            <button type="button" class="btn btn-primary">View
                                Balance</button>
                                </a>

                        </div>

                    </div>

                </div>

 

            </div>

 

            <div class="row mt-4">

                <div class="col-md-6">

                    <div class="card">

                        <div class="card-header">Mini Statement</div>

                        <div class="card-body">
                        <a href="/transanction">
                            <button type="button" class="btn btn-primary">generate

                                mini statement</button>
                                </a>
                        </div>

                    </div>

                </div>

 

                <div class="col-md-6">

                    <div class="card">

                        <div class="card-header">Change Pin</div>

                        <div class="card-body">
                        <a href="/changepin">
                            <button type="button" class="btn btn-primary">Change Pin</button>
                            </a>
                        </div>

                    </div>

                </div>

 

            </div>

        </div>

    </div>

</body>

</html>