<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create a Payment</title>
    
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
  <h1>Create a Payment</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">

	UIN    :<input type="text" name="UIN" value="${form.UIN }"/>
	<span style="color: red; font-weight: 900">${errors.UIN }</span>
	<br/>
	Payment Date    :<input type="text" name="payment_date" value="${form.payment_date }"/>
	<span style="color: red; font-weight: 900">${errors.payment_date }</span>
	<br/>	
	Duration of Stay    :<input type="text" name="duration_of_stay" value="${form.duration_of_stay }"/>
	<span style="color: red; font-weight: 900">${errors.duration_of_stay }</span>
	<br/>	
	Amount    :<input type="text" name="amount" value="${form.amount }"/>
	<span style="color: red; font-weight: 900">${errors.amount }</span>
	<br/>		
	Payment ID    :<input type="text" name="payment_id" value="${form.payment_id }"/>
	<span style="color: red; font-weight: 900">${errors.payment_id }</span>
	<br/>		
	<input type="submit" value="Create a Payment"/>
</form>
  </body>
</html>
