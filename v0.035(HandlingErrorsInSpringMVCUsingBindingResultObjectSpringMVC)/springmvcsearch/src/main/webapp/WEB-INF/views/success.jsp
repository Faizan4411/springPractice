<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Success page is runing</h1>
	<h3>My Name is: ${student.name }</h3>
	<h3>My Id is: ${student.id} </h3>
	<h3>My Date is: ${student.date}</h3>
	<h3>My Courses is: ${student.courses} </h3>
	<h3>My Gender is: ${student.gender} </h3>
	<h3>My Stdtype is: ${student.stdtype} </h3>
	<h3>My street is: ${student.address.street} </h3>
	<h3>My  is: ${student.address.city} </h3>
	
</body>
</html>