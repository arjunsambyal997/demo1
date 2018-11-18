<%@ page language="java" import="javax.servlet.*, javax.servlet.http.*, java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Home</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" class="container-fluid" class="active" href="http://localhost:8080/Library/Home.jsp">Home</a>
			<div class="container-fluid">
				<ul class="nav navbar-nav">
					<li><a class="nav-link" href="http://localhost:8080/Library/Borrow.jsp">Borrow</a></li>
					<li><a class="nav-link" href="#">Contact-Info</a></li>
				</ul>
				<ul class="navbar-nav ml-auto">
					<li><a class="nav-link" href="#">Sign-Out</a></li>
				</ul>
			</div>
	</nav>
	
	<button type="button" class="btn" onClick="">Add Books</button>
	
	<div class="container">
		<h2>
			List of Books Added by the User
		</h2>
		<table class="table">
			<thead>
				<tr>
					<td>Book Name</td>
					<td>Author</td>
					<td>Description</td>
				</tr>
			</thead>
				<%
				/*String user = "";
				String password = "root";
				String url = "jdbc:mysql://localhost:3306/Book_list";
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(user, password, url); 
						String stmt = "select * from Book";
						
					} catch(SQLException e){
						e.printStackTrace();
					}*/
				%>
			<tbody>
				<!-- if-else code for List of books added by the user -->
			</tbody>
		</table>
	</div>
	
	<form action="" class="form-inline">
		<div class="form-group">
			<input type="search" placeholder="Search Book">
		</div>
		<div class="form-group">
			<button type="button" class="btn btn-sm">Search Book</button>
		</div>
	</form>
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>