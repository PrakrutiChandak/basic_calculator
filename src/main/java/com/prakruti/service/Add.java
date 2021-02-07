package com.prakruti.service;

import com.prakruti.model.Ques;

public class Add {

	public Float addition(Ques ques) {
		Float c = ques.getA() + ques.getB();
		return c;
	}
}
