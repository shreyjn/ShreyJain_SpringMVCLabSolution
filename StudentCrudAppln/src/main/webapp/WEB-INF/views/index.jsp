<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Welcome to Student Crud App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Student Name</th>
							<th scope="col">Department</th>
							<th scope="col">Country</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${students }" var="st">
							<tr>
								<th scope="row">Student ${st.id }</th>
								<td>${st.name }</td>
								<td>${st.department }</td>
								<td>${st.country }</td>
								<td>
								<a href="delete/${st.id }"><button type="button" class="btn btn-outline-danger">DELETE</button></a>
								<a href="update/${st.id }"><button type="button" class="btn btn-outline-primary">EDIT</button></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<div class="container text-center">

					<a href="add-student" class="btn btn-outline-success">Add Student</a>

				</div>


			</div>


		</div>

	</div>
</body>
</html>
