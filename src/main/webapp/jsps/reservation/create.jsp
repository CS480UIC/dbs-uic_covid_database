<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create a Reservation</title>
    
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
  <h1>Create a Reservation</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">

	UIN    :<input type="text" name="UIN" value="${form.UIN }"/>
	<span style="color: red; font-weight: 900">${errors.UIN }</span>
	<br/>
	Reservation Date    :<input type="text" name="reservation_date" value="${form.reservation_date }"/>
	<span style="color: red; font-weight: 900">${errors.reservation_date }</span>
	<br/>
	Reservation Status    :<input type="text" name="reservation_status" value="${form.reservation_status }"/>
	<span style="color: red; font-weight: 900">${errors.reservation_status }</span>
	<br/>	
	Insurance Status    :<input type="text" name="insurance_status" value="${form.insurance_status }"/>
	<span style="color: red; font-weight: 900">${errors.insurance_status }</span>
	<br/>		
	<input type="submit" value="Create a Reservation"/>
</form>
  </body>
</html>
