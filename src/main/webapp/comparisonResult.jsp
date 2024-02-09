<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Comparison Results</title>
</head>
<body>
	<p>${comparedNumbers.getUserNum1()} was the first number. <br />
	${comparedNumbers.getUserNum2()} was the second number. <br />
	${comparedNumbers.getBigNum()} is bigger than ${comparedNumbers.getSmallNum()}. <br />
	The difference between the two numbers is ${comparedNumbers.getDifference()} <br />
	</p>
	<a href="index.jsp">Compare more numbers</a>
</body>
</html>