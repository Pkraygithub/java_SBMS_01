package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	public ProductController() {
		System.out.println("ProductController :: Constructor");
	}

	@GetMapping("/product")

	public ModelAndView getProductPrice() {

		ModelAndView mev = new ModelAndView();

		mev.addObject("price", "Apple Mobile Price 📱:: INR 86000 ");

		mev.setViewName("productPage");
		return mev;

	}

}
