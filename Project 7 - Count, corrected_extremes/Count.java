/*

Author: My Nguyen
Course: COP 2510 Section 001
File: Count.java
Purpose: This porgram reads a string (phrase) and counts the number of space characters and certain other letters in the phrase. 

*/

import java.util.Scanner;

public class Count
{
	public static void main(String[] args)
	{
		String phrase;		// a string of characters
		int blankCount;	// the number of blanks (spaces) in the phrase
		int length;			// the length of the phrase
		char ch;			   // an individual character in the string
		int countA, countE, countS, countT;		// the number of A, E, S, and T
		
		Scanner scan = new Scanner(System.in);
		
		// Print a program header
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		
		// Read in a string and find its length
		System.out.print("Enter a sentence or phrase: ");
		phrase = scan.nextLine();
		length = phrase.length();
		
		// Initialize counts
		blankCount = 0;
		countA = 0;
		countE = 0;
		countS = 0;
		countT = 0;
		
		// A "for" loop to go through the string
		for (int i = 0; i < length; i++)
		{
			ch = phrase.charAt(i);
			
			// Caracter by character and count the space characters
			switch (ch)
			{
				case 'a':
				case 'A': countA++;
						  break;
				case 'e':
				case 'E': countE++;
						  break;
				case 's':
				case 'S': countS++;
						  break;
				case 't':
				case 'T': countT++;
						  break;
				case ' ':
					blankCount++;
					break;
			}
		}
		
		// Print the results
		System.out.println();
		System.out.println("Number of space characters: " + blankCount);
		System.out.println("Number of a's: " + countA);
		System.out.println("Number of e's: " + countE);  
		System.out.println("Number of s's: " + countS);
		System.out.println("Number of t's: " + countT);
		System.out.println();
	
		// A nested "do-while" and "for" loop to go through other phrases
		do
		{		

			// Initialize counts again to restart counts
			blankCount = 0;
			countA = 0;
			countE = 0;
			countS = 0;
			countT = 0;
			
			// Read in another string and find its length
			System.out.println("Enter another sentence or phrase.");
			System.out.println("Or enter the word quit to end the program.");
			phrase = scan.nextLine();
			length = phrase.length();
			phrase = phrase.toLowerCase(); // Any input of "quit" will be lowercased 
			
			// A "for" loop to go through the string
			for (int i = 0; i < length; i++)			
			{
				ch = phrase.charAt(i);
					
				switch (ch)
				{
						case 'a':
						case 'A': countA++;
								  break;
						case 'e':
						case 'E': countE++;
								  break;
						case 's':
						case 'S': countS++;
								  break;
						case 't':
						case 'T': countT++;
								  break;
						case ' ':
							blankCount++;
							break;
				}
				
			}
			
			// If phrase is not equal to "quit", then print results
			if (!phrase.equals("quit"))
			{
				System.out.println();
				System.out.println("Number of space characters: " + blankCount);
				System.out.println("Number of a's: " + countA);
				System.out.println("Number of e's: " + countE);  
				System.out.println("Number of s's: " + countS);
				System.out.println("Number of t's: " + countT);
				System.out.println();
			}
			// Otherwise, exit program
			else
			{
				System.out.println();
			}  
			
		} while (!phrase.equals("quit")); // This will continue to run if user did not input "quit"
      
	}
}


		

