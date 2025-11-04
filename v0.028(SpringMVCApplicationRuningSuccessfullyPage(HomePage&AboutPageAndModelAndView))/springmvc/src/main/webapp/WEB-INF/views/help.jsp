<%@page import="java.time.LocalDateTime"%>
<%@page import="net.bytebuddy.asm.Advice.Local"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>help Page</title>
	</head>
	<body>
	
	
	<% 
	
		String name=(String)request.getAttribute("name");
		int number=(int)request.getAttribute("rollnumber");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	
	%>
	
	
	
	
		<h1>Hello my name is Faizan</h1>
		<h1>This is help page</h1>
	
		<h1>Name is : <%=name %></h1>
		<h1>Roll Number: <%=number %></h1>
		<h1>Time: <%=time.toString() %></h1>
	
	
	
	
	
		
	
	</body>
</html>