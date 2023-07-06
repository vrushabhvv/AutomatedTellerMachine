<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@include file="./base.jsp"%>

 

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<title>add applicants</title>

<style type="text/css">
body{
background: #DFE8F1;
}

</style>

</head>

<body>

<% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% } else { %>

         <%@include file="navbar.jsp"%>

      <% } %>



 

 

    <div class="container mt-3">

        <div class="row">

            <div class="col-md-12">

 

                <h1 class="text-center mb-3">View Transactions</h1>

                <table class="table table-bordered">

                    <thead>

                        <tr class="border">

                            <th scope="col">Transaction Id</th>

                            <th scope="col">Date</th>

                            <th scope="col">Description</th>

                        </tr>

                    </thead>

                    <tbody>

                        <c:forEach items="${transactions}" var="list">

                            <tr>

                                <td>${list.tid}</td>
                                
                                <td>${list.date}</td>

                                <td>${list.tdesc}</td>


                            </tr>

                        </c:forEach>

                    </tbody>

                </table>

 

            </div>

        </div>

 

    </div>

</body>

</html>