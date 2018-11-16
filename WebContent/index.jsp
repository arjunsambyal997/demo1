<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book barter portal</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class ="container bg-dark" >
			
<form action="test" class = "form-group" style = "padding : 20px">
	<h5 class="display-5 text-light">Id: </h5><input type="text" name="t1" class ="form-control"/><br>
	<h5 class="display-5 text-light">Password: </h5><input type="text" name="t2" class ="form-control"/><br>
	<div class ="container bg-dark" style = "padding : 20px" >
	<div class ="row justify-content-center ">		
		<div class ="col-md-2 ">
			<input type="submit" value="Insert" name="b1" class ="form-control btn btn-default"/>
		</div>	
		<div class ="col-md-2 ">
			<input type="submit" value="Update" name="b1" class ="form-control btn btn-default"/>
		</div>	
		<div class ="col-md-2 ">	
			<input type="submit" value="Delete" name="b1" class = "form-control btn btn-default"/>
		</div>	
		<div class ="col-md-2 ">
			<input type="submit" value="Select" name="b1" class = "form-control btn btn-default"/>
		</div>	
		<div class ="col-md-2 ">
			<input type="submit" value="SelectAll" name="b1" class ="form-control btn btn-default"/>
		</div>
	</div>	
	</div>		
</form>
		
</div>	
</body>
</html>