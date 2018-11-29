
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
<script>
function f1()
{
	  var x = document.getElementById("borrow");
	  var y = document.getElementById("lent")

	  if (y.value == "Lent") {
		  var z =  prompt("enter borrower name");
			x.value= z;		  
	    } else {
	    }
}




</script>
<meta charset="ISO-8859-1">
<title>Book barter portal</title>
<!-- <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous"> -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
	<%
		String name = (String) session.getAttribute("n");
	%>

	<nav class="navbar navbar-expand-lg sticky-top navbar-dark bg-dark">

		<div class="container-fluid">

			<div class="navbar-header">
				<ul class="nav navbar-nav ml-auto w-100">
					<li class="nav-item"><a class="navbar-brand" href="home">Home</a></li>

					<li class="nav-item"><a class="nav-link" href="borrow">Borrow</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="contact">Contact
							Info</a></li>
				</ul>
			</div>
			<div>
				<ul class="nav navbar-nav ml-auto w-100 ">
					<li class="nav-item"><span class="nav-link"> Welcome <%=name%>
					</span></li>
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


	<div class="container-fluid" style="padding: 5%">
	
	<form action="homebutton" method="post" method="post">
			<table class="table ">
				<thead class="thead-light">
					<tr>
					<th scope="col">
					<div class = "form-row">
					<div class = "col-md-4">
						<input type="text"
							placeholder="Enter book,author or genre" class="form-control " name="t1" />
					</div>
						<div class = "col-md-4">
						
						<input type="submit" name="b1" value="Search"
							class="btn btn-dark" />
						</div>
						</div>
				</th>
					</tr>
				</thead>
			</table>
	</form>	
	
		<form action="homebutton" class="form-inline form-group mb-2" method="post">
			<table class="table ">
				<thead class="thead-light">
					<tr>
						<th scope="col"><input type="text"
							placeholder="Enter book name" class="form-control " name="t1" />
							<input type="text" placeholder="Enter author name"
							class="form-control " name="t2" /> <input type="text"
							placeholder="Enter genre name" class="form-control " name="t3" />
							<select class="form-control" name="t4">
								<option selected value=" ">Progress</option>
								<option value="Completed">Completed</option>
								<option value="Reading">Reading</option>
								<option value="Plan to Read">Plan to Read</option>
								<option value="Dropped ">Dropped</option>
						</select> 	
						<select class="form-control" name="t5" id="lent" onchange="f1()">
									<option selected value=" ">Status</option>
									<option value="Available">Available</option>
									<option value="Unavailable">Unavailable</option>
									<option value="Lent">Lent</option>
								</select>
							
								<input type="hidden" class="form-control " name="t6"  id="borrow"  />	
							<input type="submit" name="b1"
							value="Add Book" class="btn btn-dark" /></th>
					</tr>
				</thead>
			</table>
</form>

		<%
			List<Book> s = (List<Book>) request.getAttribute("sb");
		%>
		<div class="table-responsive">
		<table class="table table-striped table-bordered ">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">Author</th>
					<th scope="col">Genre</th>
					<th scope="col">Progress</th>
					<th scope="col">Status</th>
					<th scope="col"></th>

				</tr>
			</thead>
			<tbody>
				<%
					int i = 1;
					for (Book obj : s) {
				%>

				<tr>
<form action="homebutton" class="form-inline form-group mb-2" method="post">
					<th scope="row"><%=i++%>
					<input value="<%=obj.getBookId()%>" class="form-control "	id="tableData" type= hidden name="t0" />
					</th>
					
						<td>
						<div class="container">
						<input value="<%=obj.getName()%>" class="form-control "	id="tableData" type=text name="t1" />
						</div>
						</td>
						<td><div class="container">
								<input value="<%=obj.getAuthor()%>" class="form-control"
									id="tableData" type=text  name="t2">
							</div></td>
						<td><div class="container">
								<input value="<%=obj.getGenre()%>" class="form-control"
									id="tableData" type=text name="t3">
							</div></td>
						<td>
							<div class="container">
								<select class="form-control" id="tableData" name="t4">
									<option selected value="<%=obj.getStatus()%>"><%=obj.getStatus()%></option>
									<option value="Completed">Completed</option>
									<option value="Reading">Reading</option>
									<option value="Plan to Read">Plan to Read</option>
									<option value="Dropped ">Dropped</option>
								</select>
							</div>
						</td>
						<td><div class="container">
								<select class="form-control" id="tableData" name="t5">
									<option selected value="<%=obj.getIssueStatus()%>"><%=obj.getIssueStatus()%></option>
									<option value="Available">Available</option>
									<option value="Unavailable">Unavailable</option>
									<option value="Lent" disabled>Lent</option>
								</select>
							</div></td>
						<td scope="col">
						<div class ="container">
							<input type="submit" name="b1" value="Update" class="btn btn-outline-dark" />						
						<input type="submit" name="b1" value="Remove"class="btn btn-outline-dark" />			
						</div>			
      					 </td>
						
     			</form>
    		</tr>
   <%
   	}
   %>
 
  </tbody>
</table>
	</div>
</div>

</body>
</html>