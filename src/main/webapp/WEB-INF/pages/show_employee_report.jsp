<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:choose>
<c:when test="${!empty emplist}">
<h1 style="color: red; text-align: center;"> Employees Report</h1>
<table border="1" align="center" bgcolor="cyan">


<tr style="color: red"><th>EmpId</th><th>Emp name</th><th>JobId</th><th>salary</th><th>JobId</th></tr>

<c:forEach var="emp" items="${emplist}">
<tr style="color: blue">
<td>${emp.empId}</td>
<td>${emp.firstName}</td>
<td>${emp.jobId}</td>
<td>${emp.salary}</td>
<td>${emp.deptId}</td>
<td><a href="emp_edit?no=${emp.empId}">EDIT</a></td>
<td><a href="emp_delete?no=${emp.empId}">DELETE</a></td>

</c:forEach>

</tr>

</table>

</c:when>



</c:choose>

<center>
<a href="emp_add">ADD EMP</a> &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
<a href="./">HOME</a>
<h2 style="color: green; text-align: center;">${resultMsg}</h2>
</center>




</body>
</html>