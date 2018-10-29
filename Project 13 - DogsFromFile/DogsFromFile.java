//**************************************************

// Author: My Nguyen
// Course: COP 2510
// File: DogsFromFile.java
// Purpose: A test driver for class Dog that scans the file for name, breed, and age while outputting how many dogs created and their 
// information
 
//**************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DogsFromFile
{
   public static void main(String[] args) throws FileNotFoundException
   {
   
		Dog[] dogs = new Dog[100]; // Array of dogs
		int count = 0;
		String filename = ""; 
		
		Boolean ok = false; 
		  
		System.out.println("This is DogsFromFile.");
		while (!ok) // Enter loop and continue asking for file from user if incorrect file
		{
		 
			// Get file from user
			System.out.print("Please enter file name: ");
			Scanner keyboard = new Scanner(System.in);
			filename = keyboard.nextLine();
			  
			try
			{
				File file = new File(filename);
				Scanner fileScanner = new Scanner(file);

				// Get dpgs from file
				while(fileScanner.hasNext())
				{
					   
					Dog dog = new Dog(fileScanner);
					dogs[count++] = dog; // stores dogs in array
				
				}
				
				System.out.println("End of file reached.");
				System.out.println();

				for (int i = 0; i < count; i++)
				{
					System.out.println(dogs[i]); // output dogs 
				}
				ok = true;
				
				System.out.println();
				System.out.println("There are " + count + " dog[s] in the system.");
			}			
				 
			catch (FileNotFoundException ex) 
			{
				System.out.println("File " + filename + " was not found.");
				System.out.println("Please try again.");  
			}
		}
		System.out.println();
		System.out.println("Program complete.");
	}
   
}  
     