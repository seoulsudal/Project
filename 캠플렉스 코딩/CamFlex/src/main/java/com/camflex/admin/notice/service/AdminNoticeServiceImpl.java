package com.camflex.admin.notice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camflex.admin.notice.dao.AdminNoticeDAO;
import com.camflex.admin.notice.vo.AdminNoticeVO;



@Service
@Transactional
public class AdminNoticeServiceImpl implements AdminNoticeService {

	@Autowired
	private AdminNoticeDAO adminNoticeDAO;
	
	// 글 전체 조회
	@Override
	public List<AdminNoticeVO> noticeList(AdminNoticeVO nvo) {
		List<AdminNoticeVO> list = new ArrayList<AdminNoticeVO>();
		list = adminNoticeDAO.noticeList(nvo);
		return list;
	}

	// 글 등록
	@Override
	public int regNotice(AdminNoticeVO nvo) {
		int result = 0;
		try {
			result = adminNoticeDAO.regNotice(nvo);
		}catch(Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

	// 글 상세페이지
	@Override
	public AdminNoticeVO noticeDetail(AdminNoticeVO nvo) {
		AdminNoticeVO detail = null;
		detail = adminNoticeDAO.noticeDetail(nvo);
		return detail;
	}

	// 글 수정
	@Override
	public int updateNotice(AdminNoticeVO nvo) {
		int result = 0;
		try {
			result = adminNoticeDAO.updateNotice(nvo);
		}catch(Exception e) {
			e.printStackTrace();
			result = 0;
		}
		
		return result;
	}

}
