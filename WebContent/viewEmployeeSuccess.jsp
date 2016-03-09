<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AView Employee Details</title>
</head>
<body bgcolor="cyan">
<%
if(session.getAttribute("userName")==null)
	response.sendRedirect("index.jsp");
Employee_3908489 obj=(Employee_3908489)request.getAttribute("details");
%>
<h1 align="center">Employee Details</h1>
<hr size="10" width="80%" color="green"></hr>
<h3 align="right"><a href="welcome.jsp">BackToHome</a></h3>

<table align="center" border="10" height="200" width="400" cellspacing="0" style="text-align:center;">
<tr>
<th bgcolor="lightgray">Enter Employee Number:</th><td bgcolor="white"><%=obj.getEmpNo() %></td>
</tr>
<tr>
<th bgcolor="lightgray">Enter Employee Name:</th><td bgcolor="white"><%=obj.getEmpName() %></td>
</tr>
<tr>
<th bgcolor="lightgray">Enter Employee Job:</th><td bgcolor="white"><%=obj.getJob() %></td>
</tr>
<tr>
<th bgcolor="lightgray">Enter Manager ID:</th><td bgcolor="white"><%if(obj.getMgrId()!=null){%><%=obj.getMgrId()%><% }%></td>
</tr>
</table>

</body>
</html>