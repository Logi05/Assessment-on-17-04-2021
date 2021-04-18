package com.assess2;

import java.io.*;

public class ExcepSuper8 extends Parent{
		 void msg() throws IOException {  
			    System.out.println("Child");  

		 }
			public static void main(String[] args) {
				Parent p=new ExcepSuper8();  
				   p.msg();  
	}
}
class Parent{  
	  void msg()
	  {
		  System.out.println("parent");
	  }  
}  
