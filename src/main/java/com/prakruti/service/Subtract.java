package com.prakruti.service;

import org.springframework.stereotype.Service;

@Service
public class Subtract {
	public static Answer subtraction(Ques ques) {
		Float c = ques.getA() - ques.getB();
		Answer ans = new Answer(c);
		return ans;
	}
}