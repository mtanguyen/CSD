/* 

My Nguyen
COP 2510 Section 001

File: Extremes.java

Purpose: Determine the minumum, maximum, and average of inputed values

*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Extremes
{
   
   public static void main(String[] args)
   {
   
      int sum = 0, count = 0;
      int value, min, max;
      double average;
      
      System.out.println("Enter up to ten integers.");
      System.out.println("To stop before ten, enter a zero.");
      
      // Interaction with user
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Next input: " );
      value = scan.nextInt();
      
      max = value;
      min = value;
                  
      if (value !=0)
      {
         count = 1;
      }
      
      else 
      {
         count = 0;
      }
      
      sum += value;

      
      while ((value != 0) && (count < 10)) // Sentinel value of 0 to terminate loop
      {
         
         System.out.print("Next input: " );
         value = scan.nextInt();
         
         if (value != 0) 
         {
            count++;
         }
         
         sum += value;
         
         // Evaluate maximum and minimum values         
         if (value > max)
         {
            max = value;         
         }
         
         else // (value < max)
         {
            
            if (max < min)
            {
               min = value; 
            }
                        
         }

      }
     
      if (count == 0) // If zero is entered, no inputs
      {
         System.out.println("Not inputs were entered.");
      }
      
      else // Output minimum, maximum, and average
      {
         average = (double) sum / count;
         
         System.out.println("The minimum value is " + min);  
         System.out.println("The maximum value is " + max);

         DecimalFormat fmt = new DecimalFormat("0.####");
         System.out.println("The average is " + fmt.format(average));
      } 
     
   }

}