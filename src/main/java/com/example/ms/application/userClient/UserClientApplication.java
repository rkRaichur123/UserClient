package com.example.ms.application.userClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/userClient")
public class UserClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserClientApplication.class, args);
	}
	
	@GetMapping( value = "/healthCheck")
	public String healthCheck() {
		return ("userClient is up and Running");
	}

}
