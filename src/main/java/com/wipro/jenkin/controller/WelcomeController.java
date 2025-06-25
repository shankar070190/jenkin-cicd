package com.wipro.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/jenkin")
public class WelcomeController {
	
	@GetMapping
	public String welcomejenkin() {
		return "welcomejenkin";
	}

}
