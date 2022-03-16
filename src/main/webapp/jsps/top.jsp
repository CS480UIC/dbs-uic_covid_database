<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	here hello 
	-->
<style type="text/css">
	body {
		background: #00FFFF; 
	}
	a {
		text-transform:none;
		text-decoration:none;
	} 
	a:hover {
		text-decoration:underline;
	}
</style>
  </head>
  <body>
<h1 style="text-align: center;">uic_covid_database</h1>

<div style="font-size: 10pt;">
	<c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<a href="<c:url value='/jsps/user/login.jsp'/>" target="_parent">Login</a> |&nbsp; 
			<a href="<c:url value='/jsps/user/regist.jsp'/>" target="_parent">Register</a> |&nbsp; 
	
		</c:when>
		<c:otherwise>
			Hello：${sessionScope.session_user.username };
			<a href="<c:url value='/jsps/user/queries.jsp'/>" target="body">Query Result</a> |&nbsp;&nbsp;
			<a href="<c:url value='/UserServletLogout'/>" target="_parent">Logout</a> |&nbsp;
<%-- 			<a href="<c:url value='/jsps/entity1/menu.jsp'/>" target="body">CRUD entity 1</a> |&nbsp;&nbsp; --%>
			<a href="<c:url value='/jsps/login_user/menu.jsp'/>" target="body">CRUD for Login User</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/payment/menu.jsp'/>" target="body">CRUD for Payment</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/reservation/menu.jsp'/>" target="body">CRUD for Reservation</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/student_contact_info/menu.jsp'/>" target="body">CRUD for Student Contact Info</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/student_info/menu.jsp'/>" target="body">CRUD for Student Info</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/uic_classes/menu.jsp'/>" target="body">CRUD for UIC Classes</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/uic_covid_database/menu.jsp'/>" target="body">CRUD for UIC Covid Database</a> |&nbsp;&nbsp;
			<a href="<c:url value='/jsps/vaccination_card/menu.jsp'/>" target="body">CRUD for Vaccination Card</a> |&nbsp;&nbsp;
			
		</c:otherwise>
	</c:choose>

</div>
  </body>
</html>

