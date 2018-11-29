<%@page import="Model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
#tableData {
	border: none;
	background: transparent;
}
</style>
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
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
	<%
			String name =(String) session.getAttribute("n");
			%>

	<nav class="navbar navbar-expand-lg sticky-top navbar-dark bg-dark">

		<div class="container-fluid">

			<div class="navbar-header">
			<ul class = "nav navbar-nav ml-auto w-100">
				<li class="nav-item" ><a class="navbar-brand" href="home">Home</a></li>
				
				<li class="nav-item" ><a class="nav-link" href="borrow">Borrow</a>
					</li>
				<li class="nav-item" ><a class="nav-link" href="contact">Contact Info</a>
					</li>
				</ul>
			</div>
			<div>
				<ul class="nav navbar-nav ml-auto w-100 " >
					<li class="nav-item"> <span class ="nav-link"> Welcome <%= name %> </span>
					</li>
					</ul>
			</div>
			<div>
			
				<ul class="nav navbar-nav ml-auto w-100 justify-content-end">
					<li class = "nav-item">
		
		  <form class="form-inline " action="search" method="post">
		  	<div class="input-group input-group-sm my-1">
  <input type="text" class="form-control bg-secondary border-secondary" placeholder="search" name ="t1" required="required"/>
  <div class="input-group-append">
    <button class="btn btn-secondary border-secondary" type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
  </div>
</div>
    </form>			
				</li>
					<li class="nav-item"><a class="nav-link" href="signout">SignOut</a>
					</li>
					
				</ul>	
			</div>
		</div>
	</nav>


	<!-- SIGNUP FORM  -->
<div class = "container" style = "padding-top: 10%"">
<div class = "row">	
<div class ="col-md-6">

<% User u = (User)request.getAttribute("con"); %>
<h2 class="display-4">Contact Info</h2>
<form action="contactbutton" method="post" >
  <div class="form-group">
    <label>Name:</label>
    <input type="text" name="n" placeholder="Name" required="required" class ="form-control" />
  </div>
  <div class="form-group">
    <label>Email:</label>
    <input type="email" name="e" placeholder="Email" required="required" class ="form-control"  />
  </div>
    <div class="form-group">
    <label>Phone:</label>
   <input type="text"	name="ph" placeholder="Contact No." required="required" class ="form-control" />
  </div>
  <input type="submit" name="b1" value="Update" class="btn btn-dark btn-block" />
</form>
</div>


<div class ="col-md-6" style ="padding : 5%">
	<h4>Name :</h4> <p> <%= u.getName() %></p> 
	<h4>Email :</h4> <p> <%= u.getEmail() %></p> 
	<h4>Phone :</h4> <p> <%= u.getPhone() %></p> 
</div>

</div>
</div>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>
</html>
