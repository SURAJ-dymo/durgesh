package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.UserRepository;
import com.example.demo.helper.Message;

@Controller
public class HomeController {
@Autowired
	private UserRepository userRepository;
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("titel", "HOME-Smart-Contact-Manager");
		return "home";
		
	}
	
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("titel", "About-Smart-Contact-Manager");
		return "about";
		
	}
	
	


}
