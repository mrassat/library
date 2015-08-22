<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ page import="models.Employee"%>
<%@ page import="java.util.*"%>

<%
	ArrayList<Employee> l = (ArrayList<Employee>) request.getAttribute("employees");
%>
<%
	String opt = (String) request.getAttribute("optlist");
%>

<!DOCTYPE html>
<html>
<head>
	<title>Listado de Empleados</title>
</head>
<body>
	<h1>Listado de Empleados</h1>
	<h2>Opcion de Listado: <%= opt %></h2>

	<ul>
		<% for (Employee e : l) { %>
			<li>
				<h3>Nombre: <%= e.first + " " + e.last %></h3>
				<h3>Edad: <%= e.age %></h3>
			</li>
		<% } %>
	</ul>


	
</body>
</html>