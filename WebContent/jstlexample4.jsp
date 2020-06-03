<%@page import="com.hanshin.database.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>	
<body>
	<c:url value="jstlexample3.jsp" var="target">
		<c:param name="name" value="Kyung"/>
	</c:url>
	${target } <br>
	
	
	<c:set value="jstlexample3.jsp?name=Kyung" var="target2"/>
	${target2 } <br>
	
	
	
	
</body>
</html>