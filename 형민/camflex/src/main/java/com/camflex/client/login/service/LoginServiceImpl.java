package com.camflex.client.login.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camflex.client.login.dao.LoginDAO;
import com.camflex.client.login.vo.LoginVO;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	//private static final Logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Inject
	private LoginDAO loginDAO;

	@Override
	public List<LoginVO> selectMemberList() throws Exception {
		return loginDAO.selectMemberList();
	}

	@Override
	public void insertMember(LoginVO vo) throws Exception {
		loginDAO.insertMember(vo);
	}

}
