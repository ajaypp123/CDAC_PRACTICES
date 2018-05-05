package drawing.basic;

import java.lang.Math;

public class Point2D {
	
	private int X;
	private int Y;
	
	public Point2D(int X, int Y){
		this.X = X;
		this.Y = Y;
	}
	
	public String Show(){
		return "\nX : " + this.X + " Y: " + this.Y;
	}
	
	public boolean isEqual(Point2D p2){			//p1.isEqual(p2)
		if(this.X == p2.X && this.Y == p2.Y){
			return true;
		}else{
			return false;
		}
	}
	
	public static Point2D createNewPoint(int xOffset,int yOffset){
		Point2D temp = new Point2D(xOffset,yOffset);
		return temp;
	}
	
	public double  calcDistance(Point2D p2){
		int x = this.X - p2.X;
		int y = this.Y - p2.Y;
		double d = Math.sqrt((x*x) + (y*y));
		return d;
	}
}
