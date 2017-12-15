package com.conceptoftheday.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Creating a hashset
		HashSet<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JSP");
		set.add("Spring");
		set.add("Hibernate");
		set.add("Servlets");
		set.add("Web services");
		
		Set<String> syncset = Collections.synchronizedSet(set);
		
		System.out.println(syncset);

	}

}
