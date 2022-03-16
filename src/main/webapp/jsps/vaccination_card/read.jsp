<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Entity1</title>
    
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
  <h1>Read vaccination_card</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/Entity1ServletRead'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	
	UIN    :<input type="text" name="UIN" value="${form.UIN }"/>
	<span style="color: red; font-weight: 900">${errors.UIN }</span>
	<br/>
	name    :<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	first_dose    :<input type="text" name="first_dose" value="${form.first_dose }"/>
	<span style="color: red; font-weight: 900">${errors.first_dose }</span>
	<br/>
	second_dose    :<input type="text" name="second_dose" value="${form.second_dose }"/>
	<span style="color: red; font-weight: 900">${errors.second_dose }</span>
	<br/>
	booster_dose    :<input type="text" name="booster_dose" value="${form.booster_dose }"/>
	<span style="color: red; font-weight: 900">${errors.booster_dose }</span>
	<br/>
	name_of_vaccine    :<input type="text" name="name_of_vaccine" value="${form.name_of_vaccine }"/>
	<span style="color: red; font-weight: 900">${errors.name_of_vaccine }</span>
	<br/>
<%-- 	Password：<input type="password" name="password" value="${form.password }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	Email	：<input type="text" name="email" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/> --%>
	<input type="submit" value="Read vaccination_card"/>
</form>
  </body>
</html>
