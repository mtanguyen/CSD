/*

Author: My Nguyen
Course: COP 2510 Section 001
File: IntAve.java
Purpose: This program reads an arbitrary number of strings from the keyboard and writes them to a text file.
 
*/

import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;

public class IntAve
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("This is program IntAve.");
		
		// initializing at zero will stop try and while loop 
		int count = 0, sum = 0, integers = 0;
		double avg = 0;
		
		// get filename from user
		System.out.print("Please enter file name: ");
		Scanner keyboardScanner = new Scanner(System.in);
		String filename = keyboardScanner.nextLine();
		
		try //wrap code that might get error
		{
			File numbers = new File(filename);
			Scanner fileScanner = new Scanner(numbers);
			
			System.out.println();
			while (fileScanner.hasNext()) // test for end of file
			{
				// read next line from file
				integers = fileScanner.nextInt();
				count++;
				
				// calculates sum
				sum += integers;
			}
			
			// calculates average and prints average
			avg = (double) sum / integers;	
			System.out.println("The average is " + avg);
		}
		
		catch (FileNotFoundException ex) //catch the error if there is one
		{
			System.out.println("File " + filename + " was not found.");
		}
			
		System.out.println();
		System.out.println("Program complete.");	
	}
}
