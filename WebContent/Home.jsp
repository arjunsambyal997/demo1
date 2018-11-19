<%@ page language="java" contentType="text/html; charset=UTF-8" import="Model.Book, java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="./css/Home.css">
		<style class="cp-pen-styles">@import url(https://fonts.googleapis.com/css?family=Open+Sans);</style>
		<title>Home</title>
	</head>
	
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light md-2">
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
	
		<div class="container-fluid my-2">
			<div class="row justify-content-md-center">
				<a href="addBook.jsp" class="col col-lg-2"><button type="button" class="btn btn-primary btn-block btn-large">Add Books</button></a>
				<a href="deleteBook.jsp" class="col col-lg-2"><button type="button" class="btn btn-primary btn-block btn-large">Delete Books</button></a>
			</div>
		
			<div class="row justify-content-md-center my-2">
				<h2>
					List of Books Added by the User
				</h2>
			</div>
		
			<%
				List <Book> book = (List<Book>)request.getAttribute("sb");
			%>
			<div class="container my-2">
				<table class="table">
					<thead>
						<tr>
							<th><h4>Book Name</h4></th>
							<th><h4>Author</h4></th>
							<th><h4>Genre</h4></th>
							<th><h4>Status</h4></th>
							<th><h4>Contact</h4></th>
						</tr>
					</thead>
				
					<tbody>
						<% if(book!=null)
						{
						for(Book obj : book) {
						%>
    					<tr>
    						<td scope="col"><%obj.getBookId(); %> </td>
    						<td scope="col"><%obj.getName(); %> </td>
    						<td scope="col"><%obj.getAuthor(); %> </td>
    						<td scope="col"><%obj.getStatus(); %> </td>
							<!-- to be declared -->				
							<td scope="col"><a href="Contact Controller"><button type="button" class="btn btn-sm">Contact</button></a></td>    			
						</tr>
    					<% }
							}
							else {
						%>
						<tr>
							<td scope="rowgroup"><h3>No Books Added</h3></td>
						</tr>
					
						<% } %>
	    			</tbody>
				</table>
			</div>
			</div>
			<div class="container" style = "padding-right : 350px ; padding-left : 350px;" >
				<form action="Search" class="form-inline form-group">
					<input type="search" placeholder="Search Book">
					<button type="button" class="btn btn-primary btn-block btn-large">Search Book</button>
				</form>
			</div>


	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>


