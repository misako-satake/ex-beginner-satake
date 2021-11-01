package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/result")
	public String result(String num1,String num2) {
		int answer = Integer.parseInt(num1) + Integer.parseInt(num2);
		session.setAttribute("num1", Integer.parseInt(num1));
		session.setAttribute("num2", Integer.parseInt(num2));
		session.setAttribute("answer", answer);
		return "exam02-result";
	}
	
	
	
	@RequestMapping("/result2")
	public String result2() {
		
		return "exam02-result2";
	}
	
}
