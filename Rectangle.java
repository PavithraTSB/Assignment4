package assignments;

import java.util.Scanner;

public class Rectangle extends Figure {
	
	
	@Override
	public void findArea() {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println(" Enter the length of Rectangle: ");
		   double length = scanner.nextDouble();
		   System.out.println("Enter the width of Rectangle:");
	       double width = scanner.nextDouble();
		   dim1 = length*width; //area=l*b
		   System.out.println("Area of Rectangle is:"+dim1);
		
	}

	@Override
	public void findPerimeter() {
		Scanner scanner = new Scanner(System.in);
		   System.out.println(" Enter the length of Rectangle: ");
		   double length = scanner.nextDouble();
		   System.out.println("Enter the width of Rectangle:");
	       double width = scanner.nextDouble();
		dim1 =2*(length+width); //2*(l+b)
		System.out.println("Perimeter of Rectangle is:"+dim1);
	}

	
	
}
