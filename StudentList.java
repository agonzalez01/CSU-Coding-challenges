/**
   Name: Andres Diaz 
   Purpose: The purpose of this program is that the user can create a list of student names (strings) 
   and add to it, delete from it, and edit an element from it. 
   Assumptions: The user will not try to access an element that does not exist. Ex: Try to modify the third 
   element from the list when there is only two elements. **/
 

import javax.swing.JOptionPane ; //Import JOptionPane
import java.util.ArrayList ; //Import ArrayList

public class StudentList {  //Declare class

//Declare variables needed in the entire program 
static ArrayList<String> studentList = new ArrayList<String>(); //Create the list
static int i; //To iterate through the print loop
 
//Method to add a name to the list 
   public static ArrayList addName (String name) { 
      studentList.add(new String(name));  
      return (studentList); 
      } 
//Method to delete a name from the list   
   public static ArrayList deleteName (int position) { 
      studentList.remove(position); 
      return (studentList);
      }
//Method to edit a name from the list            
   public static ArrayList editName (String name, int position) { 
      studentList.set(position, new String (name)); 
      return (studentList); 
      }
//Method to print the array each time it is modified
   public static void printArray () { 
      for (i=0; i<studentList.size(); ++i) { 
         System.out.print(i + "-" + studentList.get(i) + ". ");}
         System.out.println (" The size of the list is " + studentList.size() + "."); 
      }        
      
//Main method to run the program       
      public static void main (String args[]) {
//Declare variables needed only in the main method      
         String choice = "bla";
         String name;
         int position=0;
         int arraySize=0;  
//Loop so the program keeps allowing the user to edit the list for as long as he/she wishes       
         while (!(choice.equals("QUIT"))) {
//Ask the user what they want to do with the list         
         choice=JOptionPane.showInputDialog ("Add a name (Add)-Delete a name (Del)-Edit a Name (Ed)-Quit(Quit)");
         choice=choice.toUpperCase();
//Switch statements for each of the options           
         switch (choice)
         {
//To add a name          
         case "ADD": 
            name = JOptionPane.showInputDialog ("What is the name you would like to add? "); 
            addName(name);
            printArray();
            arraySize=arraySize+1; 
         break;
         
//To delete a name         
         case "DEL":
            if (arraySize==0) //You can't delete a name if there is nothing to delete
               System.out.println ("There are no elements in the list to delete, first add an element."); 
            else {    
            name = JOptionPane.showInputDialog ("What is the postion of the name you would like to delete? ");
            position = Integer.parseInt(name);   
            deleteName(position);
            printArray();
            arraySize=arraySize-1;} 
         break; 
         
         case "ED":
            if (arraySize==0) //You can't edit a name if there is nothing to edit
               System.out.println ("There are no elements in the list to edit, first add an element."); 
            else {          
            name = JOptionPane.showInputDialog ("What is the postion of the name you would like to edit? ");
            position = Integer.parseInt(name);
            name = JOptionPane.showInputDialog ("What do you want the new name to be? ");
            editName(name, position); 
            printArray(); } 
         break;  
             
                                                
         }
      }
   }
} 