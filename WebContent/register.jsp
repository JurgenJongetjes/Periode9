<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="styles/home.css"></link>
<title>REGISTER - HelloBike!</title>
</head>
<body>
	<div class="headerNav">
		<%@ include file="WEB-INF/jspf/header.jspf" %>
		<br></br>
	</div>
	<div class="index">
		<div class="login">
			<form action="MyFormController" method="post">
				Username: <br></br>
				<input class="input" type="text" name="username"></input>
				<br></br>
				Password: <br></br>
				<input class="input" type="password" name="password"></input>
				<br></br>
				Repeat Password: <br></br>
				<input class="input" type="password" name="repeatPassword"></input>
				<br></br><br></br>
				<input class="loginbtn" type="submit" value="Register"></input>
			</form>
		</div>
	</div>
</body>
</html> 