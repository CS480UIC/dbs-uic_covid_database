<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read student_contact_info Output</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  

  <body>
  <h1>Read student_contact_info Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>

	UIN    :<input type="text" name="uin" value="${entity1.uin }" disabled/>
	<br/>
	Phone Number：<input type="text" name="phone_number" value="${entity1.phone_number }" disabled/>
	<br/>
	Email	：<input type="text" name="email" value="${entity1.email }" disabled/>
	<br/>
	Emergency Contact	：<input type="text" name="emergency_contact" value="${entity1.emergency_contact }" disabled/>
	<br/>
	
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
