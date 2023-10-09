package com.hats.mvc.crud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Value("${api_uri}")
	private String api_uri;
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping
	public String homePage(Model model) {
		model.addAttribute("appURI", api_uri);
		model.addAttribute("appName" , appName);
		System.out.println(api_uri);
		return "home";
	}

	@GetMapping("/next")
	public String nextPage(Model model) {
		model.addAttribute("appURI", api_uri);
		model.addAttribute("appName" , appName);
		System.out.println(api_uri);
		return "home";
	}

}
