package com.c2cgifts.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class AmazonService {

	@RequestMapping("/")
	String home () {
		return "Hello world - running kubernetes with CI and  CD  single pipeline!";
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AmazonService.class, args);
	}

}
