<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<center>
		<div style="height: 250px; width: 250px; border: 1px solid #000; text-align: center; background-color: lightblue;">
			<form action="hello" method="POST">
			   	(Password must be "galaxe" to login).<br><br>
				Username<br> <input type="text" name="name" /><br> <br>
				Password<br> <input type="password" name="password" /><br>
				<br> <br> <input type="submit" value="login" />
			</form>
		</div>
	</center>

</body>
</html>