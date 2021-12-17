package com.camflex.client.login.service;

import java.util.List;

import com.camflex.client.login.vo.LoginVO;

public interface LoginService {

	public List<LoginVO> selectMemberList() throws Exception;

	public void insertMember(LoginVO vo) throws Exception;
}
