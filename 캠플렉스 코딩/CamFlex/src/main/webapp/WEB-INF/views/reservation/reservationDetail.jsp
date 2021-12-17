<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실시간 예약</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  	<script type="text/javascript" src="/resources/include/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="/resources/include/js/common.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
  	$(function() {
		$("#btnReservation").click(function() {
			$("#reservationForm").attr({
				"method":"POST",
				"action":"/reservation/reservationAgreePage"
			});
			$("#reservationForm").submit();
		});
	});
  	
  	
</script>
</head>
<body>
	<div class="col-sm-6">
		<form id="p_detail" name="p_detail" method = "post">
			<input type="hidden" name="p_number" id="p_number" value="${detail.p_number}"/>
			<input type="hidden" name="p_name" id="p_name" value="${detail.p_name}"/>
			<input type="hidden" name="p_price" id="p_price" value="${detail.p_price}"/>
		</form>
		<form id="reservationForm" name="reservationForm">
			<div class="panel panel-default" align="center">
				<div>
					<h3>예약 달력</h3>
				</div>
				<div class="panel-body">
					<input type="date" id="startDate" name="startDate">
				</div>
			</div>
		</form>
	</div>
    <div class="col-sm-6">
    	<div align="center">
    		<h2>객실 정보</h2>
    		<br>
    		<table>
    			<tr>
    				<td>방 이름 : ${detail.p_name}</td>
    			</tr>
    			<tr>
    				<td><br>방 가격 : ${detail.p_price} 원</td>
    			</tr>
    		</table>
    	</div>
    	<br>
    	<br>
    	<br>
    	<div align="center">
    		<input type="button" value="예약 하기" style="font-size: 20px; height: 75px; width: 200px;" id="btnReservation" name="btnReservation" class="btn btn-success">
    	</div>
    </div>
	
</body>
</html>