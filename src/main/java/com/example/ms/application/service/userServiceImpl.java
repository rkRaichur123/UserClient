package com.example.ms.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class userServiceImpl implements userService{
	
	@SuppressWarnings("rawtypes")
	@Autowired
    private CircuitBreakerFactory circuitBreakerFactory;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public String getUserDetails() {
		CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
		String url = "http://localhost:8081/api/patient/getPatientDetails";

		return circuitBreaker.run(() -> restTemplate.getForObject(url, String.class), 
			      throwable -> getDefaultAlbumList());
	}

	private String getDefaultAlbumList() {
		// TODO Auto-generated method stub
		return "Error from fallback method user API";
	}

}
