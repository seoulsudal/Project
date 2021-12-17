package com.camflex.client.login.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camflex.client.login.vo.LoginVO;

@Repository
public interface LoginDAO {
	public List<LoginVO> selectMemberList() throws Exception;

	//회원가입
	public void insertMember(LoginVO vo) throws Exception;
}
