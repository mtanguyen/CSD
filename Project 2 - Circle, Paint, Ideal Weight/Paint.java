/*
My Nguyen
COP 2510 Section 001

File: Paint.java

Purpose: Determine how much paint is needed to paint the walls of a room given its length, width, and height with additional number of doors and windows 

*/

import java.util.Scanner;

public class Paint
{
   
   public static void main(String[] args)
   {
       
      final int COVERAGE = 350;  // Paint covers 350 sq ft/gal
      int length;
      int width;
      int height; 
      int doors;
      int windows;
      double totalSqFt;
      double paintNeeded;
                 
	   // Declare and initialize Scanner object
      Scanner scan = new Scanner(System.in);
        
      System.out.print("Enter the length of your room in feet: ");
      length = scan.nextInt();

      System.out.print("Enter the width of your room in feet: ");
      width = scan.nextInt();
     
      System.out.print("Enter the height of your room in feet: ");
      height = scan.nextInt();

      System.out.print("Enter the number of door[s] in your room: ");
      doors = scan.nextInt();
            
      System.out.print("Enter the number of window[s] in your room: ");
      windows = scan.nextInt();
         
      // Compute the total square feet to be painted and amount of paint needed                  
      totalSqFt = ((2 * length * height) + (2 * width * height)) - ((doors * 20) + (windows * 15));
      paintNeeded = totalSqFt / COVERAGE; 

      // Print the length, width, and height of the room and the number of gallons of paint needed
      System.out.println("The length of the room is " + length + " feet.");
      System.out.println("The width of the room is " + width + " feet.");
      System.out.println("The height of the room is " + height + " feet.");
      System.out.println("The number of gallons of paint needed is " + paintNeeded + ".");
            
   }
}