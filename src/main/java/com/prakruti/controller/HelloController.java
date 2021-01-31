package com.prakruti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/hello")
	public String greeting() {
		return "index.html";
//		return "welcome to the calculator home page";
	}
}