/* 

My Nguyen
COP 2510 Section 001

File: LeapYears.java

Purpose: Determine if a year is a leap year or not

*/

import java.util.Scanner;

public class LeapYears 
{

   public static void main(String[] args)
   {
   
      final int YEAR = 1582; // year Gregorian calendar adopted
      int year1; 
      
      Scanner scan = new Scanner(System.in);
      
      // Interaction with user
      System.out.print("Enter a year greater than 1581: ");
      year1 = scan.nextInt(); 
      
      System.out.println("Year is " + year1);
      
      // Year entered is greater than year 1851
      if (year1 >= YEAR)
      {
         
         // Year entered is divisible by 4
         if (year1 % 4 == 0)    
         {
            
            // Year entered is divisible by 100            
            if (year1 % 100 == 0)
            {
               
               // Year entered is divisble by 400, hence leap year               
               if (year1 % 400 == 0) 
               {
                  System.out.println(year1 + " is a leap year.");
               }
               
               else
               {
                  System.out.println(year1 + " is not a leap year.");
               }

            }
            
            // Year entered divisible by 100 is a leap year
            else 
            {
               System.out.println(year1 + " is a leap year.");
            }
            
         }
         
         // Year entered not divisible by 4 is not a leap year
         else
         {
            System.out.println(year1 + " is not a leap year.");
         }
         
      }
      
      // Year entered must be greater than year 1851
      else 
      {
         System.out.println("Year must be greather than 1581.");
      }
      
   }

}
