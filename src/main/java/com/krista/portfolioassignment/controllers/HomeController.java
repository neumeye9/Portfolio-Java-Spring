package com.krista.portfolioassignment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller

@RequestMapping("/")
public class HomeController {
	public String index(){
		return "forward:/index.html";
	}
	
	@RequestMapping("/aboutMe")
	public String about(){
		return "forward:/about.html";
	}
	
	@RequestMapping("/projectpage")
	public String projects(){
		return "forward:/projects.html";
	}


}

