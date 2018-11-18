<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Sign-Up</title>
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link rel='stylesheet' href='./css/SignUp.css'>
		<style class="cp-pen-styles">@import url(https://fonts.googleapis.com/css?family=Open+Sans);</style>
	</head>
	
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" class="container-fluid" href="http://localhost:8080/Library/Borrow.jsp">Borrow Books</a>
			<div class="container-fluid">
				<ul class="navbar-nav ml-auto">
					<li><a class="nav-link" href="http://localhost:8080/Library/Login.jsp#">Sign-In</a></li>
					<li><a class="nav-link" href="#">Sign-Up</a></li>
				</ul>
			</div>
		</nav>

		<!-- SIGNUP FORM  -->

		<div class="signup">
			<h1>Sign Up</h1>
    		<form action="/register">
    			<input type="text" name="n" placeholder="Name" required="required" />
    			<input type="text" name="u" placeholder="Username" required="required" />
    			<input type="text" name="e" placeholder="Email" required="required" />
    			<input type="text" name="ph" placeholder="Contact No." required="required" />
    		    <input type="password" name="p" placeholder="Password" required="required" />
    		    <input type="password" name="cp" placeholder="Confirm Password" required="required" />
        
    		    <button type="submit" name="b1" value="Register" class="btn btn-primary btn-block btn-large">Register</button>
   			</form>
		</div>
	
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

	</body>
</html>