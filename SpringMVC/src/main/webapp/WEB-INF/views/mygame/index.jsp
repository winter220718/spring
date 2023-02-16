<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/resources/css/mygame.css" var="mygame_css" />
<c:url value="/resources/js/mygame.js" var="mygame_js"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>#���������� ����</title>
<link rel="stylesheet" href="${mygame_css }" />
</head>
<body>


	<h3>���������� ����</h3>
	<ul>
		<li>ó�� �����ϴ� ����ڶ�� ����� �̸��� ���� �Է��ؾ� �Ѵ� (��Ű or localStorage)</li>
		<li>�̸��� �Է��ϰų� �̹� �����ϴ� �̸��� �ִٸ� ������������ ��� ������ �� �ִ�</li>
		<li>������ ��� �����Ǹ� �·��� ������ ���߿� ���͵� �����Ǿ�� �Ѵ�</li>
	</ul>


	<hr>
	<c:choose>
		<c:when test="${empty cookie.user.value }">
			<form action="./index" method="POST">
				<!-- post������ ���� ������ ���� �ð��̴� -->
				<h4>�̸��� �������ּ���</h4>
				<input type="text" name="user" /> <input type="submit" value="����" />
			</form>
		</c:when>
		<c:otherwise>
			<h3>${cookie.user.value }���� ����</h3>
			<div id="record-panel">0�� 0�� 0��</div>
			<div id="computer"></div>
			<div id="message"></div>
			<div>
				<button class="decision" data-num="0">����</button>				
				<button class="decision" data-num="1">����</button>				
				<button class="decision" data-num="2">��</button>	
				<button id="logout">�α׾ƿ�</button>			
			</div>
		</c:otherwise>
	</c:choose>
	
	
	
	<script>
		const contextPath = '<%=request.getContextPath()%>';
		const userName = '${cookie.user.value}';
	
	</script>
	<script src="${mygame_js }"></script>




</body>
</html>