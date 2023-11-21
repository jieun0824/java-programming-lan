package project2;

public class superclass{
	static String CLASS_NAME = "1D Shape";
	double radius;
	double width;
	double height;
	double dimension1;
	double dimension2;
	
	
	public void TwoDimensionalShape(String name, double d1, double d2){
		CLASS_NAME = name;
		this.dimension1 = d1;
		this.dimension2 = d2;
	}
	

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
}


