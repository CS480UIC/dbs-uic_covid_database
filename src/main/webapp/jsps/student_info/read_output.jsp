<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read student_info Output</title>
    
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
  <h1>Read student_info Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	UIN   :<input type="text" name="uin" value="${entity1.uin }" disabled/>
	<br/>
	CRN：<input type="text" name="crn" value="${entity1.crn }" disabled/>
	<br/>
	rec_status	：<input type="text" name="rec_status" value="${entity1.rec_status }" disabled/>
	<br/>
	housing_status    :<input type="text" name="housing_status" value="${entity1.housing_status }" disabled/>
	<br/>
	symp_status：<input type="text" name="symp_status" value="${entity1.symp_status }" disabled/>
	<br/>
	quarantine_start	：<input type="text" name="quarantine_start" value="${entity1.quarantine_start }" disabled/>
	<br/>
	quarantine_end    :<input type="text" name="quarantine_end" value="${entity1.quarantine_end }" disabled/>
	<br/>
	last_test_result：<input type="text" name="last_test_result" value="${entity1.last_test_result }" disabled/>
	<br/>
	vaccine_status	：<input type="text" name="vaccine_status" value="${entity1.vaccine_status }" disabled/>
	<br/>
	recent_travel_status	：<input type="text" name="recent_travel_status" value="${entity1.recent_travel_status }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
