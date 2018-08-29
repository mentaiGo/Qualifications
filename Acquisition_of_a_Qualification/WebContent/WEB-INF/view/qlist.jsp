<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Dto.AoQ,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>資格取得情報</title>
</head>
<body>
	<p>資格取得状況</p>
	<table border="1">
		<tr>
			<th>生徒ID</th>
			<th>生徒名前</th>
			<th>資格名前</th>
			<th>受験日</th>
			<th>合否</th>
		</tr>
		<%
			@SuppressWarnings("unchecked")
			ArrayList<AoQ> list = (ArrayList<AoQ>) request.getAttribute("showlist");
		%>
		<%
			for (AoQ st : list) {
		%>
		<tr>
			<td><%=st.getSid()%></td>
			<td><%=st.getSchar()%></td>
			<td><%=st.getQna()%></td>
			<td><%=st.getExa()%></td>
			<td>
				<%
					if (st.getSo() == true) {
				%> 合格 <%
					} else {
				%> 不合格 <%
					}
				%>
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<a href=http://localhost:6356/acquisition_of_a_qualification/StuList>生徒画面</a>
</body>
</html>