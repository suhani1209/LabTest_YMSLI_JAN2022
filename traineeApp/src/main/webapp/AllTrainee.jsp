<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trainees Details</title>
<style type="text/css">
button{
        background-color: green;
        border: none;
        color: #fff;
        padding: 15px 30px;
        margin:20px;
        text-decoration: none;
        cursor: pointer;
}
table {
  border:2px solid green;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}
th{
	background-color: #f2f2f2;
	text-align: center;
}
tr:nth-child(even) {background-color: #f2f2f2;}
</style>
</head>
<body>
	<center>
	<h1>Welcome ${user.username} !!</h1>
	<br>
	<br>
	<table>

		<thead>
			<tr>
				<th>Trainee id</th>
				<th>Name</th>
				<th>Branch</th>
				<th>Percentage</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${Trainees}" var="trainee">
				<tr>
					<td>${trainee.trainee_id}</td>
					<td>${trainee.trainee_name}</td>
					<td>${trainee.branch}</td>
					<td>${trainee.percentage}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<button  onclick="location.href='traineeController.do?action=addtrainee'" type="button">Add Trainee</button>
	<form action="logoutController">
	<button >Logout</button>
	</form>
	</center>
</body>
</html>