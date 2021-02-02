package com.prakruti.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/hello")
	public String greeting() {
		return "index.html";
	}
	
	@PostMapping(value="/api/add")
	public String add(@RequestBody Ques ques) {
		Integer c = ques.getA() + ques.getB();
		return c.toString();
	}
	
	@PostMapping(value="/subtract")
	public String subtract(@RequestBody Ques ques) {
		Integer c = ques.getA() - ques.getB();
		return c.toString();
	}
	
	@PostMapping(value="/divide")
	public String divide(@RequestBody Ques ques) {
		Integer c = ques.getA() / ques.getB();
		return c.toString();
	}
	
	@PostMapping(value="/multiply")
	public String multiply(@RequestBody Ques ques) {
		Integer c = ques.getA() * ques.getB();
		return c.toString();
	}
}