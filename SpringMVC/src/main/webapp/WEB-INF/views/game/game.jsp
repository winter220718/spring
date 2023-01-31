<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가위바위보</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/rsp.css" type="text/css">
</head>
<body>

	<c:set var="computer_score" value="5"/>
	<c:set var="user" value="${user }"/>
	<c:set var="user_score" value="5"/>

	가위바위보를 내세요 >
	<form action="userPick" method="POST">
		<button type="submit" name="rsp" value="가위">가위</button>
		<button type="submit" name="rsp" value="바위">바위</button>
		<button type="submit" name="rsp" value="보">보</button>		

	</form>
	<br>
	당신의 선택 >	${pick }
	<br>

	컴퓨터의 선택 > ${computer_pick }
	<hr>
	<h3>전적</h3>
	
	컴퓨터: ${computer_score }점<br>
	${user }님: ${user_score }점
	<br>
	현재 승률: ${user_score/(computer_score+user_score)*100}%

</body>
</html>