<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>addEmployee</title>
</head>
<body bgcolor="cyan" text="red">
<%
if(session.getAttribute("userName")==null)
	request.getRequestDispatcher("index.jsp").forward(request,response);
%>

<h2 align="center">Add Employee Details</h2>
<hr size="10" color="green" width="80%"></hr>
<form action="EmployeeControllerAdd.action" method="post">
<table align="center" border="10">
<tr>
<th>Enter Employee Number:</th><td><input type="text" name="empNo"></input></td>
</tr>
<tr>
<th>Enter Employee Name:</th><td><input type="text" name="empName"></input></td>
</tr>
<tr>
<th>Enter Employee Job:</th><td><input type="text" name="job"></input></td>
</tr>
<tr>
<th>Enter Manager ID:</th><td><input type="text" name="mgrId"></input></td>
</tr>
<tr>
<th><input type="submit" value="Add"></input></th><td><input type="reset" value="clear"></input></td>
</tr>
</table>
</form>

</body>
</html>