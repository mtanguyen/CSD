/* 

Author: My Nguyen
Course: COP 2510 Section 001 
File: StringArray.java
Purpose: Reverse the strings entered by user
*/


import java.util.Scanner;

public class StringArray
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		//Prompt user to enter number of strings he/she wants
		System.out.print("How many strings do you have? ");
		number = scan.nextInt();
		scan.nextLine(); 
		
		// Creates an array with the number of strings user entered
		String[] phrase = new String[number];
		
		// System.out.println("Array of length " + phrase.length);

		// Loop the number of strings the user entered
		for (int index = 0; index < phrase.length; index++)
		{
			System.out.print("Enter string #" + (index+1) + ": ");
			phrase[index] = scan.nextLine();
		} 
		
		// Print strings the user entered
		System.out.println();
		System.out.println("The array contains: ");
		
		for (int index = 0; index < phrase.length; index++)
		{
			System.out.println(phrase[index] + " ");
		}
		
		// Print strings in reverse
		System.out.println();
		System.out.println("The array in reverse order: ");

		for (int index = phrase.length - 1; index >= 0; index--)
		{
			System.out.println(phrase[index] + " ");
		} 
		
	}
}