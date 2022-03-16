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
  <h1>Update uic_classes</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	CRN：<input type="text" name="crn" value="${entity1.crn }" disabled />
	<br/>
	UIN of classes	：<input type="text" name="uin_of_classes" value="${entity1.uin_of_classes }" disabled/>
	<br/>
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/Entity1ServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="uic_classes" value="${entity1.uic_classes }"/>
				
	CRN：<input type="password" name="crn" value="${form.crn }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	UIN of classes	：<input type="text" name="uin_of_classes" value="${form.uin_of_classes }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>
	
	<input type="submit" value="Update uic_classes"/>
</form>

</body>
</html>
