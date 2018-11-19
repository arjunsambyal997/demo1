
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
</head>
<body>
	<div class="container-fluid" style = "background : #f2f2f2">
		<div class="row">
			<div class="col-md-6">
				<div class="container bg-dark">
					<h2 class="display-4 text-light" style="padding: 10px">UserList</h2>
					<hr>
					<form action="test" class="form-group" style="padding: 20px">
						<h5 class="display-5 text-light">Id:</h5>
						<input type="text" name="t1" class="form-control" /><br>
							<h5 class="display-5 text-light">Username:</h5>
						<input type="text" name="t2" class="form-control" /><br>
						<h5 class="display-5 text-light">Password:</h5>
						<input type="text" name="t3" class="form-control" /><br>
						<hr>
						<div class="container bg-dark">
							<div class="row ">
								<div class="col-md-2 ">
									<input type="submit" value="Insert" name="b1"
										class=" btn btn-default" />
								</div>
								<div class="col-md-2 ">
									<input type="submit" value="Update" name="b1"
										class="btn btn-default" />
								</div>
								<div class="col-md-2 ">
									<input type="submit" value="Delete" name="b1"
										class=" btn btn-default" />
								</div>
								<div class="col-md-2 ">
									<input type="submit" value="Select" name="b1"
										class=" btn btn-default" />
								</div>
								<div class="col-md-2 ">
									<input type="submit" value="SelectAll" name="b1"
										class="btn btn-default" />
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class = " col-md-6 ">
				<div class="container bg-dark">
						<h2 class="display-4 text-light" style="padding: 10px">Contact Form</h2>
						<hr>
					<form name="RegForm" action="register" class="form-group" style="padding: 20px">
						<h5 class="display-5 text-light">Name:</h5>
						<input type="text" name="t1" class="form-control" /><br>				
						<h5 class="display-5 text-light">Email:</h5>
						<input type="text" name="t2" class="form-control" /><br>
						<h5 class="display-5 text-light">Phone:</h5>
						<input type="text" name="t3" class="form-control" /><br>
						<hr>
						<input type="submit" value="Register" name="b1"	class="btn btn-default" />
					</form>	
			</div>
		</div>
	</div>
	</div>
</body>
</html>