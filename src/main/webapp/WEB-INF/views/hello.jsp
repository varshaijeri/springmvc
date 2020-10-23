<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<%
		Integer id = (Integer) request.getAttribute("id");
	String firstname = (String) request.getAttribute("firstname");
	String lastname = (String) request.getAttribute("lastname");
	/* out.println("ID: "+id);
	out.println("firstname: "+firstname);
	out.println("lastname: "+lastname); */
	%>
	Id:
	<b><%=id%></b>
	<br /> first name:
	<b><%=firstname%></b>
	<br /> last name:
	<b><%=lastname%></b>
</body>
</html>