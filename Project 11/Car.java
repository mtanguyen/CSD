// *************************************************

// Author: My Nguyen
// Course: COP 2510
// File: Car.java
// Purpose: Represents a car's make, model, and year
 
// *************************************************

public class Car
{
	// Instantiate variables that represents a car
	private String make;
	private String model;
	private int year; 
	private final int yearAntique = 1991; // Set to where it determines if car is antique or not
	
	// **********************************************************************************
	// Constructor: Sets up a car object by initializing the make, the model and the year
	// **********************************************************************************
	
	public Car(String newMake, String newModel, int newYear)
	{
		make = newMake;
		model = newModel;
		year = newYear;	
	}
	
	// *************************************************
	// Method isAntique: Determines if car is antique or not
	// *************************************************
	
	public boolean isAntique()
	{
		// Check to see if car is over 25 years old or not
		if (year < yearAntique) // Car is over 25 years old
		{
			boolean isAntique = true;
			return isAntique;
		}
		else
		{
			boolean isAntique = false;
			return isAntique;
		}
		
	}
	
	// *************************************************
	// Returns a string representation of a car
	// *************************************************
	
	public String toString()
	{
		return year + "\t" + make + "\t" + model;	
	}

}