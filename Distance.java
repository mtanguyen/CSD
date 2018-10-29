/* 

My Nguyen
COP 2510 Section 001

File: Distance.java

Purpose: Compute the distance between two points 

*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance 
{

   public static void main(String[] args)
   {
   
      double X1, X2, Y1, Y2;
      double x_distance_squared, y_distance_squared, distance_squared, distance;
      
      // Allow interaction with user
      Scanner scan = new Scanner(System.in);
      
      System.out.println("This program computes the distance between two points."); 
      System.out.println("Enter the x and y coordinates of each point when prompted.");
      
      System.out.print("X1: ");
      X1 = scan.nextDouble();
      
      System.out.print("Y1: ");
      Y1 = scan.nextDouble();
      
      System.out.print("X2: ");
      X2 = scan.nextDouble();
      
      System.out.print("Y2: ");
      Y2 = scan.nextDouble();
      
      // Formulas for x distance squared, y distance squared, distance squared, and square root of distance squared
      x_distance_squared = Math.pow(X1 - X2,2);
      y_distance_squared = Math.pow(Y1 - Y2,2);
      distance_squared = Math.pow(X1 - X2,2) + Math.pow(Y1 - Y2,2);
      distance = Math.sqrt(distance_squared);
      
      // Round the ouput to three decimal places
      DecimalFormat fmt = new DecimalFormat("0.###");
    
      System.out.println("Computing the distance between (" + X1 + "," + Y1 + ") and (" + X2 + "," + Y2 + ")");
      System.out.println("The distance is " + fmt.format(distance));
         
   }
}
