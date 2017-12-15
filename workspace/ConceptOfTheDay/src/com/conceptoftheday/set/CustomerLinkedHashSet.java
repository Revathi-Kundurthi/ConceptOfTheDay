package com.conceptoftheday.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomerLinkedHashSet {

	String name;
	int id;
	
	public CustomerLinkedHashSet(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerLinkedHashSet other = (CustomerLinkedHashSet) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerLinkedHashSet [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
	
		LinkedHashSet<CustomerLinkedHashSet> linkset = new LinkedHashSet<CustomerLinkedHashSet>();
		
		linkset.add(new CustomerLinkedHashSet("Revathi", 1));
		linkset.add(new CustomerLinkedHashSet("Pavani", 2));
		linkset.add(new CustomerLinkedHashSet("Vardhini", 3));
		linkset.add(new CustomerLinkedHashSet("Veda", 4));
		linkset.add(new CustomerLinkedHashSet("Kavya", 4));
		linkset.add(new CustomerLinkedHashSet("Bhanu", 6));
		linkset.add(new CustomerLinkedHashSet("Venki", 5));
		
		Iterator<CustomerLinkedHashSet> it = linkset.iterator();
		
		while(it.hasNext()){
			CustomerLinkedHashSet cust = (CustomerLinkedHashSet) it.next();
			System.out.println(cust);
		}
		

	}

}
