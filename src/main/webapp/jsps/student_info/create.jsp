<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>student_info Create</title>
    
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
  <h1>student_info Create</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">

	UIN    :<input type="text" name="uin" value="${form.uin }"/>
	<span style="color: red; font-weight: 900">${errors.uin }</span>
	<br/>
	CRN：<input type="password" name="crn" value="${form.crn }"/>
	<span style="color: red; font-weight: 900">${errors.crn }</span>
	<br/>
	rec_status	：<input type="text" name="rec_status" value="${form.rec_status }"/>
	<span style="color: red; font-weight: 900">${errors.rec_status }</span>
	<br/>
	housing_status    :<input type="text" name="housing_status" value="${form.housing_status }"/>
	<span style="color: red; font-weight: 900">${errors.housing_status }</span>
	<br/>
	symp_status：<input type="password" name="symp_status" value="${form.symp_status }"/>
	<span style="color: red; font-weight: 900">${errors.symp_status }</span>
	<br/>
	quarantine_start	：<input type="text" name="quarantine_start" value="${form.quarantine_start }"/>
	<span style="color: red; font-weight: 900">${errors.quarantine_start }</span>
	<br/>
	quarantine_end    :<input type="text" name="quarantine_end" value="${form.quarantine_end }"/>
	<span style="color: red; font-weight: 900">${errors.quarantine_end }</span>
	<br/>
	last_test_result：<input type="password" name="last_test_result" value="${form.last_test_result }"/>
	<span style="color: red; font-weight: 900">${errors.last_test_result }</span>
	<br/>
	vaccine_status	：<input type="text" name="vaccine_status" value="${form.vaccine_status }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_status }</span>
	<br/>
	recent_travel_status	：<input type="text" name="recent_travel_status" value="${form.recent_travel_status }"/>
	<span style="color: red; font-weight: 900">${errors.recent_travel_status }</span>
	<br/>

	
	<input type="submit" value="Create student_info"/>
</form>
  </body>
</html>
