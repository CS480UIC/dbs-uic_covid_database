<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete uic_classes</title>
    
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
  <h1>Delete uic_classes</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/uic_classesServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
	<input type="hidden" name="UIN" value="${entity1.UIN }"/>
		
	UIN   :<input type="text" name="UIN" value="${entity1.UIN }" disabled/>
	<br/>	
	CRN of classes：<input type="text" name="CRN" value="${entity1.CRN }" disabled/>
	<br/>

	<input type="submit" value="Delete uic_classes"/>
</form>

</body>
</html>
