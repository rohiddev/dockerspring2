package com.example.demodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String greeting() {
		return "Hello World";
	}

	@GetMapping("/")
	public String greetingHello() {
		return "Hello World";
	}

}
