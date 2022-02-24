<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="styles.css">  
<script src="validate.js"></script>
</head>
<body>

	
	<center>
	<h3>${param.status}</h3><br>
	<h2>Login to your account!</h2>
	<form action="loginController" method="post">
		<div class="container">
			<label for="uname"><b>Username</b></label>
			 <input type="text" placeholder="Enter Username" name="uname" id="unameId" required>
			 <br>
			 <label id="usernameMsg"></label>
			<br>
			<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" id="pswId" required>
				<br>
				 <label id="passwordMsg"></label>
			<br>
			<input type="submit" onclick="return loginvalidate();" />
		</div>
	</form>
	</center>
</body>
</html>