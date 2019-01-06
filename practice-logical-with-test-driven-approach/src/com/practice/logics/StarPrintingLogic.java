package com.practice.logics;

import java.util.Scanner;
import java.util.logging.Logger;

public class StarPrintingLogic {
	private static final Logger LOGGER  = Logger.getLogger("StarPrintingLogic");
	public static void main(String[] args) {
		LOGGER.info("Please enter the no of row you want in following console");
		int no = new Scanner(System.in).nextInt();
		if(no>0) {
			int row = no;
			int i=0;
			while(i<row) {
				int diff = (row-1)-i;
				for(int j=0;j<diff;j++)
					System.out.print(" ");
				for(int k=0;k<=i;k++) {
					if(k==i)
						System.out.println("*");
					else
						System.out.print("*"+" ");
				}
				i++;
			}
		}
		else
			LOGGER.info("Not Valid Input");
	}
}
