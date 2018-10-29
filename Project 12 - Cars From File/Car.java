// *************************************************

// Author: My Nguyen
// Course: COP 2510
// File: Car.java
// Purpose: Represents a car's make, model, and year
 
// *************************************************

import java.util.Scanner;

public class Car
{
    // Instance variables
    private String make;
    private String model;
    private int year;
    private Scanner scan;	
              
    //-----------------------------------------------------
    // Constructor - sets up a car object by initializing 
    // the make, model, and year of the car.
    //-----------------------------------------------------
    public Car(String make_, String model_, int year_)
    {
        make = make_;
        model = model_;
        year = year_;
    }
    
    public Car (Scanner scan) // Has Scanner as parameter
    {
        make = scan.nextLine();
        model = scan.nextLine();
        year = scan.nextInt();
        scan.nextLine();
    }     
   
    //------------------------------------------------------
    // Method isAntique returns true if the car is more than 
    // 25 years old.
    //-------------------------------------------------------
    public boolean isAntique()
    {
        return (2016 - year) > 25;
    }
            
    //------------------------------------------------------
    // Returns a string representation of a car.
    //------------------------------------------------------
    public String toString()
    {
        String result = year + " " + make + " " +  model;
        return result;
    }
}