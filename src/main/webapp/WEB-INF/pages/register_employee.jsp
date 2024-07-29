<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
    <%@ page isELIgnored="false" %>
    
    <link rel="stylesheet" href="css/style.css" />
    
    <c:url var="actionurl" value="/emp_add"> </c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:red; text-align: center;">Register Employee</h1>



<form action="emp_add" method="post" >


<table border="1" align="center" bgcolor="cyan">
First Name: <input type="text" name="firstName" >
<span id="firstName.errors" class="error" style="color: red"></span>


Job: <input type="text" name="jobId" ><span class="error"></span>

Department: <input type="text" name="deptId" ><span class="error"></span>

Salary: <input type="text" name="salary" ><span class="error"></span>

<input type="submit" value="submit">

</table>
</form>


<%-- <frm:form action="${actionurl}" modelAttribute="emp"  method="POST">
<table align="center" bgcolor="cyan">

<tr>
<td>Employee name</td>
<td><frm:input path="firstName" /></td>
</tr>

<tr>
<td>Job</td>
<td><frm:input path="jobId"/></td>
</tr>

<tr>
<td>Salary</td>
<td><frm:input path="salary"/></td>
</tr>

<tr>
<td>Department</td>
<td><frm:input path="deptId"/></td>
</tr>

<tr>

<frm:button id="submit">submit</frm:button>

</tr>
</table>


</frm:form>
 --%>
</body>
</html>