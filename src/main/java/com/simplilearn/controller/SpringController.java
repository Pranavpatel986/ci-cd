package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringController {
	
	@GetMapping
	public String message() {
		return "Application deployed successfully";
	}
}
