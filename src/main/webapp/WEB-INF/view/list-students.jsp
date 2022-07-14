<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	crossorigin="anonymous">

<title>STUDENT REGISTRY</title>
</head>
<body>

	<div class="container">
		<h3>STUDENT REGISTRY</h3>
		<hr>
		<form>

			<a
				href="/SpringLab6/student/showFormForAdd"
				class="btn btn-primary btn-sm mb-3">Add Student</a>
		</form>


		<table class="table table-bordered table-stripped">
			<thead class="thead-dark">
				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Course</th>
					<th>country</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Students}" var="tempStudent">
					<tr>
						<td><c:out value="${tempStudent.firstName}" /></td>
						<td><c:out value="${tempStudent.lastName}" /></td>
						<td><c:out value="${tempStudent.course}" /></td>
						<td><c:out value="${tempStudent.country}" /></td>
						<td><a
							href="/SpringLab6/student/showFormForUpdate?studentId=${tempStudent.studentId}"
							class="btn btn-info btn-sm">Update</a> <a
							href="/SpringLab6/student/delete?studentId=${tempStudent.studentId}"
							class="btn btn-danger btn-sm"
							onClick="if(!(confirm('Are you sure you want to delete?'))) return false">Delete</a>
						</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>