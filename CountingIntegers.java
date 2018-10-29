/***********

 * Author: My Nguyen
 * Course: COP 2510 Section 001
 * File: CountingIntegers.java
 * Purpose: Count integers input by user
 
 ************/

import java.util.Scanner;

public class CountingIntegers 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int[] size = new int[51]; // holds 50 elements
		
		System.out.println("This is program int_count.");
		System.out.println();
		System.out.println("Enter integers in the range of 1 to 50 to be counted.");
		System.out.println("Enter 0 to stop input and show the counts.");
		System.out.println();
			
		System.out.print("First input: ");
		int value = scan.nextInt();
		size[value]++; // holds values in array
				
						
		while (value != 0) // terminates once zero is entered
		{
			System.out.print("Next input: ");
			value = scan.nextInt(); // continue scanning values
			
			if (value != 0)
			{
				if ((value > 50) || (value < 0)) // values have to be in between 1 and 50
				{
					System.out.println(value + " is not valid.");
				}
				else
				{
					size[value]++; // else the values will be held in array
				}
			}
		}
		
		System.out.println();
		System.out.println("Value \t count"); 
		
		// counts array
		for (int i = 0; i < size.length; i++)
		{
			if (size[i] > 0)
			{
				System.out.println(i + ": \t " + size[i]); // counts and output values
			}
		}
		
		System.out.println();
		System.out.println("Program Complete");
	}

}