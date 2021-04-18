package com.assess2;

public class ArithmeticExcep5 {
	public static void main(String[] args) {
		int i=8,j=0,k;
		try {
				int result=i/j;
				System.out.println(result);
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		}
	}
}
