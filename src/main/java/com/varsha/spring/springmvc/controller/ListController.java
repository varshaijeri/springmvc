package com.varsha.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.varsha.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/displayEmployeeList")
	public ModelAndView sendObj() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayEmployeeList");
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employee1.setId(123);
		employee1.setFirstname("Varsha");
		employee1.setLastname("Ijeri");
		employees.add(employee1);
		
		employee2.setId(234);
		employee2.setFirstname("Asha");
		employee2.setLastname("KA");
		employees.add(employee2);
		
		employee3.setId(345);
		employee3.setFirstname("Sujit");
		employee3.setLastname("MV");
		employees.add(employee3);
		
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
}
