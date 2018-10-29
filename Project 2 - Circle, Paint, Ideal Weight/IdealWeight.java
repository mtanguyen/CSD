/* 
My Nguyen
COP 2510 Section 001 

File: IdealWeight.java

Purpose: Determine the ideal weight for males and females over 5 feet tall

*/

import java.util.Scanner;

public class IdealWeight
{

   public static void main(String[] args)
   {
      
      int feet; 
      int inches;
          
      // Provide interaction with user
      Scanner scan = new Scanner(System.in);
            
      System.out.print("Enter your height in feet: ");
      feet = scan.nextInt();
            
      System.out.print("Enter your height in inches: ");
      inches = scan.nextInt();
           
      // Crucial information for the weight formulas
      int height = feet * 12 + inches;
      final int baseHeight = 60; // Person has to be over 5 feet which is 60 inches
      final int MALE_CONVERSION_FACTOR = 6;
      final int FEMALE_CONVERSION_FACTOR = 5;
      final int maleBaseWeight = 106;
      final int femaleBaseWeight = 100;
                                    
      // Ideal male and female weight formulas
      int maleWeight = (height - baseHeight) * MALE_CONVERSION_FACTOR + maleBaseWeight;
      int femaleWeight = (height - baseHeight) * FEMALE_CONVERSION_FACTOR + femaleBaseWeight;
      
      // Print male and female ideal weights                 
      System.out.println("Male ideal weight: " + maleWeight);
      System.out.println("Female ideal weight: " + femaleWeight);
      
   }
}

