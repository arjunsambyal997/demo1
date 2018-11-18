<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Sign-In</title>
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link rel='stylesheet' href='./css/login.css'>
		<style class="cp-pen-styles">@import url(https://fonts.googleapis.com/css?family=Open+Sans);</style>
	</head>

	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" class="container-fluid" href="http://localhost:8080/Library/Borrow.jsp">Borrow Books</a>
			<div class="container-fluid">
				<ul class="navbar-nav ml-auto">
					<li><a class="nav-link" href="http://localhost:8080/Library/Login.jsp#">Sign-In</a></li>
					<li><a class="nav-link" href="http://localhost:8080/Library/SignUp.jsp">Sign-Up</a></li>
				</ul>
			</div>
		</nav>

<!-- LOGIN FORM  -->

		<div class="login">
			<h1>Login</h1>
		    <form action="login">
    			<input type="text" name="u" placeholder="Username" required="required" />
        		<input type="password" name="p" placeholder="Password" required="required" />
       			 <button name="b1" value="Login" type="submit" class="btn btn-primary btn-block btn-large">Login</button>
    		</form>
		</div>
		
		<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		
	</body>
</html>