package org.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Quote12 {
	public static void main(String[] args) {
		Map<Integer,Integer> mp =new LinkedHashMap();
		mp.put(10, 10);
		mp.put(20, 20);
		mp.put(30, 30);
		mp.put(40, 40);
		mp.put(50, 50);
		mp.put(60, 60);
		mp.put(10, 10);
		mp.put(50, 50);
		mp.put(40, 40);
		//To print the list values
		System.out.println(mp);
		//To get the key value
		Set<Integer>keys =mp.keySet();
		System.out.println("keys"+keys);
		//To print all values
		Collection <Integer>values =mp.values();
		System.out.println("values :"+values);
		//To print single values
		Integer name =mp.get(50);
		System.out.println(name);
		 
	}

}
