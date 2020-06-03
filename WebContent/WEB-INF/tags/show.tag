<%@ tag body-content="scriptless" language="java" pageEncoding="UTF-8"%>

<%@ attribute name="title" required="true" %>
<%@ attribute name="color" required="true" %>

<p>
	<table border="1">
		<tr>
			<th>${title }</th>
		</tr>
		<tr>
			<td bgcolor="${color }"><jsp:doBody></jsp:doBody>
		</tr>
	</table>
</p>

