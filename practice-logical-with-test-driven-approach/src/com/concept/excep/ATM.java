package com.concept.excep;

public class ATM {
	public static void main(String[] args) {
		Account a = new Account(101,5000.00);
		try {
			System.out.println(a.isSufficient(30000.00));
			System.out.println("hello");
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Logic Executed");
		}
		System.out.println("Bye");
	}
}
