package com.conceptoftheday.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		//creating an arraylist object
		ArrayList<String> list = new ArrayList<String>();
		
		//adding elements into arraylist
		list.add("Revathi");
		list.add("Pavani");
		list.add("Java");
		
		//getting the size of arraylist
		System.out.println(list.size());
		list.add("Siri");
		list.add("Sravani");
		
		System.out.println(list.size());
		
		//removing an element at index 1 from the arraylist
		list.remove(1);
		
		System.out.println(list.size());
		
		list.add("");
		list.add("");
		
		System.out.println(list.size());
		
		//creating an arraylist without generics
		ArrayList al = new ArrayList();
		
		//adding string
		al.add("String");
		
		//adding float
		al.add("25.3");
		
		//adding integer
		al.add("85");
		
		//adding float wrapper type 
		al.add(new Float(25.3));
		
		//adding wrapper long type
		al.add(new Long(85));
		
		System.out.println(list);
		System.out.println(al);
		
		//list iterator
		ListIterator iterator = list.listIterator();
		System.out.println("Elements in forward direction");
         
        	while (iterator.hasNext())
        	{
            	System.out.println(iterator.next());
        	}
         
        	System.out.println("Elements in backward direction");
         
        	while (iterator.hasPrevious())
        	{
            	System.out.println(iterator.previous());
        	}
	}

}
