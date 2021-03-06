<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.title {
	text-align: center;
	font-size: 30px;
}

ul {
	list-style-type: none;
	margin: 0px;
	padding: 0px;
	background-color: skyblue;
	overflow: hidden;
}

li {
	float: left;
}

li a {
	display: block;
	padding: 14px 18px;
	color: white;
}

form {
	display: inline-block;
	text-align: right;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sports Event Management</title>
</head>
<body>
<div class="title">Sports Event Management System</div>
	<div class="menu">
		<ul>
			<li><a href="/">HomePage</a></li>
		</ul>
	</div>
	<div align="center">
		 
		<h2>User Registration Form</h2>
		<hr>
		        
		<form:form action="registrationsave" method="post"
			modelAttribute="formKey">
			
            <form:label path="sportname">Sport Name:</form:label>
            <form:input path="sportname" />
			<br />
            <br />
            <form:label path="username">User Name:</form:label>
            <form:input path="username" />
			<br />
			<br />
			<form:label path="email">Email:</form:label>
            <form:input type="email"  path="email" />
			<br />
			<br />
			<form:label path="mobile">Mobile:</form:label>
            <form:input path="mobile" />
            <br />    
			<br />            
            <form:label path="dob" placeholder="MM/DD/YYYY" >Date Of Birth:</form:label>
            <form:input type ="date" path="dob" class="dob" name="dob" pattern="MM/DD/YYYY" />
			<br />
			<br />
            <form:label path="gender">Gender:</form:label>
			<form:radiobutton path="gender" value="Male"/>Male
            <form:radiobutton path="gender" value="Female"/>Female
            <form:radiobutton path="gender" value="Male"/>Other<br/>    
 			<br />
			<br />
            <form:label path="address">Address:</form:label>
            <form:textarea path="address" />
			<br />
            <br />
            <form:button>Register</form:button>
        </form:form>
		
	</div>


</body>
</html>