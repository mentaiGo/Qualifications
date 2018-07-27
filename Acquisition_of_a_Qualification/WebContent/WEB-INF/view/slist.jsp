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
	<form action="./Register" method="post">
		<p>
			登録<br> 生徒ID ：<input type="number" name="sid" min="1"> 学年
			：<input type="number" name="grade" min="1" max="4"> クラス ：<input
				type="number" name="class" min="1" max="2"> 名前 ：<input
				type="text" name="sname"> <input type="submit" value="登録">
		</p>
	</form>
</body>
</html>