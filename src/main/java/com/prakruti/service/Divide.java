package com.prakruti.service;

import org.springframework.stereotype.Service;

@Service
public class Divide {

	public static Answer division(Ques ques) {

		Float c = ques.getA() / ques.getB();
		Answer ans = new Answer(c);
		return ans;
	}

}
