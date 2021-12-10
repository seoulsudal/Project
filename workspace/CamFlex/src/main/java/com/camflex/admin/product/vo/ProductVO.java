package com.camflex.admin.product.vo;

import java.util.Date;

public class ProductVO {

	
	private int p_number;			// 상품번호
	private String p_type;			// 상품구분(유형)
	private String p_name;			// 상품명
	private int p_price;			// 상품가격
	private String p_information;	// 상품안내
	private String p_photo;			// 상품사진 경로명
	private Date p_date;			// 상품 등록일
	
	
	public ProductVO() {
		super();
	}	
	
	public ProductVO(int p_number, String p_type, String p_name, int p_price, String p_information, String p_photo,
			Date p_date) {
		super();
		this.p_number = p_number;
		this.p_type = p_type;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_information = p_information;
		this.p_photo = p_photo;
		this.p_date = p_date;
	}


	public int getP_number() {
		return p_number;
	}
	public void setP_number(int p_number) {
		this.p_number = p_number;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public String getP_information() {
		return p_information;
	}
	public void setP_information(String p_information) {
		this.p_information = p_information;
	}
	public String getP_photo() {
		return p_photo;
	}
	public void setP_photo(String p_photo) {
		this.p_photo = p_photo;
	}

	public Date getP_date() {
		return p_date;
	}

	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}
	
	
}