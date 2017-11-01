/**
   Name: Andres Diaz
   Purpose: Write a program that counts up to 0 and displays the count. The program will ask for and accept
   an integer value from the user. Then, using while loops, it will count to 0 (up, if the int value is 
   negative, and down if the int value is positive.)  
   Assumptions:The user can input positive and negative integers. 
               The user's integer can be stored in an int variable.  
*/ 

import java.util.Scanner; //Import scanner class

public class countdown //Declare class
{ 
   public static void main (String[]args) //Declare main
   { 
//Declare variables
   int userInt=0; 
   int i=0;
   Scanner keyboard = new Scanner (System.in); //Create a scanner object 
   
   System.out.println ("Enter a number (positive or negative) "); //Ask the user for a number
   userInt = keyboard.nextInt(); //Store the user's number in a variable 

//Branch the program, count up if the value is less than 0, or count down if the value is greater than 0      
   if (userInt<0) {
//While loop for userInt<0   
      while (i>=userInt) {
         System.out.print (userInt + " ");
         userInt+=1;}
         }
//While loop for userInt>0         
   else if (userInt>0) {
      while (i<=userInt) {
         System.out.print (userInt + " ");
         userInt-=1;}
         }
//In case userInt=0          
   else 
      System.out.print ("Well, that's an easy countdown: 0");
      
          
   }
}      
   