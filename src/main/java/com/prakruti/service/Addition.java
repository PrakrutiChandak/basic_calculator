package com.prakruti.service;

import org.springframework.stereotype.Service;

@Service
public class Addition {

	public static Answer addition(Ques ques) {
		
		Float c = ques.getA() + ques.getB();
		Answer ans = new Answer(c);
		return ans;
	}
}
