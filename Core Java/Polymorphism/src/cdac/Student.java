package cdac;

public class Student extends Person{
	private int gradYear;
	private String course;
	
	public Student(String fName,String lname,int gradYear,String course){
		this.gradYear = gradYear;
		this.course = course;
		this.lname = lname;
		this.fName = fName;
	}
	
	public String introduce(){
		return toString();
	}
	
	public void feedback(){
		System.out.println("Feedback of Student.");
	}
	
	@Override
	public String toString(){
		return "Name: " + fName+lname + " Graduation Year: " + gradYear + " Course: " + course;
	}
}
