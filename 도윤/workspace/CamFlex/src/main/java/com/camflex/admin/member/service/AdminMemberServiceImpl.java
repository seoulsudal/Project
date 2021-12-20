package com.camflex.admin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camflex.admin.member.dao.AdminMemberDAO;
import com.camflex.client.login.vo.LoginVO;

@Service
@Transactional
public class AdminMemberServiceImpl implements AdminMemberService {
	
	@Autowired
	private AdminMemberDAO adminMemberDAO;

	// 회원 리스트
	@Override
	public List<LoginVO> memberList(LoginVO lvo) {
		
		List<LoginVO> list = null;
		
		list = adminMemberDAO.memberList(lvo);
		
		return list;
	}
	// 전체 레코드 수 구현
	@Override
	public int memberListCnt(LoginVO lvo) {
		
		return adminMemberDAO.memberListCnt(lvo);
	}
}
