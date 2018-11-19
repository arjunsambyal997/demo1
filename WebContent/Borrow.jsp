<%@ page language="java" contentType="text/html; charset=UTF-8" import="Model.Book, Controller.Controller"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Borrow Books</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">

		<a class="navbar-brand" class="container-fluid" href="http://localhost:8080/advJava/Home.jsp">Home</a>
			<div class="container-fluid">
				<ul class="nav navbar-nav">
					<li><a class="nav-link" class="active" href="http://localhost:8080/advJava/Borrow.jsp">Borrow</a></li>
					<li><a class="nav-link" href="#">Contact-Info</a></li>
				</ul>
				<ul class="navbar-nav ml-auto">
					<li><a class="nav-link" href="http://localhost:8080/advJava/Login.jsp">Sign-In</a></li>
					<li><a class="nav-link" href="http://localhost:8080/advJava/SignUp.jsp">Sign-Up</a></li>
				</ul>
			</div>
	</nav>
	<%
	List <Book> b = (List <Book> ) request.getAttribute("bo");
	%>

	<div class="container">
		<div class="col">
			<h2>
				Search
			</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Book Name</th>
						<th>Author</th>
						<th>Description</th>
					</tr>
				</thead>
		
				<tbody>
					<%
 						for (Book obj : b) {
 					%>
 					<tr>
				      <th scope="row"><%=obj.getName() %></th>
				      <td><%=obj.getAuthor() %></td>
				      <td><%=obj.getGenre() %></td>
				   
				    </tr>
				   <%} %>

					
				</tbody>
			</table>
		</div>
	</div>
	
	<form action="">
		<div class="form-group">
			<input type="search" placeholder="Search Book/User">
		</div>
	</form>
	
	<form action="" class="form-inline">
		<div class="form-group">
			<button type="button" class="btn btn-sm">Search Book</button>
		</div>
		<div class="form-group">
			<button type="button" class="btn btn-sm">Search User</button>
		</div>
	</form>
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>