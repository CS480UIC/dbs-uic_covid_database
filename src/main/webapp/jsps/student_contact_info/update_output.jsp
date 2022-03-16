<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity</title>
    
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
  <h1>Update Entity</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>

	UIN 		:<input type="text" name="uin" value="${entity1.uin }" disabled/>
	<br/>
	Phone Number：<input type="text" name="phone_number" value="${entity1.phone_number }" disabled />
	<br/>
	Email	：<input type="text" name="email1" value="${entity1.email }" disabled/>
	<br/>
	Emergency Contact		：<input type="text" name="emergency_contact" value="${entity1.emergency_contact }" disabled/>
	<br/>
	
	
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
		
				<input type="hidden" name="student_contact_info" value="${entity1.student_contact_info }"/>
				
	Phone Number：<input type="password" name="phone_number" value="${form.phone_number }"/>
	<span style="color: red; font-weight: 900">${errors.phone_number }</span>
	<br/>
	Email	：<input type="text" name="email" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	Emergency Contact	：<input type="text" name="emergency_contact" value="${form.emergency_contact }"/>
	<span style="color: red; font-weight: 900">${errors.emergency_contact }</span>
	<br/>
	
	<input type="submit" value="Update student_contact_info"/>
</form>

</body>
</html>