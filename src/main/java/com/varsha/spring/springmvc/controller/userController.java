package com.varsha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.varsha.spring.springmvc.dto.User;

@Controller
public class userController {
	
	@RequestMapping("register")
	public String showRegister() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("userReg");
		return "userReg";
	}
	
	@RequestMapping(value = "registerUser", method=RequestMethod.POST)
	public String getRegisteredUser(@ModelAttribute("user") User user,ModelMap model) {
		System.out.println(user);
		
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("user", user);
		//modelAndView.setViewName("regUserList");
		model.addAttribute("user",user);
		return "regUserList";
	}
}
