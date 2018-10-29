//**************************************************

// Author: My Nguyen
// Course: COP 2510
// File: Car_Test.java
// Purpose: A test driver for class Car
 
//**************************************************

import java.util.Scanner;

public class Car_Test
{
	
	// ********************************************************
	// Creates a car object and then call the isAntique method. 
	// ********************************************************
	
	public static void main (String[] args)
	{
		String carMake;
		String carModel;
		int carYear;
		int carYearAntique = 1991;
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Make of the car?");
		carMake = scan.nextLine();
		
		System.out.print ("Model of the car?");
		carModel = scan.nextLine();
		
		System.out.print ("Year of the car?");
		carYear = scan.nextInt();
		
		// Create a car object 
		Car car1 = new Car (carMake, carModel, carYear);
		
		// Print summary for the car
		System.out.println();
		System.out.println(car1);
		
		// Determine if car is antique or not
		if (carYear < carYearAntique)
		{
			System.out.println();
			System.out.println("This car is an antique.");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("This car is not an antique.");
			System.out.println();
		}
	}
}