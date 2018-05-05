package tester;

import java.util.Scanner;

import cdac.Faculty;
import cdac.Person;
import cdac.Student;

public class EventOrganizer {

	public static void main(String[] args) {

		Person[] p = new Person[10];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int c = 1,counter = 0, loop=1,cunt;
		while(loop == 1 ) {
			System.out.println("Options \n1 : Register Faculty.\n2 : Register Student.\n3 : Display info of all registered members. \n4 : Introduce yourself \n5. :  Submit Feedback or evaluation report \n6.Exit.");
			c = sc.nextInt();
			switch (c) {
				case 1:
					System.out.println("fName,lname,yrsOfExp,dname");
					p[counter] = new Faculty(sc.next(),sc.next(),sc.nextInt(),sc.next());
					counter++;
					break;
				case 2:
					System.out.println("Enter fname,lname,gardYear,course");
					p[counter] = new Student(sc.next(),sc.next(),sc.nextInt(),sc.next());
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
					if(p[counter] instanceof Student){
						((Student) p[counter]).feedback();
					}else if(p[counter] instanceof Faculty){
						((Faculty) p[counter]).Evaluate();
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
			//sc.nextLine();
		}
	}

}
