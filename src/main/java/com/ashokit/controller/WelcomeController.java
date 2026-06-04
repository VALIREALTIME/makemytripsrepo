package com.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {
	
	
	@GetMapping("/")
	public String getMethodName() {
		return "Welcome to the AWS deployment example...!";
	}
	

}
