<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트 페이지</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
	
	function chkSubmit(item, msg){
		if(item.val().replace(/\s/g,"") == ""){
			alert(msg + "입력해 주세요.");
			item.val("");
			item.focus();
			return false();
		}else{
			return true;
		}
	}
</script>
</head>
<body>
<h2 align="center">회원 리스트</h2>
<div align="center">
<form:form modelAttribute="pgrq" method="get" action="memberList${pgrq.toUriStringByPage(1)}">
	<form:select path="searchType" items="${searchTypeCodeValueList}" itemValue="value" itemLabel="label" />
	<form:input path="keyword"/>
	<button id="searchBtn">검색</button>
</form:form>
</div>
<div id="memberList" align="center">
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>가입일</th>
			</tr>
		</thead>
		<tbody id="list">
			<c:choose>
				<c:when test="${empty memberList}">
					<tr>
						<td colspan="5" align="center">회원이 존재하지 않습니다.</td>
					</tr>
					</c:when>
					<c:otherwise>
					<c:forEach var="member" items="${memberList}">
						<tr>
							<td>${member.m_number}</td>
							<td>${member.m_id}</td>
							<td class="mName">${member.m_name}</td>
							<td class="phone">${member.m_phone}</td>
							<td><fmt:formatDate value="${member.m_date}" pattern="yyyy/MM/dd HH:mm" /></td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	<!-- 페이징 네비게이션 -->
	<div>
		<c:if test="${pagination.prev}">
			<a href="${pagination.startPage - 1}">&laquo;</a>
		</c:if>
		<c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="idx">
			<a href="/admin/member/memberList${pagination.makeQuery(idx)}">${idx}</a>
		</c:forEach>
		<c:if test="${pagination.next && pagination.endPage > 0}">
			<a href="${pagination.endPage + 1}">&raquo;</a>
		</c:if>
	</div>
</div>
</body>
</html>