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
	
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



<script>
function ValidateEmail() 
{
	var x = document.getElementById("email");
	var y = x.value;
	var re = new RegExp(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/);
 if (!re.test(y))
  {
	 alert("wrong"); 
	 x.value = null;
	  
  }
}

function phonenumber()
{
	var x = document.getElementById("phone");
	var y = x.value;
  var phoneno = /^\d{10}$/;
  if(!phoneno.test(y))
        {
        alert("wrong");
        x.value = null;
        }
}

function passCheck(){
	var x = document.getElementById("pass1");
	var y = document.getElementById("pass2");
	if(x.value != y.value){
		alert("doesn't match");
		y.value = null 
		
	}
}

</script>

</head>




<body>
	<nav class="navbar navbar-expand-lg sticky-top navbar-dark bg-dark">

		<div class="container-fluid">

			<div class="navbar-header">
				<a class="navbar-brand" href="index">Home</a>
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
				
					<li class="nav-item"><a class="nav-link" href="SignUp.jsp">Register</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="Login.jsp">SignIn</a>
					</li>
				</ul>	
			</div>
		</div>
	</nav>


	<!-- SIGNUP FORM  -->
<!-- 	
<form action="register" class= "form-inline " method="post">
	<div class="container form-group  " style="height: 500px; width: 240px;  padding-top: 5%">
		<h1 class="display-6">Sign Up</h1>
		
			<input type="text" name="n" placeholder="Name" required="required" class ="form-control" /> <br>
			<input type="text" name="u" placeholder="Username" required="required" class ="form-control"  /> <br>
			<input type="text" name="e" placeholder="Email" required="required" class ="form-control"  /> <br>
			<input type="text"	name="ph" placeholder="Contact No." required="required" class ="form-control" /> <br>
		    <input	type="password" name="p" placeholder="Password" required="required" class ="form-control" /> <br>
			<input type="password" name="cp" placeholder="Confirm Password"	required="required" class ="form-control" /> <br>
			<input type="submit" name="b1" value="Register"	class="btn btn-dark btn-block" />
	
		
		</div>
</form>
 -->
 
 <div class = "container" style = "padding-top: 5%"">
<div class = "row">	
<div class ="col-md-4 offset-md-4">
<h2 class="display-4">Register</h2>
<form action="register" method="post" >
  <div class="form-group">
    <label>Name:</label>
 	<input type="text" name="n" placeholder="Name" required="required" class ="form-control" />
  </div>
  <div class="form-group">
    <label>Username:</label>
    	<input type="text" name="u" placeholder="Username" required="required" class ="form-control"  />
  </div>
  <div class="form-group">
    <label>Email:</label>
    <input type="text" name="e" placeholder="Email" required="required" class ="form-control" id="email"  onchange	="ValidateEmail()" />
  </div>
  <div class="form-group">
    <label>Contact No:</label>
    <input type="text"	name="ph" placeholder="Contact No." id="phone" onchange="phonenumber()" required="required" class ="form-control" />
  </div>
  <div class="form-group">
    <label>Password:</label>
     <input	type="password" name="p" placeholder="Password" required="required" id="pass1" class ="form-control" /> 
  </div>
   <div class="form-group">
    <label>Confirm Password:</label>
 <input type="password" name="cp" placeholder="Confirm Password" onchange="passCheck()" id="pass2"	required="required" class ="form-control" />
  </div>
  
	<input type="submit" name="b1" value="Register"	class="btn btn-dark btn-block" />
</form>
</div>
</div>
</div>

</body>
</html>
