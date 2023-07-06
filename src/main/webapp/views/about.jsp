<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    <%@ page import="java.sql.*" %>

<%@include file="base.jsp"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>about us</title>

<link href="../about.css" rel="stylesheet">

</head>

<!DOCTYPE html>

<html>

<head>

<title>About Us</title>

<link rel="stylesheet" type="text/css"

    href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>

<body>

<% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% } else { %>

         <%@include file="navbar.jsp"%>

      <% } %>

    <header class="bg-dark text-white py-5 text-center">

        <h1>About Us</h1>

    </header>

    <main class="container my-5">

        <section>

            <h2 class="mb-4">Who We Are</h2>

            <p>We are a 16 year young company best described as India's No. 1

                internet company. Our expertise in the online domain is

                unquestionable and we are the most dominant players in each of the

                segments we operate. We are the best in helping Businesses and

                People meet.</p>

        </section>

        <section>

            <h2 class="mb-4">Our Mission</h2>

            <p>Our Mission is To accelerate growth and expands its activities besides Delhi

                and NCR’s to rest of the country and even in abroad.</p>

        </section>

        <section>

            <h2 class="mb-4">Our Team</h2>

            <div class="row">

                <div class="col-md-6">

                    <div class="card mb-4">

                        <img src="team-member1.jpg" class="card-img-top"

                            alt="Team Member 1">

                        <div class="card-body">

                            <h3 class="card-title">John Doe</h3>

                            <p class="card-text">Founder & CEO</p>

                        </div>

                    </div>

                </div>

                <div class="col-md-6">

                    <div class="card mb-4">

                        <img src="team-member2.jpg" class="card-img-top"

                            alt="Team Member 2">

                        <div class="card-body">

                            <h3 class="card-title">Jane Smith</h3>

                            <p class="card-text">Creative Director</p>

                        </div>

                    </div>

                </div>

            </div>

        </section>

    </main>

    <footer class="bg-dark text-white py-3 text-center">

        <p>&copy; 2023 Your Company. All rights reserved.</p>

    </footer>

 

    <script

        src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>

</html>