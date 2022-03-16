<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Entity1 Create</title>
    
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
  <h1>student_contact_info Create</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">
	
	UIN:<input type="text" name="uin" value="${form.uin}"/>
	<span style="color: red; font-weight: 900">${errors.uin}</span>
	<br/>
	Phone Number:<input type="text" name="phone_number" value="${form.phone_number}"/>
	<span style="color: red; font-weight: 900">${errors.phone_number}</span>
	<br/>
	Email:<input type="text" name="email" value="${form.email}"/>
	<span style="color: red; font-weight: 900">${errors.email}</span>
	<br/>
	Emergency Contact:<input type="text" name="emergency_contact" value="${form.emergency_contact}"/>
	<span style="color: red; font-weight: 900">${errors.emergency_contact}</span>
	<br/>
	
	<input type="submit" value="Create student_contact_info"/>
</form>
  </body>
</html>
