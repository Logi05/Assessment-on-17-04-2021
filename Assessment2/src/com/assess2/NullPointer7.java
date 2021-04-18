package com.assess2;

import java.util.Optional;

public class NullPointer7 {
	public static void main(String[] args) {
		String a[]=new String[10];
		Optional<String> check=Optional.ofNullable(a[1]);
		if(check.isPresent())
		{
			String upcase=a[1].toUpperCase();
			System.out.println(upcase);
		}
		else
		{
			System.out.println("String value is not Present");
		}
	}
}
