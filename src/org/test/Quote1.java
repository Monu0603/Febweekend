package org.test;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Quote1 {
public static void main(String[] args) {
	Map<Integer,String> mp=new HashMap();
	mp.put(10, "Java");
	mp.put(20, "Sql");
	mp.put(30, "oops");
	mp.put(40, "Sql");
	mp.put(50, "Oracle");
	mp.put(60, "DB");
	mp.put(10, "Selenium");
	mp.put(50, "Psql");
	mp.put(40, "Hadoop");
	System.out.println(mp);
	//To print the keys alone
	Set<Integer>keys =mp.keySet();
	System.out.println("keys"+keys);
	//To print the values
	Collection <String>values =mp.values();
	System.out.println("values :"+values);
	//To print single values
	String name =mp.get(30);
	System.out.println(name);


}
}
