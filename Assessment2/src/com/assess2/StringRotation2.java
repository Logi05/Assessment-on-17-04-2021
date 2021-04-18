package com.assess2;

public class StringRotation2 {
	public static void main(String[] args) {
		String str1 = "XYZ";
		String str2 = "ZXY";

		if (areRotations(str1, str2))
			System.out.println("True");
		else
			System.out.printf("False");
	}

	static boolean areRotations(String str1, String str2) {
		return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}
}
