<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ page import="models.Location"%>
<%@ page import="java.util.ArrayList"%>

<%
	ArrayList<Location> locations = (ArrayList<Location>) request.getAttribute("locations");
%>

<html>
<head>
	<title>Librerias de Madrid</title>
</head>
<body>
	<ul>
		<% for (Location l : locations) { %>
			<li> <%= l.name %> </li>
		<% } %>
	</ul>
</body>
</html>