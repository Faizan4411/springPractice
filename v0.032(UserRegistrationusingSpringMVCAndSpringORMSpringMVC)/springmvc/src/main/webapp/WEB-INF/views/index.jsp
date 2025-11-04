
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home page</title>
	</head>
	<body>
		<h1>This is home page</h1>
		<h1>Called by home contreller</h1>
		<h1>url /home</h1>
		
		<%
		
			String name=(String) request.getAttribute("name");
			int number=(int) request.getAttribute("id");
			List<String> friends=(List<String>) request.getAttribute("f");
		%>
		
		<h1>Name is <%=name %></h1>
		<h1>Number is <%=number %></h1>
		<h1>
		<%
			for(String s: friends){
			%>	
			
			
			<h1>Friend Name is:<%=s %></h1>	 
		<%		
			}
		
		%>
		
		</h1>
	
	</body>
</html>