<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill the Student detail</h1>

				<form action="handle-student" method="post">
				
					<div class="form-group">
						<label for="name">Student Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter the Student name here">
					</div>
					
					<div class="form-group">
						<label for="department">Student Department</label> <input type="text"
							class="form-control" id="department" aria-describedby="emailHelp"
							name="department" placeholder="Enter the Student department here">
					</div>
					
					<div class="form-group">
						<label for="country">Student Country</label> <input type="text"
							class="form-control" id="country" aria-describedby="emailHelp"
							name="country" placeholder="Enter the Student country here">
					</div>
					
					<div class="container text-center">

						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>

						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>

			</div>

		</div>

	</div>

</body>
</html>