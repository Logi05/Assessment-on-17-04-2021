package com.assess2;

import java.util.Scanner;

public class PatternEg2 {
	public static void main(String[] args) {
		System.out.println("Enter No of rows:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1; i<=n;i++) {
			for(int j=i; j <= n; j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		for (int i=n-1;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}