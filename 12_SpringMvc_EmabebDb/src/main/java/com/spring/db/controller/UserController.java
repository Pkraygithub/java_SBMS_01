package com.spring.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.db.service.IuserService;
import com.spring.db.user.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private IuserService service;

	@GetMapping("/")
	public String saveUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "index";

	}
	@PostMapping("/user")
	public String saveUserDetails(@Valid User user, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			//Form Validation Failed.
			return "index";
		} else {
			//Form Validation Success.
			boolean saveUserDetains = service.saveUserDetains(user);
			if (saveUserDetains) {
				model.addAttribute("sMsg", "User Data Saved");
			} else {
				model.addAttribute("eMsg", "User Data not Saved");

			}
		}
		return "index";

	}

}
