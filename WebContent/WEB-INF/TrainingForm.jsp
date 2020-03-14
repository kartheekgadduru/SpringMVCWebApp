<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${heading}</h2>
<form action="/SpringMVCWebApp/submitform.html" method ="post">
<table>
<tr><td>Student's name</td> <td><input type="text" name="studentName"></td></tr>
<tr><td>Student's Mobile</td> <td><input type="text" name="studentemail"></td></tr>
<tr><td>Student's DOB</td> <td><input type="text" name="studentdob"></td></tr>
<tr><td>Student's Addres_sector</td> <td><input type="text" name="address.sector"></td></tr>
<tr><td>Student's Address_street</td> <td><input type="text" name="address.street"></td></tr>
<tr><td>Student's Address_city</td> <td><input type="text" name="address.city"></td></tr>
</table>
<input type="submit" value="sumbit">
</form>

</body>
</html>