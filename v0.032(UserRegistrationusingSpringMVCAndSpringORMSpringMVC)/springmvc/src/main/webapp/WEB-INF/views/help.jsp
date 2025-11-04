<%@page import="java.time.LocalDateTime"%>
<%@page import="net.bytebuddy.asm.Advice.Local"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>help Page</title>
	</head>
	<body>
	
	
	<% 
	
	/* 	String name=(String)request.getAttribute("name");
		int number=(int)request.getAttribute("rollnumber");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	 */
	%>
	
	
	
	
		 <h1>Hello my name is Faizan</h1>
		<h1>This is help page</h1>
	
		<h1>Name is :${name}<%--  <%=name %> --%></h1>
		<h1>Roll Number:${rollnumber}  <%-- <%=number %> --%></h1>
		<h1>Time: ${time}  <%-- <%=time.toString() %> --%></h1>
	
		<hr>
		
		<c:forEach var="item" items="${marks}">
		
			<h1>${item}</h1> 
			<%-- <c:out value="${item}"></c:out> --%>
			
		
		</c:forEach>
		
		
	
	
	
		
	
	</body>
</html>