<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ page import="Dto.AoQ,java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>生徒登録確認</title>
</head>
<body>
	<p>登録しました。</p><br>
	<form action="./Register" method="post">
		<p>
			登録<br> 生徒ID ：<input type="number" name="sid" min="1"> 学年
			：<input type="number" name="grade" min="1" max="4"> クラス ：<input
				type="number" name="sclass" min="1" max="2"> 名前 ：<input
				type="text" name="sname"> <input type=submit value="登録">
		</p>
	</form>
	<a href=http://localhost:6356/acquisition_of_a_qualification/StuList>生徒一覧</a>

</body>
</html>