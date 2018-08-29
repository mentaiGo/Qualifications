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
	<table border=1>
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

	<form action="./AddQualifications" method="post">
		<p>
		<!-- 生徒IDをDBから持ってきて選べるようにしたい -->
			資格登録<br> 生徒ID ：<input type="number" name="sid" min="1">
			資格名前 ：<input type=text name="qoname"> 日時 ：<input type="date"
				name="exa"> 合否 ：<select name="sof">
				<option value="合格">合格</option>
				<option value="不合格">不合格</option>
			</select> <input type=submit value="登録">
		</p>
	</form>

	<br>
	<a href=http://localhost:6356/acquisition_of_a_qualification/Relay>生徒登録</a>
	<br>
	<a href=http://localhost:6356/acquisition_of_a_qualification/QuaList>資格一覧</a>

</body>
</html>