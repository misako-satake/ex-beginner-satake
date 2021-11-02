package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam03";		
	}
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("/result")
	public String result(Integer obj1,Integer obj2,Integer obj3) {
		
		Integer sum = (Integer)(obj1 + obj2 + obj3);
		int sum_tax = (int)(sum*1.1);
		
		

		
		application.setAttribute("sum", sum);
		application.setAttribute("sum_tax", sum_tax);
		
		
		return "exam03-result";
	}

}
