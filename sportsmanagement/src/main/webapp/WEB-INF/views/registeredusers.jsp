<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<style type="text/css">

.title{
text-align:center;
font-size:30px;
}

ul {
list-style-type:none;
margin:0px;
padding:0px;
background-color:skyblue;
overflow:hidden;
}
li{
float:left;
}
li a{
display:block;
padding : 14px 18px;
color:white;
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
    <li><a href="/addsportsdetails">Add Sports Details</a></li>
    <li><a href="/viewsports">View Sports</a></li>
    <li><a href="/">Logout</a></li>
    
    </ul>
 </div>  
    <div align="left">
        <h2>View</h2>
        <hr>
        <a href="/">Logout</a>
    </div>
    <div align="center">
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>ID</th>
                <th>SportName</th>
                <th>UserName</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>D.O.B</th>
                <th>Gender</th>
                <th>Address</th>
                <th>Status</th>
                
            </tr>
        </thead>
        <tbody>
         <c:forEach var="user" items="${usersKey}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.sportname}" /></td>
                    <td><c:out value="${user.username}" /></td>         
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.mobile }" /></td>
                    <td><c:out value="${user.dob}" /></td>
                    <td><c:out value="${user.gender}" /></td>
                    <td><c:out value="${user.address}" /></td>
                    <td><a href="/sendemail">Accept</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>