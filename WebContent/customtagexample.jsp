<%@ taglib tagdir="/WEB-INF/tags" prefix="mytag" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setAttribute("name", "Kyung");
%>
<body>
	<mytag:line/>
	오늘 날짜는 : <mytag:time/>
	<mytag:line/>
	
	<mytag:sum num2="5" num1="2"/>
	
	<mytag:chart>${name }</mytag:chart>
</body>
</html>