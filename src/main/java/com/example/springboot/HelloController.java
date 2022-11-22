package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String msg="Hello NAVSUP with testing and scanning, with tilt in the sun!";
		return "Hello NAVSUP with testing and scanning, with tilt fun!";
	}

}