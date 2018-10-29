/*

Author: My Nguyen
Course: COP 2510 Section 001
File: KeyboardToFile.java
Purpose: This program reads an arbitrary number of strings from the keyboard and writes them to a text file. 

*/

import java.util.Scanner;
import java.io.*; // import all of jav.io libraries

/* 
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
*/

public class KeyboardToFile
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("This is program KeyboardToFile.");
		System.out.println();
		String phrase = " "; // initializing string phrase 
				
		try // wrap text in case of error
		{
			//get filename from user
			System.out.print("Please enter name for file to be written: ");
			Scanner keyboardScanner = new Scanner(System.in);
			String filename = keyboardScanner.nextLine();
			
			System.out.println("Enter strings to be written to the file.");
			System.out.println("Press Enter with no text to end the problem.");
			System.out.println();
			
			FileOutputStream fos = new FileOutputStream(filename, false);
			PrintWriter pw = new PrintWriter(fos); 
			
			while (!phrase.equals("")) // user enters a zero length string to close output and end program
			{
				pw.println(phrase); // enters next string to file
				phrase = keyboardScanner.nextLine(); // scans next string
			} 
					
			pw.close();
			
			System.out.println("File " + filename + " written."); 
			
		}
		catch (FileNotFoundException ex) // catches error 
		{
			System.out.println("Failed to create output file.");
		}
		
		System.out.println();
		System.out.println("Program complete.");
	}
}