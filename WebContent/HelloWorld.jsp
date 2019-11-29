<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>JSP HelloWorld</title>
</head>
<body>

	<div>
		<p><%! int day = 3; %> <% if (day == 1 || day == 7) { %> Today is weekend <% } else { %> Today is not weekend <% } %></p>
	</div>
	<div>
		<p>Today's date : <%= (new java.util.Date()).toLocaleString() %></p>
	</div>
	<br></br>
	<div>
		<%-- Dit is een JSP comment --%>
		<p><% out.println("Your IP address is " + request.getRemoteAddr()); %></p>
	</div>
	<br></br>
	<div>
		<p><%= request.getAttribute("cat") %></p>
	</div>
	<br></br>
	<div>
		<p>Filter (get parameter) <%=request.getParameter("cat")  %> <% out.println("Get parameter in Servlet: " + request.getParameter("cat")); %></p>
	</div>
	<br></br>
	<div>
		${pageContext.request.queryString}
		${pageContext.request.contextPath}
	</div>

</body>
</html>