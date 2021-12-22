package com.camflex.client.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.camflex.admin.product.vo.AdminProductVO;
import com.camflex.client.product.service.ProductService;
import com.camflex.client.reservation.controller.ReservationController;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	private Logger log = LoggerFactory.getLogger(ReservationController.class);
	
	@Autowired 
	private ProductService productService;
	 
	// 캠핑장 조회
	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public String productList(@ModelAttribute AdminProductVO pvo, Model model) throws Exception{
		log.info("productList 호출 성공");
		
		List<AdminProductVO> productList = productService.productList(pvo);
		
		model.addAttribute("productList", productList);
		model.addAttribute("data", pvo);
				
		return "product/productList";
	}
	
	// 캠핑장 상세 페이지
	@RequestMapping(value = "/productDetail", method = RequestMethod.GET)
	public String productDetail(@ModelAttribute AdminProductVO pvo, Model model) throws Exception {
		log.info("productDetail 호출 성공");
		log.info("p_number = " + pvo.getP_number());
		
		AdminProductVO detail = new AdminProductVO();
		detail = productService.productDetail(pvo);
		
		if(detail != null && (!detail.equals(""))) {
			detail.setP_information(detail.getP_information().toString().replaceAll("\n", "<br>"));
		}
		
		model.addAttribute("detail", detail);
		
		return "product/productDetail";
	}
	
}
