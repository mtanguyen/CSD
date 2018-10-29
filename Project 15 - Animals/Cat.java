//************************************************
// Author: My Nguyen
// Course: COP 2510 Section 001
// File: Cat.java
// Purpose: Represents a cat 
//************************************************

import java.util.*; 

public class Cat extends Animal
{
	// instance variables
	private String breed;
	private String preferred_catfood;
	
	// constructor
	public Cat (String name, String owner_name, Calendar dob, String breed, String preferred_catfood)
	{
		super("Cat", name, owner_name, dob); // from Animal class
		this.breed = breed; 
		this.preferred_catfood = preferred_catfood;
	}
	
	public String toString()
	{
		return super.toString() + 
						" Breed:" + breed + 
						" Preferred catfood:" + preferred_catfood;
	}
	// accessor methods specific to Cat class
	public String Breed()
	{
		return breed;
	}
	public String Preferred_catfood()
	{
		return preferred_catfood;
	}
}

