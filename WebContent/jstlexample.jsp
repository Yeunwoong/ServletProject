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
	//request.setAttribute("name", "<font color=blue>오호</font>");
	
	%>
	<c:set value="Kyung" var="name"/>
	${name}  <br>
	<%=pageContext.getAttribute("name") %>
	<c:out value="${name}" default = "디폴트"/> <br>
	<c:out value="${name}" escapeXml = "false"> </c:out> <br>
	<c:out value="${pageScope.name}"> </c:out> <br>
	
	<c:if test="${name == 'Kyung'}" var="result">
		test result: ${result } <br>
	</c:if>
	
	<c:choose>
		<c:when test="${name == 'Kyung'}">
			Kyung 선택됨 <br>
		</c:when>
		<c:when test="${name == 'Yeun'}">
			Yeun 선택됨 <br>
		</c:when>
		<c:otherwise>
			Kyung, Yeun이 아님
		</c:otherwise>	
	</c:choose>
	
	<%--
	<c:remove var="name"/>
	${name}  <br>
	<c:out value="${name}" default = "디폴트"/> <br>
	
	
	<c:set var="member" value="<%=new Member()%>" /> <br>
	<c:set target="${member}" property="name" value="Yeun" /> <br>
 	<c:out value="${member.name}"/> <br>
	
	
	<c:catch var="errMsg">
		<%=2/0 %>
	</c:catch>
	error message : ${errMsg }
	
		 --%>
	
	
	
</body>
</html>