/* 

My Nguyen
COP 2510 Section 001

File: StringMethods.java

Purpose: Demonstrate several methods of the String class

*/

import java.util.Scanner;

public class StringMethods
{

   public static void main(String[] args)
   {
      
      // Declare input variables
      int pos;
      String stringA;
      String stringB;
      String compositeString;
      String newCompositeString;
      
      // Allow user to enter phrases
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter first phase: ");
      stringA = scan.nextLine();
            
      System.out.print("Enter second phase: ");
      stringB = scan.nextLine(); 
          
      // Show formulas for string concatentation, String method replace, and String method indexOf
      compositeString = stringA.concat(" " + stringB);
      newCompositeString = compositeString.replaceAll("[aeiou]", "*");
      pos = newCompositeString.indexOf("*");
      
      // Print string A's and B's length, composite string and its length, new composite string with '*' replacement, and method indexOf
      System.out.println("StringA has " + stringA.length() + " characters");
      System.out.println("StringB has " + stringB.length() + " characters");
      System.out.println(compositeString);
      System.out.println("The composite string has " + compositeString.length() + " characters");
      System.out.println(newCompositeString);
      System.out.println("The first vowel is at position " + pos);
      
   }
}