<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link rel='stylesheet' href='./css/addBook.css'>
		<style class="cp-pen-styles">@import url(https://fonts.googleapis.com/css?family=Open+Sans);</style>
		<title>Add Book</title>
	</head>
	
	<body>
		<!-- Navbar Implementation -->
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" class="container-fluid" class="active" href="http://localhost:8080/Library/Home.jsp">Home</a>
			<div class="container-fluid">
				<ul class="nav navbar-nav">
					<li><a class="nav-link" href="http://localhost:8080/Library/BorrowAfLogin.jsp">Borrow</a></li>
					<li><a class="nav-link" href="http://localhost:8080/Library/UpdateContact.jsp">Contact-Info</a></li>
				</ul>
				<ul class="navbar-nav ml-auto">
					<li><a class="nav-link" href="http://localhost:8080/Library/Borrow.jsp">Sign-Out</a></li>
				</ul>
			</div>
		</nav>

		<!-- BOOK DETAILS FORM -->

		<div class="addbook">
			<h1>Enter Book Details</h1>
    		<form action="addbook">
    			<input type="text" name="b" placeholder="Book Name" required="required" />
    			<input type="text" name="a" placeholder="Author" required="required" />
    			<input type="text" name="g" placeholder="Genre" required="required" />
			    <button type="submit" name="b1" value="AddBook" class="btn btn-primary btn-block btn-large">Add Book</button>
    		</form>
		</div>
		
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

	</body>
</html>