<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity1</title>
    
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
  <h1>Delete vaccination_card</h1>
<form action="<c:url value='/vaccination_cardServletDelete'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	
	Delete UIN   :<input type="text" name="UIN" value="${form.UIN }"/>
	<span style="color: red; font-weight: 900">${errors.UIN }</span>
	<br/>
	Delete name   :<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	Delete first_dose   :<input type="text" name="first_dose" value="${form.first_dose }"/>
	<span style="color: red; font-weight: 900">${errors.first_dose }</span>
	<br/>
	Delete second_dose   :<input type="text" name="second_dose" value="${form.second_dose }"/>
	<span style="color: red; font-weight: 900">${errors.second_dose }</span>
	<br/>
	Delete booster_dose   :<input type="text" name="booster_dose" value="${form.booster_dose }"/>
	<span style="color: red; font-weight: 900">${errors.booster_dose }</span>
	<br/>
	Delete name_of_vaccine   :<input type="text" name="name_of_vaccine" value="${form.name_of_vaccine }"/>
	<span style="color: red; font-weight: 900">${errors.name_of_vaccine }</span>
	<br/>
	
	<input type="submit" value="Delete vaccination_card"/>
</form>
  </body>
</html>
