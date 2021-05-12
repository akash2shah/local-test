<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Editcustomer" method="post">

Employee First Name : <input type="text" name="employeeFirstName" /><br><br>
Employee Last Name : <input type="text" name="employeeLastName" /><br><br>
Age : <input type="text" name="employeeAge"/><br><br>
Gender : <input type="checkbox" id="male" name="employeeGender">
<lable for="male">Male</lable>
<input type="checkbox" id="female" name="employeeGender">
<lable for="female">Female</lable><br><br>
Contact No. : <input type="text" name="employeeContact"/><br><br>

</form>
</body>
</html>