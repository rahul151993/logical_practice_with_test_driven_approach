package com.practice.logics;

public class ArmStrongNumberLogic {
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public int isArmStrong() {
		int sum=0;
			if(no>0) {
			int number = no;
			int reminder = 0;
			int division = 0;
			while(number>0) {
				reminder=number%10;
				reminder = reminder*reminder*reminder;
				sum = sum+reminder;
				number=number/10;
			}
			}
			else {
				System.out.println("Bye!--");
			}
		return sum;
	}
}
