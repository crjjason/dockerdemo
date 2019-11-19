package com.example.dockerdemo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${application.greeting}")
	private String greeting;
	
	@RequestMapping("/")
	public String hello() {
		return greeting + " at " + LocalDateTime.now().toString();
	}
}
