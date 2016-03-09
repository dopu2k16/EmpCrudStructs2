<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,model.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Employee</title>
</head>
<body bgcolor="cyan">
<%
if(session.getAttribute("userName")==null)
	response.sendRedirect("index.jsp");
%>
<h2 align="center">All Employee Details</h2>
<hr size="10" color="green" width="80%"></hr>
<h3 align="right"><a href="welcome.jsp">BackToHome</a></h3>
<table align="center" border="10" width="900" cellspacing="0" style="text-align:center;">
<tr bgcolor="lightgray">
<td>Enter Employee Number:</td>
<td>Enter Employee Name:</td>
<td>Enter Employee Job:</td>
<td>Enter Manager ID:</td>
</tr>
<% ArrayList <Employee_3908489> al=(ArrayList)request.getAttribute("details");
Iterator<Employee_3908489> it=al.iterator();
while(it.hasNext()){
	//if(it instanceof Employee_3908489 )
	Employee_3908489 e=(Employee_3908489)it.next();
%>
<tr bgcolor="white">
<td><%=e.getEmpNo()%></td>
<td><%=e.getEmpName()%></td>
<td><%=e.getJob()%></td>
<td><%if(e.getMgrId()!=null){%><%=e.getMgrId()%><% }%></td>
</tr>
<tr>
</tr>
<%} %>
</table>

</body>
</html>