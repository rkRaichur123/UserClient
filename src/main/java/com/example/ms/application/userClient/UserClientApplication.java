package com.example.ms.application.userClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient

@ComponentScan(basePackages = {"com.example.ms.application.*"})
public class UserClientApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(UserClientApplication.class, args);
	}
}
