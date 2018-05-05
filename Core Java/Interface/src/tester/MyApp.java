package tester;

import java.util.Scanner;

import emppkg.Emp;
import stkpkg.FixedStack;
import stkpkg.GrowableStack;
import stkpkg.MyStack;

public class MyApp {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		MyStack st = null;
		int loop = 1;
		int key = 0;
		int flag = 0;
		
		while(loop == 1){
			System.out.println("Menu\n1 -- Choose Fixed Stack\n2 -- Choose Growable Stack\n3 -- Push data \n4 --- Pop data\n5 --- Print data\n6 -- Exit");
			key = sc.nextInt();
			switch (key) {
			case 1:
				if(flag == 0){
					flag = 1;
					st = new FixedStack();
				}else{
					System.out.println("Descition is already made...");
				}
				break;
			case 2:
				if(flag == 0){
					flag = 1;
					st = new GrowableStack();
				}else{
					System.out.println("Descition is already made...");
				}
				break;
			case 3:
				System.out.println("Enter Employee id and Name");
				st.push(new Emp(sc.nextInt(),sc.next()));
				break;
			case 4:
				System.out.println("Enter Employee id and Name");
				st.pop();
				break;
			case 5:
				System.out.println(st);
				break;
			case 6:
				loop=2;
				System.exit(0);
				//break;
			default:
				break;
			}
		}
	}

}
