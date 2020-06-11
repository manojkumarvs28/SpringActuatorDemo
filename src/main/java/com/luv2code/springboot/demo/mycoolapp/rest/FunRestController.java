package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	// expose "/" that return "Hello World"
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("{team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run 5k everyday";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Ur lucky day";
	}
	
	
}












