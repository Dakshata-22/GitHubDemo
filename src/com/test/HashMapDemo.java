package com.test;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Dakshata");
		hm.put(2,"Java");
		hm.forEach((x,y) -> System.out.println(x + " " + y));
	
	}
}