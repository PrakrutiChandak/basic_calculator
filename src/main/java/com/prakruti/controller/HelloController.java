package com.prakruti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prakruti.model.Ques;
import com.prakruti.service.Add;
import com.prakruti.service.Divide;
import com.prakruti.service.Multiply;
import com.prakruti.service.Subtract;

@Controller
public class HelloController {

	@Autowired
	public Add add;
	
	@Autowired 
	public Subtract sub;
	
	@Autowired 
	public Multiply mul;
	
	@Autowired
	public Divide div;

	@RequestMapping(method = RequestMethod.GET, value = "/api/hello")
	public String greeting() {
		return "index.html";
	}

	@PostMapping(value = "/api/add")
	public String add(@RequestBody Ques ques) {
		Float c = add.addition(ques);
		return c.toString();
	}

	@PostMapping(value = "/subtract")
	public String subtract(@RequestBody Ques ques) {
		Float c = sub.subtraction(ques);
		return c.toString();
	}

	@PostMapping(value = "/divide")
	public String divide(@RequestBody Ques ques) {
		Float c = div.division(ques);
		return c.toString();
	}

	@PostMapping(value = "/multiply")
	public String multiply(@RequestBody Ques ques) {
		Float c = mul.multiplication(ques);
		return c.toString();
	}
}