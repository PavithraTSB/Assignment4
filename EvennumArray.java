package workout;

import java.util.Scanner;

public class EvennumArray {

	public static void main(String[] args) {
		int a[]=new int[10];
		int count=0;

		for(int i=1;i<=a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("The total odd numbers between 1 to 10 is :"+count);

	}

}
