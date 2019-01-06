package com.practice.logics;

public class CoolDudePrintingLogic {
	
	private int limit;
	
	
	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public void printingLogic() {
		if(limit>0) {
		for(int i=1;i<limit;i++) {
			if(i%5==0 && i%11==0) {
				System.out.println("Cool Dude"+" with number multiple of 5 as well as 11 is  = "+i);
			}
			
			else if(i%5==0) {
				System.out.println("Cool"+" with number multiple of 5 is = "+i);
			}
			else {
				if(i%11==0) {
				System.out.println("Dude"+" with number multiple of 11 is = "+i);
				}
			}
		}
		}
		else
			System.out.println("Thank You");
	}
}
