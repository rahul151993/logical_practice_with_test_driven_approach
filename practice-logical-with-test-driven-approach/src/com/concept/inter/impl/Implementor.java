package com.concept.inter.impl;

import com.concept.inter.I1;
import com.concept.inter.I3;

public class Implementor implements I3{
	/*@Override
	public void display() {
		System.out.println("Implementor Display");
	}*/
	public static void main(String[] args) {
		Implementor i = new Implementor();
		i.display();
	}
}
