package assignments;

import java.util.Scanner;

public class Circle extends Figure{
	
	double pi=3.14;

	
	@Override
	public void findArea() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		int r=scan.nextInt();
		dim1= pi*r*r;
		System.out.println("Area of the circle = " + dim1);
		
		
	}

	@Override
	public void findPerimeter() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=scan.nextInt();
		dim1=2*pi*r;
		System.out.println("Perimeter of the circle =" + dim1);
		
	}

}
  