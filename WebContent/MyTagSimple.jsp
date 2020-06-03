<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="WEB-INF/tld/MyTagSimple.tld" prefix="mytag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<mytag:print/> <br>
	<mytag:bodyPrint>"Kyung"</mytag:bodyPrint> <br>
	<mytag:sum num2="2" num1="5"></mytag:sum> <br>
	
	<mytag:quickSort num5="5" num4="11" num3="31" num2="3" num1="77"></mytag:quickSort>
</body>
</html>