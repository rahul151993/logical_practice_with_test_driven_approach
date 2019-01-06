package com.practice.logics;

class SuperA{
	public char display(char c) {
		System.out.println("hello char c = "+c);
		return c;
	}
}

public class ConceptTest extends SuperA{
	@Override
	public char display(char c) {
		System.out.println("This is overridden method of super class with character = "+c);
		return c;//super.display(c);
	}
	public void display() {
		System.out.println("Hello");
	}
	public int display(String str) {
		System.out.println("Bye "+str);
		return 0;
	}
	public float display(float f) {
		System.out.println("float version "+f);
		return 0.0f;
	}
	public int display(int value) {
		System.out.println("Integer version "+value);
		return 0;
	}
	public void display(int a,int b) {
		System.out.println("The addition of 2 variables is a = "+(a+b));
	}
	public static void main(String[] args) {
		ConceptTest c=new ConceptTest();
		c.display();
		c.display('g');
	}

}
