<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Comparing Numbers</title>
</head>
<body>
	<h1>Comparing Numbers</h1>
	<form action="getComparisonServlet" method="post">
	Enter numbers to compare and see which is bigger: <br />
	Number 1: 
	<input type="text" name="userNum1" size="10"><br />
	Number 2:
	<input type="text" name="userNum2" size="10"><br />
	<input type="submit" value="Compare Numbers">
	</form>
</body>
</html>