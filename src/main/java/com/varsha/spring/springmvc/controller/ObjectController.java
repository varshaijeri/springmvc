package com.varsha.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.varsha.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/displayEmployee")
	public ModelAndView sendObj() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayEmployee");
		
		Employee employee = new Employee();
		employee.setId(123);
		employee.setFirstname("Asha");
		employee.setLastname("KA");
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
}
