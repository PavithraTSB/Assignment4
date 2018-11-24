package assignments;

import java.util.Scanner;

public class Triangle extends Figure {

	@Override
	public void findArea() {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the width of the Triangle:");
	      double base = scan.nextDouble();

	      System.out.println("Enter the height of the Triangle:");
	      double height = scan.nextDouble();

	      //Area = (width*height)/2
	      dim1 = (base* height)/2;
	      System.out.println("Area of Triangle is: " + dim1);      
	}

	@Override
	public void findPerimeter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sides of the triangle");
		float a=scan.nextFloat();
		float b=scan.nextFloat();
		float c=scan.nextFloat();
		dim1=a+b+c;
		System.out.println("Perimeter of Triangle is: "+dim1);
		
	}

	
}
