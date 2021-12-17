package com.camflex.client.login.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Repository;

import com.camflex.client.login.vo.LoginVO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.spring.client.login.dao.LoginDAO";
	@Override
	public List<LoginVO> selectMemberList() throws Exception {
		
		return sqlSession.selectList(Namespace+".selectMemberList");
	}

	@Override
	public void insertMember(LoginVO vo) throws Exception {
		sqlSession.insert(Namespace +".insertMember", vo);
	}

}
