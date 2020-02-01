package org.test;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Quote14 {
public static void main(String[] args) {
	Map<String ,String>mp=new HashMap();
	mp.put("Vel", "Selenium");
	mp.put("ganesh", "Framework");
	mp.put("Dinesh", "Oracle");
	mp.put("Venket", "Corejava");
	mp.put("Subhash", "Jirah");
	System.out.println(mp);
	//TO print all keys
	Set<String>keys=mp.keySet();
	System.out.println("keys :"+keys);
	//To print all values
	Collection <String>values =mp.values();
	System.out.println("vales :"+values);
}
}
