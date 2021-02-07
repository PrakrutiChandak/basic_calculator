package com.prakruti.service;

import com.prakruti.model.Ques;

public class Subtract {

	public Float subtraction(Ques ques) {
		Float c = ques.getA() - ques.getB();
		return c;
	}
}
