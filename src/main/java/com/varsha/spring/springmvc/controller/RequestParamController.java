package com.varsha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	
	@RequestMapping("showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam(value="name",required=false,defaultValue = "varsha") String name) {
		System.out.println("ID:" + id);
		System.out.println("name:" + name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
}
