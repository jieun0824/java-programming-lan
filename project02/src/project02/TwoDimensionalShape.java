package project02;

public class TwoDimensionalShape {
	private static String CLASS_NAME = "2D Shape";
	private String name;
	private double dimension1;
	private double dimension2;
	

	//constructor
	public TwoDimensionalShape(String name, double d1, double d2) {
		this.name = name;
		this.dimension1 = d1;
		this.dimension2 = d2;
	}
	
	public String getClassName() {
		return CLASS_NAME;
	}
	
	public String getName() {
		return name;
	}
	
	public double getDimension1() {return this.dimension1;}
	public void setDimension1(double d) {this.dimension1 = d;}
	
	public double getDimension2() {return this.dimension2;}
	public void setDimension2(double d2) {this.dimension2 = d2;}
	
	public double getArea() {return 0;}

}
