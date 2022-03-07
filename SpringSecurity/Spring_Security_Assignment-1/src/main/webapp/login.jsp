<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Details</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="login" method="post">
		<div>
			<table>
				<tr>
					<td><label>User Name:</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>password:</label></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><label>Submit</label></td>
					<td><input type="submit" name="submit"></td>
				</tr>
			</table>

		</div>
	</form>
</body>
</html>