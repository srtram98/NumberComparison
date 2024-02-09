<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Equal Comparison</title>
</head>
<body>
	<p>${comparedNumbers.getUserNum1()} was the first number. <br />
	${comparedNumbers.getUserNum2()} was the second number. <br />
	Neither number is bigger than the other, so the difference between the two equal numbers is ${comparedNumbers.getDifference()}. <br />
	</p>
	<a href="index.jsp">Compare more numbers</a>
</body>
</html>