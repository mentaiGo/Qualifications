<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>生徒登録</title>
</head>
<body>
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