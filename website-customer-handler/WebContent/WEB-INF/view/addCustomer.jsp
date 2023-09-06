<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Customer</title>
<!-- reference style sheet -->
<link type="text/css"
       rel="stylesheet"
       href="${pageContext.request.contextPath}/resources/css/style.css" />


</head>
<body>
 <div id="wrapper"> 
	 <div id="header">
	     <h2>
	     CRM-Customer Relationship Manager
	     </h2>
	 </div>
	</div>

<div id="container">
<h3>Save Customer</h3>
	<form:form action="addNewCustomer" modelAttribute="newCustomer" method="get">
	First Name: <form:input type="text" name="firstName" placeholder="first name" path="firstName" />
	<br><br>
	Last Name: <form:input type="text" name="lastName" placeholder="last name" path="lastName"/>
	<br><br>
	Email:     <form:input type="text" name="email" placeholder="email" path="email"/>
	<br><br>
	<input type="submit" />
	</form:form>
</div>




</body>
</html>