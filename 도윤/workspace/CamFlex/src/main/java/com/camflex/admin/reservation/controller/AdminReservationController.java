package com.camflex.admin.reservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.camflex.admin.reservation.service.AdminReservationService;
import com.camflex.client.reservation.vo.ReservationVO;
import com.camflex.common.vo.CodeLabelValue;
import com.camflex.common.vo.PageRequest;
import com.camflex.common.vo.Pagination;

@Controller
@RequestMapping(value = "/admin/reservation")
public class AdminReservationController {

	
	private Logger log = LoggerFactory.getLogger(AdminReservationController.class);
	
	@Autowired
	private AdminReservationService adminReservationService;
	
	/****************************
	 * 예약 리스트 조회
	 ***************************/
	@RequestMapping(value = "/reservationList", method = RequestMethod.GET)
	public void reservationList(@ModelAttribute("pgrq") PageRequest pageRequest, ReservationVO rvo, Model model) {
		
		log.info("예약 리스트 호출 성공");
		// 뷰에 페이징 처리를 한 예약 목록을 전달한다.
		model.addAttribute("reservationList", adminReservationService.reservationList(pageRequest));
		
		// 페이징 네비게이션 정보를 뷰에 전달한다.
		Pagination pagination = new Pagination();
		pagination.setPageRequest(pageRequest);
		pagination.setTotalCount(adminReservationService.count(pageRequest));
		model.addAttribute("pagination", pagination);
		
		//검색 유형의 코드명과 코드값을 정의한다.
		List<CodeLabelValue> searchTypeCodeValueList = new ArrayList<CodeLabelValue>();
		searchTypeCodeValueList.add(new CodeLabelValue("a", "---"));
		searchTypeCodeValueList.add(new CodeLabelValue("m", "아이디"));
		searchTypeCodeValueList.add(new CodeLabelValue("se", "시작일 or 종료일"));
		model.addAttribute("searchTypeCodeValueList", searchTypeCodeValueList);
	}
	
	/**************************
	 * 신규 예약 리스트
	 **************************/
	@RequestMapping(value = "/newReservation", method = RequestMethod.GET)
	public void newRsvList(@ModelAttribute("pgrq")PageRequest pageRequest, ReservationVO rvo, Model model) {
		log.info("신규 예약 리스트 호출");
		
		// 뷰에 페이징 처리를 한 신규 예약 목록을 전달한다.
		model.addAttribute("newRsvList", adminReservationService.newRsvList(pageRequest));
		
		// 페이징 네비게이션 정보를 뷰에 전달한다.
		Pagination pagination = new Pagination();
		pagination.setPageRequest(pageRequest);
		pagination.setTotalCount(adminReservationService.count(pageRequest));
		model.addAttribute("pagination", pagination);
		
		// 검색 유형의 코드명과 코드값을 정의한다.
		List<CodeLabelValue> searchTypeCodeValueList = new ArrayList<CodeLabelValue>();
		searchTypeCodeValueList.add(new CodeLabelValue("a", "---"));
		searchTypeCodeValueList.add(new CodeLabelValue("m", "아이디"));
		searchTypeCodeValueList.add(new CodeLabelValue("se", "시작일 or 종료일"));
		model.addAttribute("searchTypeCodeValueList", searchTypeCodeValueList);
	}
}
