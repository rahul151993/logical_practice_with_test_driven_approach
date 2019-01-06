package com.concept.inter;

public interface I3 extends I1,I2{

	@Override
	default void display() {
		// TODO Auto-generated method stub
		I1.super.display();
	}
	/*default public void display() {
		System.out.println("Hello I am from I3");
	}*/
}
