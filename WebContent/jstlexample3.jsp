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
	<h3>구구단</h3>
	<c:forEach var="i" begin="2" end="9">
		<c:forEach var="j" begin="1" end="9">
			${"결과:" } ${i } * ${j } = ${i*j } <br>
		</c:forEach> <br>
	</c:forEach> 
	
	<%
	for(int i=2;i<10;i++){
		for(int j=1;j<10;j++){ 	
			out.print("결과: ");	 
			out.print(i+"*"+j+"="+(i*j));  %> <br>
		<%}%> <br>
	<%} %>
	
</body>
</html>