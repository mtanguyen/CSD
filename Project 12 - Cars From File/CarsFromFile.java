//**************************************************

// Author: My Nguyen
// Course: COP 2510
// File: CarsFromFile.java
// Purpose: A test driver for class Car that scans the file for make, model, and year while outputting how many cars created and their information
 
//**************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CarsFromFile
{
   public static void main(String[] args) throws FileNotFoundException
   {
   
    Car[] cars = new Car[100]; // Array of cars
      
    System.out.println("This is CarsFromFile.");
    System.out.println();

		while (true) // Enter loop and continue asking for file from user if incorrect file
		{
		 
			// Get file from user
			System.out.print("Please enter file name: ");
			Scanner keyboard = new Scanner(System.in);
			String filename = keyboard.nextLine();
		  
			try
			{
				File file = new File(filename);
				Scanner fileScanner = new Scanner(file);
				System.out.println("End of file reached.");
				System.out.println();
							
				for (int i = 0; i < cars.length; i++)
				{
				
				   int total = 0;
				   while(fileScanner.hasNext())
				   {
				   
						Car car = new Car(fileScanner);
						cars[i] = car;
						total++;
						System.out.println(cars[i]);
						//System.out.println(total + " car[s] created.");

					}
					
					if (cars[i] != null)
					{
						System.out.println();
						System.out.println(total + " car[s] created."); // Number of cars created
					}

				} 

				System.out.println();
				System.out.println("Program complete.");
				break; // So it won't ask for another file name
			}
			 
			catch (FileNotFoundException ex)
			{
				System.out.println("File " + filename + " was not found.");
				System.out.println("Please try again.");  
			}

		}
      
	}
}  
     