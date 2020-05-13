<%@ page language="java" contentType="text/html; charset=UTF-8" 
	import = "java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML 주석문 -->
	<%
		Date d = new Date();
		String user = request.getParameter("name");
		if (user == null)
			user = "Guest";
		// Java 주석문
	%>
	<h1>
		Hello
		<%=user%>!
		<%-- JSP 주석문  <%=user%> --%>
	</h1>
</body>
</html>