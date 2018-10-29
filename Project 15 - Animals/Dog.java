//************************************************
// Author: My Nguyen
// Course: COP 2510 Section 001
// File: Dog.java
// Purpose: Represents a dog 
//************************************************

import java.util.*;

public class Dog extends Animal
{
	// instance variables
	private String breed;
	private String favorite_treat;
	
	// constructor
	public Dog (String name, String owner_name, Calendar dob, String breed, String favorite_treat)
	{
		super("Dog", name, owner_name, dob); // from Animal class
		this.breed = breed;
		this.favorite_treat = favorite_treat;
	}
	
	public String toString()
	{
		return super.toString() +
						" Breed:" + breed + 
						" Favorite Treat:" + favorite_treat;
	}
	// accessor methods specific to Dog class
	public String Breed()
	{
		return breed;
	}
	public String Favorite_treat()
	{
		return favorite_treat;
	}
}

