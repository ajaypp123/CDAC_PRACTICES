package com.core.cdac.people;

public class Person {
	
	protected String fName;
	protected String lname;
	
	public String getName() {
		return fName+lname;
	}

	public Person(){
		fName = "";
		lname = "";
	}
	
	public String introduce(){
		return toString();
	}
	
	@Override
	public String toString(){
		return "";
	}
}
