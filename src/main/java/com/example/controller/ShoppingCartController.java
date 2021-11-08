package com.example.controller;

import javax.servlet.http.HttpSession;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;

@Controller
@RequestMapping("/exam06")
public class ShoppingCartController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private ServletContext application;
	
	
	@RequestMapping("")
	public String index(String name,Integer price,Model model) {
		List<Item> itemList = new LinkedList<>();
		itemList.add(new Item("手帳セット",1000));
		itemList.add(new Item("文房具セット",1500));
		itemList.add(new Item("ファイル",2000));
		application.setAttribute("itemList", itemList);
		
		List<Integer> newList = new LinkedList<>();
		session.setAttribute("newList", newList);
		
		Integer sumPrice = 0;
		
		
		return "item-and-cart";
	}
}
