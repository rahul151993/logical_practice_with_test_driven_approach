package com.practice.logics.demo;

import com.practice.logics.SuperClass;

public class SubClass extends SuperClass{
	@Override
	public void performOperation() {
		System.out.println("The sum is  = "+(getA()+getB()));
	}
	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.setA(15);
		s.setB(30);
		s.performOperation();
		s.greeting();
	}
	@Override
	public void greeting() {
		System.out.println("Hello There, How are you ?");
	}
}
