package project02;

public class Circle extends TwoDimensionalShape {
	private static String CLASS_NAME = "Circle";
	public Circle(String name, double r) {
		super(name, r, r);	
	}
	public static String getCLASS_NAME() {
		return CLASS_NAME;
	}
	public double getRadius() {
		return super.getDimension1();
	}
	
	public void setRadius(double r) {
		super.setDimension1(r);
	}
	
	public double getDiameter() {
		return super.getDimension1()*2;
	}
	
	public void setDiameter(double r) {
		super.setDimension1(r*2);
	}
	
	public double getArea() {
		return Math.PI*getRadius()*getRadius();
	}

}
