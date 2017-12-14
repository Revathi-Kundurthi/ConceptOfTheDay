package com.conceptoftheday.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JSP");
		list.add("Servlets");
		list.add("Spring");
		
		//Using for Loop
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		//Using Iterator
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			
			it.remove();
		}
		
		//Using ListIterator
		ListIterator<String> lit = list.listIterator();
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.hasNext());
		}
		
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
	}

}
