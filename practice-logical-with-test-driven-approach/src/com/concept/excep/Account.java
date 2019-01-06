package com.concept.excep;

public class Account {
	private int accId;
	private double balance;
	
	public Account(int accId,double balance) {
		this.accId=accId;
		this.balance=balance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean isSufficient(double amount) throws MyException {
		boolean status = false;
		if(balance>amount) {
			status  =  true;
		}
		else
			throw new MyException("Insufficient Balance");
		return status;
	}
}
