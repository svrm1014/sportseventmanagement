<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
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
<meta charset="ISO-8859-1">
<title>Sports Event Management System</title>
</head>
<body>
    <div class="title">Sports Event Management System</div>
    <div class="menu">
    <ul>
    <li><a href="/">HomePage</a></li>
    <li><a href="/admin">Admin</a></li>
    
    </ul>
 </div>  
    <div align="center">
        <h2>Admin Login</h2>
        <form:form action="adminview" method="post" modelAttribute="loginKey">
            <form:label path="userName">User name:</form:label>
            <form:input path="userName"/><br/>
             <br/>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/><br/>
             <br/>            
            <form:button>Submit</form:button>
        </form:form>
   
    </div>
</body>
</html>