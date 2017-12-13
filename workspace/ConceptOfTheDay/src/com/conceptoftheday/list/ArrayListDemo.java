package com.conceptoftheday.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("Revathi");
		list.add("Pavani");
		list.add("Java");
		
		System.out.println(list.size());
		list.add("Siri");
		list.add("Sravani");
		
		System.out.println(list.size());
		
		list.remove(1);
		
		System.out.println(list.size());
 
	}

}
