/* 
My Nguyen
COP 2510 Section 001

File: Circle.java

Purpose: Determine the area and circumference of a circle with two different radii
         Determine the area and circumference growth factor
         
*/

public class Circle
{

   public static void main(String[] args)
   {
   
      final double PI = 3.14159;
      int radiusOne = 10;
      int radiusTwo = 20;
      double areaOne; 
      double areaTwo;
      double circumferenceOne;
      double circumferenceTwo;
   
      // Show area and circumference formulas
      areaOne = PI * radiusOne * radiusOne;
      areaTwo = PI * radiusTwo * radiusTwo;
      circumferenceOne = 2 * PI * radiusOne;
      circumferenceTwo = 2 * PI * radiusTwo;

      // Print radius and circumference of a circle with two different radii
      System.out.println("The area of a circle with radius of " + radiusOne + " is " + areaOne + ".");
      System.out.println("The circumference of a circle with radius of " + radiusOne + " is " + circumferenceOne + ".");
      System.out.println("The area of a circle with radius of " + radiusTwo + " is " + areaTwo + ".");
      System.out.println("The circumference of a circle with radius of " + radiusTwo + " is " + circumferenceTwo + ".");
         
      // Print area and circumference growth factor
      System.out.println("When the radius doubles, the area growth increases by a factor of " + areaTwo / areaOne + ".");    
      System.out.println("When the radius doubles, the circumference growth increases by a factor of " + circumferenceTwo / circumferenceOne + "."); 

   }
}