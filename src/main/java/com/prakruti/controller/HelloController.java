package com.prakruti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/hello")
	public String greeting() {
		return "index.html";
//		return "welcome to the calculator home page";
	}
	
	@PostMapping("/")
	public String add() {
		return "add.html";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/subtract")
	public String subtract() {
		return "subtract.html";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/divide")
	public String divide() {
		return "divide.html";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/multiply")
	public String multiply() {
		return "multiply.html";
	}
}