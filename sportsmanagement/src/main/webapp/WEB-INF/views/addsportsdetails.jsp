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
<title>Sports Event Management System</title>
</head>
<body>
	<div class="title">Sports Event Management System</div>
	<div class="menu">
		<ul>
			<li><a href="/">HomePage</a></li>
			<li><a href="/addsportsdetails">Add Sports Details</a></li>
			<li><a href="/viewsports">View Sports</a></li>
			<li><a href="/admin">Logout</a></li>

		</ul>
	</div>
	<div align="left">
		<h2>View</h2>
	</div>
	<div align="center">
		 
		<h2>Add Sports Details</h2>
		<hr>
		        
		<form:form action="sportsdetails" method="post"
			modelAttribute="sportsdetailsKey">
			
            <form:label path="sportname">Sport Name:</form:label>
            <form:input path="sportname" />
			<br />
             <br />
            <form:label path="collegename">College Name:</form:label>
            <form:input path="collegename" />
			<br />
             <br />
            <form:label path="location">Location:</form:label>
            <form:input path="location" />
			<br />      
 			<br />
            <form:label path="date" placeholder="MM/DD/YYYY" >Date:</form:label>
            <form:input type ="date" path="date" class="date" name="date" pattern="MM/DD/YYYY" />
			<br />
             <br />
           <form:label path="firstprice">1stPrice:</form:label>
            <form:input path="firstprice" />
			<br />
             <br />
            <form:label path="secondprice">2ndPrice:</form:label>
              <form:input path="secondprice" />
			<br />     
 			 <br />
            <form:label path="thirdprice">3rdPrice:</form:label>
           <form:input path="thirdprice" />
			<br />
             <br />
            <form:button>Submit</form:button>
        </form:form>
		
	</div>

</body>
</html>