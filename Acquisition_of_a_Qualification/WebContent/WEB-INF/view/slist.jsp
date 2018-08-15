<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Dto.AoQ,java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>生徒一覧</title>
<link rel="stylesheet" href="Acquisition_of_a_Qualification/css/style.css">
</head>
<body>
	<p>生徒一覧</p>
	<table>
		<tr>
			<th>生徒ID</th>
			<th>学年</th>
			<th>組</th>
			<th>名前</th>
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
			<td><%=st.getGrade()%></td>
			<td><%=st.getSclass()%></td>
			<td><%=st.getSchar()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href=http://localhost:6356/acquisition_of_a_qualification/Relay>生徒登録画面へ</a>
</body>
</html>