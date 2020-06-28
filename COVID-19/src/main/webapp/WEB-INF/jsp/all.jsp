<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>all</h1>
	<div>
		<table>
			<tbody>
				<tr>
					<td>confirmed</td>
					<td>recovered</td>
					<td>active</td>
					<td>deaths</td>
				</tr>
				<tr>
					<td>${overviewList.confirmed}</td>
					<td>${overviewList.recovered}</td>
					<td>${overviewList.active}</td>
					<td>${overviewList.deaths}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>