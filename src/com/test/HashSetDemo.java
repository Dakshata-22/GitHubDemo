package com.test;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs =  new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		for (Integer i : hs){
			
			System.out.println(i);
	}
}
