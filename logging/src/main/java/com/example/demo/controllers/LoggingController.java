package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	@RequestMapping("/")
	public String index() {
		return "Howdy! Check out the Logs to see the output...";
	}
}
