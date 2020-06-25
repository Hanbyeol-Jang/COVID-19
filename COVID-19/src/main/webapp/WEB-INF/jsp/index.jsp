<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Boot Application with JSP</title>

<script type="text/javascript">
	function searchConfirmed() {
		if (document.getElementById("sword").value == "") {
			alert("모든 목록 조회!!");
		}
		document.getElementById("confirmedform").action = "/covid19/confirmed";
		document.getElementById("confirmedform").submit();
	}
</script>
</head>
<body>
	<h1>index11</h1>

	<div>
		<form id="confirmedform" method="get" action="">
			<input type="text" class="form-control" placeholder="검색어 입력"
				name="word" id="sword">
			<button type="button" onclick="javascript:searchConfirmed();">confirmed</button>

		</form>
	</div>
</body>
</html>

