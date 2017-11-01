/**
   Name: Andres Diaz
   Purpose: Create a program that simulates distributing lottery tickets
   Assumption: The user can play more than one time. 
   The user can choose between 4 different games and issue their own sequence
   or get a random one.
   The user knows that there are 4 different games 
   The user won't make an error when choosing a sequence
*/
import java.util.Scanner; //Import scanner class
import java.util.Random;  //Import random class

public class Lottery //Declare class

{
   public static void main (String[]args) //Declare main
   
   {
//Declaring variables    
   int pick3=0;
   int pick4=0;
   int[] powerball = new int[6];
   int[] megamillion = new int[6];
   int game=0;
   int i=0;
   int timesPlayed=0;
   boolean p3=false;
   boolean p4=false;
   boolean pb=false;
   boolean mm=false;

   Scanner keyboard = new Scanner (System.in); //Create a scanner object
      
   Random rand = new Random();// Create a random object
   
//First, I ask the user how many times they want to play
   System.out.println ("How many times would you like to play? (You can only play each game once)"); 
   timesPlayed = keyboard.nextInt();
   
//Create the for loop for the amount of times they want to play   
   for (i=1; i<=timesPlayed; ++i) {
      System.out.println ("Press 1 for pick3, press 2 for pick4, press 3 for powerball, press 4 for megamillion");
      game = keyboard.nextInt();

//Create switch statatement for each of the 4 games     
      switch (game) {
//Case1=pick3
      case 1: 
      
         p3=true;//Make p3 true so it prints after the loop
         int sequence1; 
//Ask the user if they want to choose a sequence or a random one         
         System.out.println ("You chose pick3, press 1 to choose your own sequence, press 2 for a random sequence");
         sequence1 = keyboard.nextInt();
//If-else if statement for chosen or random sequence       
         if (sequence1==1) {
            System.out.println ("Choose any 3 digit sequence (000 to 999)");
            pick3 = keyboard.nextInt();}
         else if (sequence1==2) { 
         
            pick3 = rand.nextInt(1000); 
            System.out.println ("Your sequence is "+ pick3);} 
         else 
            System.out.println ("Not one of the options, try again");
         
      break;
//Case2=pick4       
      case 2: 
      
         p4=true;
         int sequence2;//Make p4 true so it prints after the loop 
//Ask the user if they want to choose a sequence or a random one         
         System.out.println ("You chose pick4, press 1 to choose your own sequence, press 2 for a random sequence");
         sequence2 = keyboard.nextInt();
//If-else if statement for chosen or random sequence     
         if (sequence2==1) {
            System.out.println ("Choose any 4 digit sequence (0000 to 9999)");
            pick4 = keyboard.nextInt();}
         else if (sequence2==2) { 
         
            pick4 = rand.nextInt(10000); 
            System.out.println ("Your sequence is "+ pick4);} 
         else 
            System.out.println ("Not one of the options, try again");
         
      break;
//Case3=powerball              
      case 3: 
      
         pb=true;//Make pb true so it prints after the loop
         int sequence3;
//Ask the user if they want to choose a sequence or a random one          
         System.out.println ("You chose powerball, press 1 to choose your own sequence, press 2 for a random sequence");
         sequence3 = keyboard.nextInt();
//If-else if statement for chosen or random sequence      
         if (sequence3==1) {
            System.out.println ("Choose your first number, from 1 to 69");
            powerball[0] = keyboard.nextInt();
            System.out.println ("Choose your second number, from 1 to 69");
            powerball[1] = keyboard.nextInt();
            System.out.println ("Choose your third number, from 1 to 69");
            powerball[2] = keyboard.nextInt();
            System.out.println ("Choose your fourth number, from 1 to 69");
            powerball[3] = keyboard.nextInt();
            System.out.println ("Choose your fifth number, from 1 to 69");
            powerball[4] = keyboard.nextInt();  
            System.out.println ("Choose your powerball number, from 1 to 69");
            powerball[5] = keyboard.nextInt();}
         else if (sequence3==2) { 
         
            powerball[0] = rand.nextInt(69)+1;
            powerball[1] = rand.nextInt(69)+1;
            powerball[2] = rand.nextInt(69)+1;
            powerball[3] = rand.nextInt(69)+1;
            powerball[4] = rand.nextInt(69)+1;
            powerball[5] = rand.nextInt(26)+1;
            System.out.println ("Your sequence is "+ powerball[0]+" "+powerball[1]+" "+powerball[2]
                                +" "+powerball[3]+" "+powerball[4]+" "+powerball[5]);} 
         else 
            System.out.println ("Not one of the options, try again");
         
      break;
//Case4: megamillion      
      case 4: 
      
         mm=true;//Make mm true so it prints after the loop
         int sequence4; 
//Ask the user if they want to choose a sequence or a random one         
         System.out.println ("You chose megamillion, press 1 to choose your own sequence, press 2 for a random sequence");
         sequence4 = keyboard.nextInt();
//If-else if statement for chosen or random sequence      
         if (sequence4==1) {
            System.out.println ("Choose your first number, from 1 to 75");
            megamillion[0] = keyboard.nextInt();
            System.out.println ("Choose your second number, from 1 to 75");
            megamillion[1] = keyboard.nextInt();
            System.out.println ("Choose your third number, from 1 to 75");
            megamillion[2] = keyboard.nextInt();
            System.out.println ("Choose your fourth number, from 1 to 75");
            megamillion[3] = keyboard.nextInt();
            System.out.println ("Choose your fifth number, from 1 to 75");
            megamillion[4] = keyboard.nextInt();  
            System.out.println ("Choose your mega ball number, from 1 to 15");
            megamillion[5] = keyboard.nextInt();}
         else if (sequence4==2) { 
         
            megamillion[0] = rand.nextInt(75)+1;
            megamillion[1] = rand.nextInt(75)+1;
            megamillion[2] = rand.nextInt(75)+1;
            megamillion[3] = rand.nextInt(75)+1;
            megamillion[4] = rand.nextInt(75)+1;
            megamillion[5] = rand.nextInt(15)+1;
            System.out.println ("Your sequence is "+ megamillion[0]+" "+megamillion[1]+" "+megamillion[2]
                                +" "+megamillion[3]+" "+megamillion[4]+" "+megamillion[5]);} 
         else 
            System.out.println ("Not one of the options, try again");
         
      break;
      default: 
         System.out.println ("Not one of the options, try again");
      
      break;
                      
         } 
      }
   
   if (p3) 
      System.out.printf ("pick3= %03d\n",pick3);
   
   if (p4)
      System.out.printf ("pick4= %04d\n", pick4);
      
   if (pb)
      System.out.println ("powerball= " + powerball[0]+" "+powerball[1]+" "+powerball[2]
                                +" "+powerball[3]+" "+powerball[4]+" "+powerball[5]);
   
   if (mm) 
      System.out.println ("megamillion= " + megamillion[0]+" "+megamillion[1]+" "+megamillion[2]
                                +" "+megamillion[3]+" "+megamillion[4]+" "+megamillion[5]);     
      
         

   }
}   