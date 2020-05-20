<%@tag import="java.util.Calendar"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty"%>

<% Calendar date = Calendar.getInstance(); %>

<%=date.get(Calendar.YEAR) %>-
<%=date.get(Calendar.MONTH)+1 %>-
<%=date.get(Calendar.DATE) %>
