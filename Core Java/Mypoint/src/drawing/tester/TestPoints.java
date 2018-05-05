package drawing.tester;

import java.util.Scanner;
import drawing.basic.*;

public class TestPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Point2D p1 = new Point2D(0,0);
		Point2D p2 = new Point2D(0,0);
		
		System.out.println(p1.Show());
		System.out.println(p2.Show());
		
		System.out.println("Enter X and Y CO-ordinate1: ");
		int x  = sc.nextInt();
		int y = sc.nextInt();
		p1 = Point2D.createNewPoint(x,y);
		
		System.out.println("Enter X and Y CO-ordinate2: ");
		x  = sc.nextInt();
		y = sc.nextInt();
		p2 = Point2D.createNewPoint(x,y);
		
		System.out.println(p1.Show());
		System.out.println(p2.Show());
		
		System.out.println(p1.isEqual(p2));
		
		System.out.println(p1.calcDistance(p2));
		
		sc.close();
	}

}
