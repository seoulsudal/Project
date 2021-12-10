<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 페이지</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js">
</script>
<script type="text/javascript">
$(function(){
	$("#productModifyBtn").click(function(){
		$("#updateProductForm").attr({
			"method":"GET",
			"action":"/admin/product/updateProduct"
		});	
		$("#updateProductForm").submit();
	});
	
	$("#productListBtn").click(function(){
		location.href="/admin/product/productList";
	});
});
</script>
</head>
<body>
<div>
	<div align="center"><h2>캠핑장 상세 페이지</h2></div>
	<form id="p_detail" method = "post">
		<input type="hidden" name="p_number" value="${productDetail.p_number}"/>
	</form>
	<form>
		<table align="center" border="1">
			<tr align="center">
				<td width="400px" height="500px" rowspan="2">이미지</td>
				<td width="600px" height="300px">상품유형 & 상품명 & 상품 안내</td>
			</tr>
			<tr align="center">
				<td>이용 금액 설명</td>
			</tr>
		</table>
	</form>
	<div align="center">
		<input type="button" value="목록" id="productListBtn">
		<input type="button" value="수정" id="productModifyBtn">
	</div>
</div>
</body>
</html>