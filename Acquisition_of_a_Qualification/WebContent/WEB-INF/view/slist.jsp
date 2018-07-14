<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Dto.AoQ,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>生徒一覧</title>
</head>
<body>
	<p>生徒一覧</p>
	<table border="1">
		<tr>
			<th>生徒ID</th>
			<th>名前</th>
			<th>学年</th>
			<th>組</th>
		</tr>
		<%
			@SuppressWarnings("unchecked")
			ArrayList<AoQ> slist = (ArrayList<AoQ>) request.getAttribute("st");
		%>
		<%
			for (AoQ st : slist) {
		%>
		<tr>
			<td><%=st.getStid()%></td>
			<td><%=st.getSchar()%></td>
			<td><%=st.getGrade()%></td>
			<td><%=st.getSclass()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>