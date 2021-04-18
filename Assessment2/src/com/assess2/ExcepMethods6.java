package com.assess2;

public class ExcepMethods6 {
	public static void main(String[] args) {
		try
		{
			int i=20,j=0;
			int a=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		try {
			String s1="Hi";
			int n=Integer.parseInt(s1);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
}
}

