package com.prakruti.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

		@GetMapping(value = "/api/hello")
		public String greeting() {
			return new String("Hello World");
		}

		@PostMapping(value = "/api/add")
		public Answer add(@RequestBody Ques ques) {
			return Addition.addition(ques);
		}
		
		@PostMapping(value = "/api/sub")
		public Answer sub(@RequestBody Ques ques) {
			return Subtract.subtraction(ques);
		}
		
		@PostMapping(value = "/api/mul")
		public Answer mul(@RequestBody Ques ques) {
			return Multiply.multiplication(ques);
		}
		
		@PostMapping(value = "/api/div")
		public Answer div(@RequestBody Ques ques) {
			return Divide.division(ques);
		}

}