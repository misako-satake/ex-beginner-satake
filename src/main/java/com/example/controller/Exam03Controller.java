package com.example.controller;

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
	
	@RequestMapping("/result")
	public String result(Integer obj1,Integer obj2,Integer obj3,Model model) {
		
		int sum = obj1 + obj2 + obj3;
		int sum_tax = (int)(sum*1.1);
		
		model.addAttribute("obj1", obj1);
		model.addAttribute("obj2", obj2);
		model.addAttribute("obj3", obj3);
		model.addAttribute("sum", sum);
		model.addAttribute("sum_tax", sum_tax);
		
		return "exam03-result";
	}

}
