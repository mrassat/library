<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ page import="models.Location"%>
<%@ page import="java.util.ArrayList"%>

<%
	ArrayList<String> districts = (ArrayList<String>) request.getAttribute("districts");
%>

<html>
<head>
	<title>Seleccion de Distritos</title>
</head>
<body>
	<h4>Seleccione un distrito: </h4>
	<form action="search" method="GET">
		<select name="q" required>
			<% for (String di : districts) { %>
				<option value= <%= di %>><%= di %></option>
			<% } %>
		</select>
		<br>
		<input type="submit">
	</form>
</body>
</html>