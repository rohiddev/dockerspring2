package com.example.demodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	


	@GetMapping("/hello")
	public String greeting() {
		return "Hello World 2";
	}

	@GetMapping("/")
	public String greetingHello() {
		
		//System.out.println("password" + getPassword());
		//System.out.println("username" + getUsername());
		
		
		return "Hello World 2";
	}

}
