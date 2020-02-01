package org.test;

import java.util.Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Quote13 {
	public static void main(String[] args) {
		Map<String,Integer>mp=new TreeMap();
		mp.put("!", 10);
		mp.put("@", 20);
		mp.put("$", 30);
		mp.put("%", 40);
		mp.put("^", 50);
		mp.put("&", 60);
		mp.put("*", 10);
		mp.put("(", 50);
		mp.put(")", 40);
		System.out.println(mp);
		//To print the all keys
		Set<String>keys =mp.keySet();
		System.out.println("keys"+keys);
		//To print all values
	Collection <Integer>values =mp.values();
	System.out.println("valus :"+values);

		
		
	}


}
