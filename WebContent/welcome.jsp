<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Crud Operation</title>
</head>
<body bgcolor="cyan" text="red">
<%
if(session.getAttribute("userName")==null)
	request.getRequestDispatcher("index.jsp").forward(request,response);
%>
<h2 align="center">Employee Management</h2>
<hr size="10" color="green" width="80%">

<table align="left">
<tr>
<td><a href="addEmployee.jsp">Add Employee</a></td>
</tr>
<tr>
<td><a href="updateEmployee.jsp">Update Employee</a></td>
</tr>
<tr>
<td><a href="deleteEmployee.jsp">Delete Employee</a></td>
</tr>
<tr>
<td><a href="viewEmployee.jsp">View Employee</a></td>
</tr>
</table>
<table align="right">
<tr>
<td><a href="LoginController.action?action=logout">Logout</a></td>
</tr>
</table>
</body>
</html>