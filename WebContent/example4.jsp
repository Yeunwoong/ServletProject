<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>선언문 테스트</h3>
	<%! 
	public int sum(PageContext p){
		int a = Integer.valueOf(p.getRequest().getParameter("a"));
		int b = Integer.valueOf(p.getRequest().getParameter("b"));
		return a+b;	
	}
	%>
	
	덧셈의 결과:
	<%= sum(pageContext) %>
</body>
</html>