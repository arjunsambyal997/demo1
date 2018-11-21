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

<script> 
function f1(){
	
	
}

</script>

</head>



<body >
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



<div class = "container" style = "padding : 100px" >
	<form action="search" class = "form-inline form-group mb-2" >
		<table class="table " >
  <thead class ="thead-light">
    <tr>
      <th scope="col"><input type= "text" placeholder = "Search" class="form-control " name = "t0" />
      <input type ="submit" name ="b1" value = "Search" class="btn btn-dark" /></th>
    </tr>
  </thead>
	</table>
	</form>

<%
	List <Book> s = (List <Book> ) request.getAttribute("lst");
%>
	<table class="table table-striped table-bordered ">
  <thead class ="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
       <th scope="col">Author</th>
        <th scope="col">genre</th>
        <th scope="col">State</th>
         <th scope="col"></th>
    </tr>
  </thead>
  
  <tbody>
 
 <%
 	int i =1;
 	for (Book obj : s) {
 %>
    <tr>
      <th scope="row"><%=i++ %></th>
      <td><%= obj.getName()%></td>
      <td><%= obj.getAuthor()%></td>
      <td><%= obj.getGenre()%></td>
      <td><%= obj.getStatus()%></td>
      <td> 
      <form action="search">
        <input type ="hidden"  value = "<%=obj.getUserId() %>" name="t2" class ="btn btn-dark" />
      <input type ="submit"value ="Contact" name ="b1" class ="btn btn-dark" /> 
      </form>
      </td>
    </tr>
   <%} %>
  </tbody>
</table>

</div>

</body>
</html>