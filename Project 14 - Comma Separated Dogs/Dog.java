// *************************************************

// Author: My Nguyen
// Course: COP 2510
// File: Dog.java
// Purpose: Represents a dog's name, breed, age

// *************************************************

public class Dog
{
	
	// instantiate variables
	private String name;
	private String breed;
	private static int age = 0;
	private boolean isValid;

	// Constructor that sets up a dog object
	public Dog(String name, String breed, int age)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;	
	}
	
	//-----------------------------------------------------
    // Constructor - sets up a dog object from one line of Comma Separated Value file
    //-----------------------------------------------------
	public Dog (String dog_info)
	{
		String[] dogInfo = dog_info.split(",");
		
		if (dogInfo.length == 3)
		{
			this.name = dogInfo[0];
			this.breed = dogInfo[1];
			this.age = Integer.parseInt(dogInfo[2]);
			isValid = true;	
		}
		
		else
		{
			isValid = false;
		}	

	}
	
	public String newInfo()
	{
		String newInfo = this.name + "\t" + this.breed + "\t" + (this.age + 1) + "\n"; // Increment dog's age by one
		return newInfo;
	}
	
	// Returns a boolean to say whether or not dog is valid
	public boolean isValid()
	{
		return this.isValid;
	}
	
	// Returns a single string with all dog components
	public String toString()
	{
		if (this.isValid)
		{
			return
				this.name + "\t" + this.breed + "\t" + (this.age) + "\n";
		}
		else
		{
			return "Invalid dog \n";
		}
	}
	
	// Returns member variables as a string of commas
	public String Serialize()
	{
	
		if(this.isValid)
		{
			return
				this.name + ", " + this.breed + ", " + this.age + "\n";
		}
		else
		{
			return "\n";
		}
		
	}	
}