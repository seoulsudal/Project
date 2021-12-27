package com.camflex.admin.reservation.dao;

import java.util.List;

import com.camflex.client.reservation.vo.ReservationVO;
import com.camflex.common.vo.PageRequest;

public interface AdminReservationDAO {

	// 예약 리스트
	public List<ReservationVO> reservationList(PageRequest pageRequest);
	// 예약 전체 수를 반환
	public int count(PageRequest pageRequest);
	// 신규 예약 리스트
	public List<ReservationVO> newRsvList(ReservationVO rvo);
	public int confirmRsv(ReservationVO rvo);



}
