<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Form filling</title>
	</head>
	
	<body>
		<h3>Complex Form</h3>
		<div class="alert alert-danger" role="alert">
		 <form:errors path="student.*"/>
		</div>
		<form action="handleform" method="post">
			Your Name:<input type="text" name="name"  /><br />
			Your Id:<input type="text" name="id" /><br />
			Your DOB:<input type="text" name="date" placeholder="dd/mm/yyyy" /><br />
			Example Course:
			<select name="courses">
				<option value="java">Java</option>
				<option value="python">Python</option>
				<option value="cbb">C++</option>
				<option value="django">Django</option>
				<option value="spring">Spring</option>
			
			</select><br />
			Select Gender:<input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female" >Female<br />
			Select Type:<select name="stdtype">
				<option value="oldStudent">Old Student</option>
				<option value="normalStudent" >Normal Student</option>
			
			</select ><br />
			Your Address:<input Type="text" name="address.street" placeholder="Enter your Street" /><br />
			<input Type="text" name="address.city" placeholder="Enter your City" />
			
			
			<button type="submit" class="btn btn-primary">Submit</button>
			
		</form>
	
	
	
	</body>
</html>