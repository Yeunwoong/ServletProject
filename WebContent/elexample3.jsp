<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	${param.value}<br>
	${empty param.value}<br>
	${param.value > 5}<br>
	${param.value gt 5}<br>
	
	${empty param.value} <br>
	
	${param.value/2 } <br>	
</body>
</html>