<%@page import="com.ezen.springmvc.GameController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>닉네임 입력</title>
</head>
<body>

<h3>닉네임을 입력하세요</h3><br>
<form action="saveCookie" method="POST">

	<input type="text" name="user"/>
	<input type="submit" value="확인"/>

</form>


</body>
</html>