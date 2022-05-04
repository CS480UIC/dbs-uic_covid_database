<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Display Dose Date </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>First_Dose</th>
		<th>Second_Dose</th>
	</tr>
<c:forEach items="${vaccination_cardList}" var="vaccination_card">
	<tr>
		<td>${vaccination_card.first_dose}</td>
		<td>${vaccination_card.second_date}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>



