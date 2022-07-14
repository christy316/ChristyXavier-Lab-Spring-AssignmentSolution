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


		<h6>Save Student</h6>
		<br>
		<table>
			<tbody>
				<form action="/SpringLab6/student/save" method="POST">
					<input type="hidden" name="studentId" value="${Student.studentId}">


					<tr>
						<td>
							<div class="form-group">Frist Name</div>
						</td>
						<td><div class="form-group">:</div></td>
						<td>
							<div class="form-line">
								<input type="text" name="firstName" value="${Student.firstName}"
									class="form-control mb-4 col-16" placeholder="FirstName">
							</div>
						</td>
					</tr>
					<tr>
						<td><div class="form-group">Last Name</div></td>
						<td><div class="form-group">:</div></td>
						<td><div class="form-line">
								<input type="text" name="lastName" value="${Student.lastName}"
									class="form-control mb-4 col-16" placeholder="LastName">
							</div></td>
					</tr>

					<tr>
						<td><div class="form-group">Course</div></td>
						<td><div class="form-group">:</div></td>
						<td><div class="form-line">
								<input type="text" name="course" value="${Student.course}"
									class="form-control mb-4 col-16" placeholder="Course">
							</div></td>
					</tr>
					<tr>
						<td><div class="form-group">Country</div></td>
						<td><div class="form-group">:</div></td>
						<td><div class="form-line">
								<input type="text" name="country" value="${Student.country}"
									class="form-control mb-4 col-16" placeholder="Country">
							</div></td>
					</tr>
					<tr>
						<td>
							<button type="submit" class="btn btn-info col-12">Save</button>
						</td>
					</tr>
				</form>
			</tbody>
		</table>
		<hr>
		<a href="/SpringLab6/student/student-list">Back to student list</a>
	</div>
</body>
</html>