<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Create a New Entry</title>
    
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
  <h1>Create a New Entry</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">
	UIN    :<input type="text" name="UIN" value="${form.UIN }"/>
	<span style="color: red; font-weight: 900">${errors.UIN }</span>
	<br/>
	Total Cases    :<input type="text" name="total_cases" value="${form.total_cases }"/>
	<span style="color: red; font-weight: 900">${errors.total_cases }</span>
	<br/>	
	Active Cases    :<input type="text" name="active_cases" value="${form.active_cases }"/>
	<span style="color: red; font-weight: 900">${errors.active_cases }</span>
	<br/>	
	Cured Cases    :<input type="text" name="cured_cases" value="${form.cured_cases }"/>
	<span style="color: red; font-weight: 900">${errors.cured_cases }</span>
	<br/>		
	Test Result    :<input type="text" name="test_result" value="${form.test_result }"/>
	<span style="color: red; font-weight: 900">${errors.test_result }</span>
	<br/>	
	Vaccinated Count    :<input type="text" name="vaccinated_count" value="${form.vaccinated_count }"/>
	<span style="color: red; font-weight: 900">${errors.vaccinated_count }</span>
	<br/>
	Unvaccinated Count    :<input type="text" name="unvaccinated_count" value="${form.unvaccinated_count }"/>
	<span style="color: red; font-weight: 900">${errors.unvaccinated_count }</span>
	<br/>	
	<input type="submit" value="Create a New Entry"/>
</form>
  </body>
</html>
