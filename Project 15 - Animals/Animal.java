//************************************************
// Author: My Nguyen
// Course: COP 2510 Section 001
// File: Animal.java
// Purpose: Represents an animal 
//************************************************

import java.util.*; 

public class Animal
{
	
	// Instance variables
	private String kind_of_animal;
	private String name;
	private String owner_name;
	private Calendar date_of_birth; 
	private int month; 
	private int day;
	private int year;
	
	 
	//-----------------------------------------------------
    // Constructor - Initializes instance variables
    //-----------------------------------------------------
	public Animal(String kind_of_animal, String name, String owner_name, Calendar dob)
	{
		
		date_of_birth = Calendar.getInstance();
		
		this.kind_of_animal = kind_of_animal; 
		this.name = name;
		this.owner_name = owner_name;
		this.date_of_birth = dob;
				
	}
	
	// Calendar constructor to get date of birth
	public Calendar Date_of_Birth()
	{
		month = date_of_birth.get(Calendar.MONTH);
		day = date_of_birth.get(Calendar.DATE);
		year = date_of_birth.get(Calendar.YEAR); 

		return date_of_birth;
	}
	
	//------------------------------------------------------
    // Returns a string representation of an animal.
    //------------------------------------------------------
	public String toString()
    {
        return kind_of_animal +
			   " Name:" + name +
			   " Owner:" + owner_name + 
			   " Date of birth:" + 
			   ((date_of_birth.get(Calendar.MONTH)+1) + "/" + (date_of_birth.get(Calendar.DATE)) + "/" + (date_of_birth.get(Calendar.YEAR)));
	} 
	
	//------------------------------------------------------
    // Accessor methods specific to Animal class
    //------------------------------------------------------    
    public String Kind_of_animal() 
	{
		return kind_of_animal; 
	}      
	public String Name() 
	{
		return name;
	}
    public String Owner_name() 
	{
		return owner_name; 
	} 
    public Calendar Dob() 
	{
		return date_of_birth; 
	}

}