<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%

String message=(String) session.getAttribute("message");

if(message!=null){

%>

<div class="alert alert-success fade show" role="alert">

<strong><%=message%></strong>

</div>

 

 

<%

session.removeAttribute("message");

}

%>