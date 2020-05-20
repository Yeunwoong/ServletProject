<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>	
<body>
	<%
	request.setAttribute("-ids", "KyungId");
	request.setAttribute("new", "KyungNew");
	request.setAttribute("name", "Kyung");
	session.setAttribute("name", "Yeun");
	application.setAttribute("name", "Woong");
	%>
	${requestScope.-ids } <br>
	${requestScope.new } <br>
	${requestScope.name}  <br>
	${sessionScope.name } <br>
	${applicationScope.name } <br>
	${name}  <br>	
</body>
</html>