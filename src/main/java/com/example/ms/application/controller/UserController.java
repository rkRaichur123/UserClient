package com.example.ms.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms.application.service.userServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	userServiceImpl userServie;
	
	@GetMapping( value = "/healthCheck")
	public String healthCheck() {
		return ("userClient is up and Running");
	}

	@GetMapping( value = "/getUserDetails")
	public String getUserDetails() {
		return userServie.getUserDetails();
	}

}
