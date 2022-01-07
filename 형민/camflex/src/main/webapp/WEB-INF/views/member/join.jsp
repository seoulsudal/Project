<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
	function joinForm_check() {
		var e_RegExp = /\w+@\w+\.\w+(\.\w+)?/; //아이디(이메일) 유효성 검사 정규식
		var p_RegExp = /^[a-zA-Z0-9]{8,20}$/; //비밀번호 유효성 검사 정규식
		var n_RegExp = /^[가-힣a-zA-Z0-9]{0,50}$/; //이름 특수문자,숫자 사용불가 정규식(한글,영문만 가능)
		var b_RegExp = /^(19[0-9][0-9]|20\d{2})-(0[0-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/; //생년월일 유효성 검사 정규식	
		var t_RegExp = /^01(?:0|1|[6-9])(?:\d{3}|\d{4})\d{4}$/;//전화번호 유효성 검사 정규식

		var Id = document.getElementById("m_id"); //아이디
		var Pw = document.getElementById("m_pw"); //비밀번호
		var RePw = document.getElementById("m_pw_chk"); //비밀번호 재확인
		var Name = document.getElementById("m_name"); //이름
		var Birth = document.getElementById("m_birth"); //생년월일  
		var Phone = document.getElementById("m_phone"); //전화번호

		/*===============아이디 유효성===============*/
		//공백 입력여부 검사
		if (Id.value == '') {
			alert("ID를 입력해주세요.");
			return false;
		}

		// 아이디(이메일 형식) 유효성 검사
		if (!e_RegExp.test(Id.value)) {
			alert("아이디는 이메일 형식으로만 입력 가능합니다! 다시 입력해주세요.");
			return false;
		}

		/*===============비밀번호 유효성===============*/
		//공백 입력여부 검사
		if (Pw.value == '') {
			alert("password를 입력해주세요.");
			return false;
		}

		// 비밀번호 재확인 공백 입력여부 검사
		if (RePw.value == '') {
			alert("비밀번호 재확인을 입력해주세요.");
			return false;
		}

		//패스워드 유효성 검사
		if (!p_RegExp.test(Pw.value)) {
			alert("password는 8~20자의 영문 대소문자와 숫자로만 입력 해주세요! 다시 입력해주세요.");
			return false;
		}

		//비밀번호 재확인 검사
		if (Pw.value != RePw.value) {
			alert("비밀번호 재입력이 틀립니다! 다시 입력해주세요.");
			return false;
		}

		/*===============이름 유효성===============*/
		//공백 입력여부 검사
		if (Name.value == '') {
			alert("이름을 입력해주세요.");
			return false;
		}

		//한글,영어 유효성 검사
		if (!n_RegExp.test(Name.value)) {
			alert("이름에 특수문자,숫자는 입력할수 없습니다! 다시 입력해주세요.");
			return false;
		}

		/*===============생년월일 유효성===============*/
		//공백 입력여부 검사
		if (Birth.value == '') {
			alert("생년월일을 입력해주세요.");
			return false;
		}

		// 생년월일 유효성 검사
		if (!b_RegExp.test(Birth.value)) {
			alert("생년월일 형식이 올바르지 않습니다! 다시 입력해주세요.");
			return false;
		}

		/*===============전화번호 유효성===============*/
		//공백 입력여부 검사
		if (Phone.value == '') {
			alert("전화번호를 입력해주세요.");
			return false;
		}

		//전화번호 유효성 검사
		if (!t_RegExp.test(Phone.value)) {
			alert("전화번호 형식이 올바르지 않습니다! 다시 입력해주세요.");
			return false;
		}

	}

	function openIdChk() {
		window.name = "parentForm";
		window.open("member")
	}
</script>
</head>
<body>
	<div>
		<div align="center">
			<h2>회원가입</h2>
		</div>
		<form name="insertMember" id="insertMember" action="insertMember"
			method="POST" onsubmit="return joinForm_check()">
			<div align="center">

				<table class="table" border="1">
					<colgroup>
						<col width="17%" />
						<col width="83%" />
					</colgroup>
					<tr>
						<td>ID</td>
						<td><input type="text" class="form-control" name="m_id"
							id="m_id" value="이메일 형식으로 입력" /></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td><input type="password" class="form-control" name="m_pw"
							id="m_pw" value="영문/숫자 8~20자 (특수문자X)" /></td>
					</tr>
					<tr>
						<td>패스워드 재확인</td>
						<td><input type="password" class="form-control"
							name="m_pw_chk" id="m_pw_chk" value="위 비밀번호와 일치하게 입력" /></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" class="form-control" name="m_name"
							id="m_name" value="특수문자 or 숫자X 50자 미만" /></td>
					</tr>
					<tr>
						<td>생년월일</td>
						<td><input type="text" class="form-control" name="m_birth"
							id="m_birth" value="생년월일 숫자 8자리 ( - 포함)" /></td>
					</tr>
					<tr>
						<td>전화번호</td>
						<td><input type="text" class="form-control" name="m_phone"
							id="m_phone" value="(-)를 제외한 11자" /></td>
					</tr>
				</table>

			</div>

			<div align="right">
				<input type="submit" value="등록" />
			</div>
		</form>
	</div>
</body>
</html>