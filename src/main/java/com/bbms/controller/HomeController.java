package com.bbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Home Handler
		@RequestMapping("/")
		public String home(Model model) {
			model.addAttribute("title", "Home - Blood Bank");
			return "index";
		}
}
