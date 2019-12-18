<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="styles/home.css"></link>
<title>Home - HelloBike!</title>
</head>
<body>
<div class="bodyDiv">
	<div class="headerNav">
		<%@ include file="WEB-INF/jspf/header.jspf" %>
		<br></br>
	</div>
	
	<div class="contentDiv">
		<div class="content">
			<p>Hier komt content te staan (post 1)</p>
			<div class="Foto1"></div>
			<img src="/Periode9/img/Fiets1.jpg" width="300" height="300" alt="FietsFoto"></img>			<br></br>
		</div>
	</div>
	
	<div class="footer">
		<%@ include file="WEB-INF/jspf/footer.jspf" %>
		<br></br>
	</div>
</div>
</body>
</html>

<!-- Made by Jurgen & Chiel -->