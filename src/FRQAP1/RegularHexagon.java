package FRQAP1;
import java.util.ArrayList;
import java.awt.Point;
public class RegularHexagon {
	
	private ArrayList<Point> points;
	
	public RegularHexagon(ArrayList<Point> pts) {
		points = pts;
	}
	
	public double getSideLength() {
		double x1 = points.get(0).getX();
		double x2 = points.get(1).getX();
		double y1 = points.get(0).getY();
		double y2 = points.get(1).getY();
		
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
	
	public double getArea() {
		double temp = 3 * Math.sqrt(3);
		return temp * Math.pow(getSideLength(),2) / 2;
	}
	
	public Point getCenter() {
		double x1 = points.get(0).getX();
		double x2 = points.get(3).getX();
		double y1 = points.get(0).getY();
		double y2 = points.get(3).getY();
		Point point = new Point();
		point.setLocation((x1+x2)/2, (y1+y2)/2);
		return point;
	}

}
