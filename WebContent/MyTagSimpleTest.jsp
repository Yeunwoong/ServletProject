<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "/WEB-INF/tld/MySimpleTag.tld" prefix="mytag"%>
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

<mytag:print/> <br>
<mytag:bodyPrint>${name }</mytag:bodyPrint> <br>

<mytag:sum num1="5" num2="2"/>

</body>
</html>