<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sports Event Management System</title>
</head>
<body>
<div class="title">Sports Event Management System</div>
	<div class="menu">
		<ul>
			<li><a href="/adminviewpage">HomePage</a></li>
			<li><a href="/addsportsdetails">Add Sports Details</a></li>
			<li><a href="/viewsports">View Sports</a></li>
			<li><a href="/admin">Logout</a></li>

		</ul>
	</div>
	<div align="left">
		<h2>View Sports</h2>
	</div>
	<div align="center">
    <h1>SportsDetails</h1>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>ID</th>
                <th>SportName</th>
                <th>CollegeName</th>
                <th>Location</th>
                <th>Date</th>
                <th>FirstPrice</th>
                <th>SecondPrice</th>
                <th>ThirdPrice</th>
                
            </tr>
        </thead>
        <tbody>
         <c:forEach var="addsportsdetails" items="${viewsportsKey}">
                <tr>
                    <td><c:out value="${addsportsdetails.id}" /></td>
                    <td><c:out value="${addsportsdetails.sportname}" /></td>
                    <td><c:out value="${addsportsdetails.collegename}" /></td>
                    <td><c:out value="${addsportsdetails.location}" /></td>
                    <td><c:out value="${addsportsdetails.date}" /></td>
                    <td><c:out value="${addsportsdetails.firstprice}" /></td>
                    <td><c:out value="${addsportsdetails.secondprice}" /></td>
                    <td><c:out value="${addsportsdetails.thirdprice}" /></td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>