<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.varsha.spring.springmvc.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<style type="text/css">
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #0080ff;
  color: black;
}
</style>
</head>
<body>
<h1 style="text-align: center;">Employee List</h1>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	%>
	<table>
		<tr>
			<th>id</th>
			<th>First name</th>
			<th>Last name</th>
		</tr>
		<%
			for (Employee employee : employees) {
			Integer id = employee.getId();
			String firstname = employee.getFirstname();
			String lastname = employee.getLastname();
		%>
		<tr>
			<td><%=id%></td>
			<td><%=firstname%></td>
			<td><%=lastname%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>