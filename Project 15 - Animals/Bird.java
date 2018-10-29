//************************************************
// Author: My Nguyen
// Course: COP 2510 Section 001
// File: Bird.java
// Purpose: Represents a bird 
//************************************************

import java.util.*;

public class Bird extends Animal
{
	// instance variables
	private String species;
	private double wingspan;
	
	// constructor
	public Bird (String name, String owner_name, Calendar dob, String species, double wingspan)
	{
		super("Bird", name, owner_name, dob); // from Animal class
		this.species = species; 
		this.wingspan = wingspan;
	}
	
	public String toString()
	{
		return super.toString() + 
						" Species:" + species + 
						" Wingspan:" + wingspan;
	}
	// accessor methods specific to Bird class
	public String Species()
	{
		return species;
	}
	public double Wingspan()
	{
		return wingspan;
	}
}

