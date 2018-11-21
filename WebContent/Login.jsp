<%@page import="Model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book barter portal</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>

<body>
	<nav class="navbar navbar-expand-lg sticky-top navbar-dark bg-dark">

		<div class="container-fluid">

			<div class="navbar-header">
				<a class="navbar-brand" href="index">Home</a>
			</div>
			<div>
				<ul class="nav navbar-nav ml-auto w-100 justify-content-end">
					<li class="nav-item"><a class="nav-link" href="SignUp.jsp">Register</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="Login.jsp">SignIn</a>
					</li>
				</ul>	
			</div>
		</div>
	</nav>


	<!-- SIGNUP FORM  -->
	
<form action="login" class= "form-inline ">
	<div class="container form-group  " style="height: 300px; width: 240px;  padding-top: 5%">
		<h1 class="display-6">Login</h1>
		
			<input type="text" name="u" placeholder="Username" required="required" class ="form-control"  /> <br>
		    <input	type="password" name="p" placeholder="Password" required="required" class ="form-control" /> <br>
			<input type="submit" name="b1" value="Login"	class="btn btn-dark btn-block" />
		
		
		</div>
</form>

	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>
</html>
