<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>

<body>

<h2>Employee Form</h2>

<form action="save" method="post">

ID :
<input type="text" name="id">
<br><br>

Name :
<input type="text" name="name">
<br><br>

Department :
<input type="text" name="department">
<br><br>

Salary :
<input type="text" name="salary">
<br><br>

<input type="submit" value="Save Employee">

</form>

</body>
</html>