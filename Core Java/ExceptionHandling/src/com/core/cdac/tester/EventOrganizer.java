package com.core.cdac.tester;

import java.util.Scanner;

//import com.core.cdac.exception.MyCustExce;
import com.core.cdac.people.Faculty;
import com.core.cdac.people.Person;
import com.core.cdac.people.Student;
import static com.core.cdac.utils.Validater.*;

/*
 
	Day 7
	1. Complete pending assignments.
	2. Add validation rules before you register any student or faculty
	2.1 No duplicate first & last names.
	2.2 Graduation year must be curnt year or at the most curnt yr -3.
	2.3 Faculty must have min 10 years experience.
	2.4 valid course names are -- dac,dmc,desd,dbda
	In case of validation errors , raise custom exception . Must be handled in a centralized try-catch manner. (Hint : Use throws in validation rules).
	In the absence of validation errors , register a person.

 */

public class EventOrganizer {

	public static void main(String[] args) {

		Person[] p = new Person[10];
		
		String fName;
		String lname;
		int yrsOfExp;
		String dname;
		
		int gradYear;
		String course;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int c = 1,counter = 0, loop=1,cunt;
		
		while(loop == 1 ) {
			System.out.println("Options \n1 : Register Faculty.\n2 : Register Student.\n3 : Display info of all registered members. \n4 : Introduce yourself \n5. :  Submit Feedback or evaluation report \n6.Exit.");
			c = sc.nextInt();
			try{
				switch (c) {
					case 1:
						System.out.println("fName,lname,yrsOfExp,dname");
						fName = sc.next();
						lname = sc.next();
						validateName(fName,lname,p,counter);
						yrsOfExp = sc.nextInt();
						validateExperiance(yrsOfExp);
						dname = sc.next();
						p[counter] = new Faculty(fName,lname,yrsOfExp,dname);
						counter++;
						break;
					case 2:
						System.out.println("Enter fname,lname,gardYear,course");
						fName = sc.next();
						lname = sc.next();
						validateName(fName,lname,p,counter);
						gradYear = sc.nextInt();
						validateYear(gradYear);
						course = sc.next();
						validateCourse(course);
						p[counter] = new Student(fName,lname,gradYear,course);
						counter++;
						break;
					case 3:
						for (int i = 0; i < counter; i++) {
							System.out.println(p[i]);
						}
						break;
					case 4:
						System.out.println("Enter Seat No: ");
						cunt = sc.nextInt();
						if(cunt < counter){
							System.out.println(p[cunt].introduce());
						}else{
							System.out.println("Invalid seat Number.");
						}
						break;
					case 5:
						System.out.println("Enter Seat No: ");
						cunt = sc.nextInt();
						if(p[cunt] instanceof Student){
							((Student) p[cunt]).feedback();
						}else if(p[cunt] instanceof Faculty){
							((Faculty) p[cunt]).Evaluate();
						}else{
							System.out.println("Invalid seat Number.");
						}
						break;
					case 6:
						loop = 2;
						break;
					default:
						System.out.println("Invalid choise.");
						break;
				}
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			sc.nextLine();
		}
	}

}
