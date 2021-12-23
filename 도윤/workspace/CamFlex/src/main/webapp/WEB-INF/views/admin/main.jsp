<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캠플렉스 관리자 페이지</title>
</head>
<body>
<div>
	<div align="center"><h2>관리자 페이지</h2></div>
	<div align="center">
		<form>
			<table border="1">
				<colgroup>
					<col width="25%"/>
					<col width="25%"/>
					<col width="25%"/>
					<col width="25%"/>
				</colgroup>
				<thead>
					<tr>
						<th>전일 매출</th>
						<th>신규 예약 대기</th>
						<th>금일 방문 고객</th>
						<th>신규 회원</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td align="center">${yesterday}원</td>
						<td align="center">${newRsv}건</td>
						<td align="center">${visit}팀</td>
						<td align="center">${todayMember}명</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</div>
</body>
</html>