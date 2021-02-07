package com.prakruti.service;

import com.prakruti.model.Ques;

public class Divide {

	
	public float division(Ques ques) {
			Float c = ques.getA() / ques.getB();
			return c;
	}
}
