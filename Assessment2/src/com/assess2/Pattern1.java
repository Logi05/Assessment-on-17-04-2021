package com.assess2;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			int temp=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(temp + " ");
				temp=temp*(i-k)/(k);
			}
				System.out.println();	
		}
		}
	}

