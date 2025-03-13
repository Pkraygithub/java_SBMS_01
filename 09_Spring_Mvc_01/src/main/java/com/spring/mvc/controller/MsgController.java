package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	
	
	public MsgController() {
		System.out.println("MsgControoler :: Constructore");
	}

	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		
		ModelAndView mev= new ModelAndView();
		// Setting Data in the form of Key-Value Pair
		mev.addObject("msg", "Good Morning 😁😁😁😁");
		
		//setting Vie page
		mev.setViewName("Index");
				return mev;
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		
		ModelAndView mev= new ModelAndView();
		// Setting Data in the form of Key-Value Pair
		mev.addObject("msg", "Welcome to Spring Mvc 😎😎😎😎😎🥰🥰");
		
		//setting Vie page
		mev.setViewName("Index");
				return mev;
	}
	
	
}
