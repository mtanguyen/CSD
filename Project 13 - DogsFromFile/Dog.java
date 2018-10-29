// *************************************************

// Author: My Nguyen
// Course: COP 2510
// File: Dog.java
// Purpose: Represents a dog's name, breed, age

// *************************************************

import java.util.Scanner;

public class Dog
{
	private static int Dog_Count = 0;
	
	// instantiate variables
	private String name;
	private String breed;
	private int age;
	private Scanner dogScanner;
	
	//-----------------------------------------------------
    // Constructor - sets up a dog object by initializing
	// the name, breed and age
    //-----------------------------------------------------
	
	public Dog(String name, String breed, int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;	
		Dog_Count++; // increment number of dogs
	}
	
	public Dog(Scanner dogScanner) // scan attributes of a single dog
	{
		this.name = dogScanner.nextLine();
		this.breed = dogScanner.nextLine();
		this.age = dogScanner.nextInt();
		dogScanner.nextLine();
	}
	
	//--------------------------------------------------------------
    // Method ageInPersonYears() takes no parameter that compute and 
	// returns age of dog in persons years (seven times dog years)
    //--------------------------------------------------------------

	public int ageInPersonYears()
	{
		int personAge = age * 7;
		return personAge;
	}
	
	//------------------------------------------------------
    // Returns a string representation of a dog.
    //------------------------------------------------------
	
	public String toString()
	{
		return name + "\t" + breed + "\t" + age + " age in person years: " + ageInPersonYears();	
	}
	
	public static int Get_Dog_Count() // get instances of dog
	{
		return Dog_Count;
				
	}
	
}