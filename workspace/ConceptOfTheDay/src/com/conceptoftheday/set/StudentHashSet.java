package com.conceptoftheday.set;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {

	String name;
	int rollno;
	String department;
	
	public StudentHashSet(String name, int rollno, String department) {

		this.name = name;
		this.rollno = rollno;
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentHashSet other = (StudentHashSet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return rollno+" , "+name+","+department;
	}
	

	public static void main(String[] args) {
		
		HashSet<StudentHashSet> set = new HashSet<StudentHashSet>();
		
		set.add(new StudentHashSet("Revathi", 547, "CSE"));
		set.add(new StudentHashSet("Yashwanth", 422, "ECE"));
		set.add(new StudentHashSet("Pavani", 505, "CSE"));
		set.add(new StudentHashSet("Thaslima", 435, "ECE"));
		set.add(new StudentHashSet("Nani", 435, "EEE"));
		set.add(new StudentHashSet("Nani", 544, "CSE"));
		set.add(new StudentHashSet("Sai", 435, "EEE"));
		set.add(new StudentHashSet("Mani", 105, "Mech"));
		
		Iterator<StudentHashSet> it = set.iterator();
		
		while(it.hasNext()){
			StudentHashSet student = (StudentHashSet) it.next();
			System.out.println(student);
		}
		

	}

}
