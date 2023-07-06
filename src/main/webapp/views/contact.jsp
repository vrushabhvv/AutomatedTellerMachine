<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

    <%@include file="base.jsp"%>

 

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>contact us</title>

</head>

<body>

<% if (session.getAttribute("user")==null) { %>

        <%@include file="navbarmodified.jsp"%>

      <% } else { %>

         <%@include file="navbar.jsp"%>

      <% } %>

    <header class="bg-dark text-white py-5 text-center">

        <h1>Contact Us</h1>

    </header>

    <main class="container my-5">

        <div class="row">

            <div class="col-md-6">

                <h2 class="mb-4">Get in Touch</h2>

                <form>

                    <div class="form-group">

                        <label for="name">Name</label>

                        <input type="text" class="form-control" id="name" placeholder="Enter your name">

                    </div>

                    <div class="form-group">

                        <label for="email">Email</label>

                        <input type="email" class="form-control" id="email" placeholder="Enter your email">

                    </div>

                    <div class="form-group">

                        <label for="message">Message</label>

                        <textarea class="form-control" id="message" rows="5" placeholder="Enter your message"></textarea>

                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>

                </form>

            </div>

            <div class="col-md-6">

                <h2 class="mb-4">Our Location</h2>

                <p>123 Main Street<br>Bangalore,Karnataka ZIP<br>India</p>

                <h2 class="mb-4">Contact Information</h2>

                <p>Email: info@ors.com<br>Phone: +1 123-456-7890</p>

            </div>

        </div>

    </main>

    <footer class="bg-dark text-white py-3 text-center">

        <p>&copy; 2023 xyz. All rights reserved.</p>

    </footer>

 

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>

</html>

 

</body>

</html>