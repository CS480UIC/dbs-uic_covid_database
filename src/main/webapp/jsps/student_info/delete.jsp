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
  <h1>Delete Entity1</h1>
<form action="<c:url value='/Entity1ServletDelete'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	
	Delete UIN   :<input type="text" name="uin" value="${form.uin }"/>
	<span style="color: red; font-weight: 900">${errors.uin }</span>
	<br/>
	Delete CRN   :<input type="text" name="crn" value="${form.crn }"/>
	<span style="color: red; font-weight: 900">${errors.crn }</span>
	<br/>
	Delete rec_status   :<input type="text" name="rec_status" value="${form.rec_status }"/>
	<span style="color: red; font-weight: 900">${errors.rec_status }</span>
	<br/>
	Delete housing_status   :<input type="text" name="housing_status" value="${form.housing_status }"/>
	<span style="color: red; font-weight: 900">${errors.housing_status }</span>
	<br/>
	Delete symp_status   :<input type="text" name="symp_status" value="${form.symp_status }"/>
	<span style="color: red; font-weight: 900">${errors.symp_status }</span>
	<br/>
	Delete quarantine_start   :<input type="text" name="quarantine_start" value="${form.quarantine_start }"/>
	<span style="color: red; font-weight: 900">${errors.quarantine_start }</span>
	<br/>
	Delete quarantine_end   :<input type="text" name="quarantine_end" value="${form.quarantine_end }"/>
	<span style="color: red; font-weight: 900">${errors.quarantine_end }</span>
	<br/>
	Delete last_test_result   :<input type="text" name="last_test_result" value="${form.last_test_result }"/>
	<span style="color: red; font-weight: 900">${errors.last_test_result }</span>
	<br/>
	Delete vaccine_status   :<input type="text" name="vaccine_status" value="${form.vaccine_status }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_status }</span>
	<br/>
	Delete recent_travel_status   :<input type="text" name="recent_travel_status" value="${form.recent_travel_status }"/>
	<span style="color: red; font-weight: 900">${errors.recent_travel_status }</span>
	<br/>
	
	<input type="submit" value="Delete student_info"/>
</form>
  </body>
</html>
