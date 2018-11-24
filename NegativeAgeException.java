package assignments;

import java.util.Scanner;

public class NegativeAgeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //Declaring Scanner to take input from user
		System.out.println("Enter Your Age");
        int age = sc.nextInt();         //Taking input from user

        try
        {
            if(age > 0)
            {
            	System.out.println("Valid Age");//Valid age
                
            }
            else
            {
            	System.out.println("Invalid age");
            	throw new Exception();//throws an Exception if age is negative
            }
           
            	
        }
        catch(Exception ex)
        {
            System.out.println(ex);     //Prints exception description
        }
		

	}

}
