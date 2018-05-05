package cdac;

public class Person {
	
	protected String fName;
	protected String lname;
	
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
