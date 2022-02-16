<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
<link rel="stylesheet" href="styles.css">  
</head>
<body>
<center><h1>Add a new trainee!</h1>
<form action="traineeController.do" method="post">
	<input type="hidden" name="id" value="0"/>
    <table>
    		
			<tr>
				<td>Enter Trainee name:</td>
				<td><input type="text" name="name" id="nameId" /></td>
				<td><label id="nameMsg"></label></td>
			</tr>

			<tr>
				<td>Select Branch:</td>
				<td><select id="branchId" name="branch">
						<option value="Java">Java</option>
						<option value="Oracle">Oracle</option>
						<option value="php">php</option>
						<option value="dotnet">dotnet</option>
				</select></td>
			</tr>
			<tr>
				<td>Enter Percentage:</td>
				<td><input type="text" step="0.01" name="percentage" id="percentageId" /></td>
				<td><label id="percentageMsg"></label></td>
			</tr>

        <tr>
            <td><input type="submit" onclick="return validate();" /></td>
        </tr>
    </table>


</form>
</center>
</body>
</html>