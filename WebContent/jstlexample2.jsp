<%@page import="java.util.ArrayList"%>
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
	<%
	ArrayList<Member> members = new ArrayList<Member>();
	members.add(new Member(1, "Kyung", "123"));
	members.add(new Member(2, "Yeun", "123"));
	members.add(new Member(3, "Woong", "123"));	
	%>

	<c:set var="members" value="<%=members %>"/>
	<c:forEach items="${members }" var="member">
		${member.id } / ${member.name } / ${member.pw } <br>
	</c:forEach>
	
	<c:forEach var="n" begin="1" end="10" step="2">
		${n }
	</c:forEach>
	
</body>
</html>