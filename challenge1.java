// Import scanner class
import java.util.Scanner;
public class challenge1
{
   public static void main (String[]args)
   { 
// Declare variables for the amount of numbers and the array
      int array_size, sum=0;
      int[]numbers;
      double mean;
// Create scanner object (keyboard)      
      Scanner keyboard=new Scanner (System.in);
// Ask for the amount of numbers      
      System.out.println ("How many numbers do you have? ");
      array_size=keyboard.nextInt();
// Create array to hold numbers
      numbers= new int[array_size];
// Ask for every number              
      for (int index=0; index < numbers.length; index++) 
      {
         System.out.println ("What is the number" + (index+1) +"?"); 
         numbers[index]=keyboard.nextInt();
      }
// Calculate sum of the array      
      for (int i=0; i<numbers.length; i++)
      {
         sum=sum+numbers[i];
      }
// Calculate mean      
      mean= sum/numbers.length;
      System.out.println("the mean is "+mean);   
   }       
}      
