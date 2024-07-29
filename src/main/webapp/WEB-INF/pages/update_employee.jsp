<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
    <%@ page isELIgnored="false" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:red; text-align: center;">Update  Employee</h1>



<form action="emp_edit" method="post" >


<table border="1" align="center" bgcolor="cyan">
Employee Id: <input type="text" name="empId" readonly="readonly" value="${emp1.empId }">

First Name: <input type="text" name="firstName" value="${emp1.firstName }">

Job: <input type="text" name="jobId"  value=${emp1.jobId}>

Department: <input type="text" name="deptId" value="${emp1.deptId}">

Salary: <input type="text" name="salary"  value="${emp1.salary}">

<input type="submit" value="update">

</table>
</form>


</body>
</html>