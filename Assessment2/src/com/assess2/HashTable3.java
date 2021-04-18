package com.assess2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable3 {
	public static void main(String[] args) {
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(1, "First");
		table.put(2, "Second");
		table.put(3, "Third");
		System.out.println(table);	
		
		Set<Integer> keys=table.keySet();
		Iterator<Integer> it=keys.iterator();
		
		while(it.hasNext())
		{
			Integer n=it.next();
			System.out.println("Key: "+n+" & Value: "+table.get(n));
		}
	}
}
