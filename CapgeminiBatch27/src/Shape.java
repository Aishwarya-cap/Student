import java.util.*;
public class Shape {
	double length;
	double width;
	Scanner scn = new Scanner(System.in);
	
	
	
	public void getArea() {
		System.out.println("Enter Length");
		length=scn.nextDouble();
		System.out.println("Enter width");
		width=scn.nextDouble();
		System.out.println(length*width);
		
	}

}
