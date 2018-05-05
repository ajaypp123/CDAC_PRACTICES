package com.core.cdac.people;

public class Faculty extends Person{
	private int yrsOfExp;
	private String dname;
	
	public Faculty(String fName,String lname,int yrsOfExp,String dname){
		this.yrsOfExp = yrsOfExp;
		this.dname = dname;
		this.lname = lname;
		this.fName = fName;
	}
	
	public String getName() {
		return fName+lname;
	}
	
	
	public int getYrsOfExp() {
		return yrsOfExp;
	}

	public String getDname() {
		return dname;
	}

	@Override
	public String toString(){
		return "Name: " + fName+lname + " yrsOfExp: " + yrsOfExp + " dname: " + dname;
	}
	
	public void Evaluate(){
		System.out.println("Evaluate Event from Faculty.");
	}
	
	public String introduce(String fName,String lname,int yrsOfExp,String dname){
		return toString();
	}
}
