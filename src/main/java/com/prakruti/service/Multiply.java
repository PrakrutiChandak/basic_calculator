package com.prakruti.service;

import org.springframework.stereotype.Service;

@Service
public class Multiply {

	public static Answer multiplication(Ques ques) {
		Float c = ques.getA() * ques.getB();
		Answer ans = new Answer(c);
		return ans;
	}
}
