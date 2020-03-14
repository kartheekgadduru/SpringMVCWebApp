<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<h1>${heading}</h1> --%>
	 
	 
	
	<table>
		<tr>
			<td>Student's name</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student's email</td>
			<td> ${student.studentemail}</td>
		</tr>
		<tr>
			<td>Student's DOB</td>
			<td>${student.studentdob}</td>
		</tr>
		<tr>
			<td>Student's Addres_sector</td>
			<td>${student.address.sector}</td>
		</tr>
		<tr>
			<td>Student's Address_street</td>
			<td>${student.address.street}</td>
		</tr>
		<tr>
			<td>Student's Address_city</td>
			<td>${student.address.city}</td>
		</tr>



	</table>


</body>
</html>