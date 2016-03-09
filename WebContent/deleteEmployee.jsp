<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
</head>
<body bgcolor="cyan">
<%
if(session.getAttribute("userName")==null)
	response.sendRedirect("index.jsp");
%>

<h2 align="center">Delete Employee Details</h2>
<hr size="10" color="green" width="80%"></hr>
<form action="EmployeeControllerDelete.action" method="post">
<table align="center" border="10">
<tr>
<th>Enter Employee Number:</th><td><input type="text" name="empNo"></input></td>
</tr>
<tr>
<th><input type="submit" value="Delete"></input></th><td><input type="reset" value="clear"></input></td>
</tr>
</table>

</form>

</body>
</html>