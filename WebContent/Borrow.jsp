<%@ page language="java" contentType="text/html; charset=UTF-8" import="Model.Book, java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="UTF-8">
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="./css/Borrow.css">
		<title>Borrow Books</title>
	</head>
	
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light md-2">
			<a class="navbar-brand" class="container-fluid" href="http://localhost:8080/Library/Borrow.jsp">Borrow Books</a>
			<div class="container-fluid">

				<ul class="navbar-nav ml-auto">
					<li><a class="nav-link" href="http://localhost:8080/advJava/Login.jsp">Sign-In</a></li>
					<li><a class="nav-link" href="http://localhost:8080/advJava/SignUp.jsp">Sign-Up</a></li>
				</ul>
			</div>

		</nav>
	
		<div class="container-fluid">
			<div class="row justify-content-md-center my-2">
				<h2>
					List of Available Books
				</h2>
			</div>
		
			<div class="container my-2">
				<%
					List <Book> book = (List<Book>)request.getAttribute("sb");
				%>
				<table class="table">
					<thead>
						<tr>
							<th><h5>Book Name</h5></th>
							<th><h5>Author</h5></th>
							<th><h5>Genre</h5></th>
							<th><h5>Status</h5></th>
							<th><h5>Contact</h5></th>
						</tr>
					</thead>
					<tbody>
						<% if(book!=null)
							{
							for(Book obj : book) {			
						%>
    					<tr class="login">
    						<td scope="col"><%obj.getBookId(); %> </td>
    						<td scope="col"><%obj.getName(); %> </td>
    						<td scope="col"><%obj.getAuthor(); %> </td>
    						<td scope="col"><%obj.getStatus(); %> </td>
							<!-- to be declared -->				
							<td scope="col"><a href="Contact Controller"><button type="button" class="btn btn-sm">Contact</button></a></td>
    					</tr>
    					<% }
							}
							else {%>
						<tr>
							<td><h4>No Books Added</h4></td>
						</tr>	
						<% } %>
					</tbody>
				</table>
			</div>

		</div>
		<div class="login">
			<form action="Search Book/User" class="form-group">
				<input type="search" placeholder="Search Book/User">
				<button type="button" class="btn btn-primary btn-block btn-large">Search Book</button>
				<button type="button" class="btn btn-primary btn-block btn-large">Search User</button>
			</form>
		</div>
		
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	</body>
</html>