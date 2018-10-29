//**************************************************

// Author: My Nguyen
// Course: COP 2510
// File: DogsFromFile.java
// Purpose: A test driver for class Dog that scans the file for name, breed, and age while outputting how many dogs created and their  information
 
//**************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DogsFromFile
{
	// reads a csv file of dogs and create dog objects from content
   public static void main(String[] args) throws FileNotFoundException
   {
   
		Dog dog;
		
		Boolean ok = false; 
		  
		System.out.println("This is DogsFromFile.");
		
		while (!ok) // Enter loop and continue asking for file from user if incorrect file
		{
		 
			// Get file from user
			System.out.print("Please enter of a CSV file: ");
			Scanner keyboard = new Scanner(System.in);
			String filename = keyboard.nextLine();
			  
			try
			{
				String filename2 = "2"; // set file name to "2"
				
				File file = new File(filename);
				Scanner fileScanner = new Scanner(file);
				System.out.println();
				
				// for writing file to another file
				FileOutputStream fos = new FileOutputStream(filename2, false);
				PrintWriter pw = new PrintWriter(fos);
				
				
				// Get dogs from file
				while(fileScanner.hasNext())
				{
					String str = fileScanner.nextLine();
					Dog dog1 = new Dog(str);
				
					if (dog1.isValid())
					{
						System.out.println(dog1); // outputs on screen 
						
						pw.println(dog1.newInfo()); // writes inputs to file
					}
					
					else
					{
						String serialstr = dog1.Serialize();
						System.out.println("Bad Dog: " + serialstr + str);	// outputs on screen									
						System.out.println();
						pw.println(serialstr + str); // writes inputs to file
					}					
				}

				pw.close();
				System.out.println("End of file reached.");
				break;						
			}			
				 
			catch (FileNotFoundException ex) //try again if wrong file
			{
				System.out.println("File " + filename + " was not found.");
				System.out.println("Please try again.");  
			}
		}
		
		System.out.println();
		System.out.println("Program complete.");			
	}
}  
     