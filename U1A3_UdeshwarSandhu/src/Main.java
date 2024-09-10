// Udeshwar Singh Sandhu
// ICS4UE
// August 2, 2024
// Purpose of the program: To find out if the user is eligible to ride the roller coaster

import java.util.InputMismatchException; // Imports scanner class for user input
import java.util.Scanner; // Imports InputMismatchException class for error handling


public class Main { //Main Class
  public static void main(String[] args) { //Main Method
    
    Scanner in = new Scanner(System.in); // Creates a new Scanner object for user input
    int intRiderHeight = 0; // Declares an integer variable to store the rider's height
    String strBackTrouble = ""; // Declares a string variable to store the user's response to whether or not thy have back trouble
    String strHeartTrouble = ""; // Declares a string variable to store the user's response to whether or not thy have heart trouble
    boolean boolAllowed = false; // Declares a boolean variable to store whether or not the rider is allowed to ride the roller coaster
    int intBackTrouble = 0; // Declares an integer variable to store the user's response to whether or not thy have back trouble
    int intHeartTrouble = 0; // Declares an integer variable to store the user's response to whether or not thy have heart trouble

    System.out.println("Roller Coaster Ride"); // Prints the title of the program
    System.out.println("=====================\n"); // Prints a line of dashes to separate the title from the rest of the program
    
    while(!boolAllowed){ // While loop that runs until the rider is allowed to ride the roller coaster

      
      boolean boolValid = false; // Boolean variable to track valid input
      while (!boolValid) { // Loop to ensure valid input
        System.out.println("Enter your height in cm: "); // Prompts the user to enter their height
        try{ // Try block to handle invalid input
          intRiderHeight = in.nextInt();  // Reads the user's input and stores it in the intRiderHeight variable
          boolValid = true; // Input is valid, exits loop
        }// End of try block
        catch(InputMismatchException i) { // Catch block to handle invalid input
          System.out.println("Invalid input. Please enter a valid number."); // Prints error message for invalid input
          in.next(); // Takes the invalid input and discards it
        } // End of catch block
      } // End of inner while loop


      boolean boolTroubles = false; // Boolean variable to track valid input
      while (!boolTroubles){ // Loop to ensure valid input
        System.out.println("Do you have Back Trouble? Y/N"); // Prompts the user to enter whether or not they have back trouble
        strBackTrouble = in.next(); // Reads the user's input and stores it in the strBackTrouble variable
        System.out.println("Do you have Heart Trouble? Y/N"); // Prompts the user to enter whether or not they have heart trouble
        strHeartTrouble = in.next(); // Reads the user's input and stores it in the strHeartTrouble variable
        if ((strBackTrouble.equalsIgnoreCase("y"))||(strBackTrouble.equalsIgnoreCase("n"))){ // Checks if the user's input is valid
          intBackTrouble = 2; // Sets the intBackTrouble variable to 2 if the user's input is valid
        } // End of if statement
        else{ // If the user's input is not valid
          intBackTrouble = 10; // Sets the intBackTrouble variable to 10 if the user's input is not valid
        } // End of else statement
        if ((strHeartTrouble.equalsIgnoreCase("n"))||(strHeartTrouble.equalsIgnoreCase("y"))){ // Checks if the user's input is valid
          intHeartTrouble = 2; // Sets the intHeartTrouble variable to 2 if the user's input is valid
        } // End of if statement
        else{ 
          // If the user's input is not valid
          intHeartTrouble = 10; // Sets the intHeartTrouble variable to 10 if the user's input is not valid
        } // End of else statement

        //This process is done so that the values do not get overwritten if the user enters one invalid and one valid input
        int intTotal = intBackTrouble + intHeartTrouble; // Adds the values of intBackTrouble and intHeartTrouble and stores the result in intTotal
        
        if (intTotal<5){ // Checks if the sum of intBackTrouble and intHeartTrouble is less than 5
          boolTroubles = true; // Input is valid, exits loop
        } // End of if statement
        else{ // If the sum of intBackTrouble and intHeartTrouble is not less than 5
          System.out.println("Invalid input. Please enter valid information."); // Prints an error message for invalid input
        } // End of else statement
        
      } // End of inner while loop

      
      if ((strBackTrouble.equalsIgnoreCase("n"))&&(strHeartTrouble.equalsIgnoreCase("n"))&&(intRiderHeight>122)&&(intRiderHeight<188)){ // If statement to check if the rider is allowed to ride the roller coaster
        System.out.println("Message: Yes, it is safe for you to ride this roller coaster."); // Prints a message indicating that the rider is allowed to ride the roller coaster
      } // End of if statement
      else if ((strBackTrouble.equalsIgnoreCase("y"))||(strHeartTrouble.equalsIgnoreCase("y"))||(intRiderHeight<122)||(intRiderHeight>188)){// If statement to check if the rider is not allowed to ride the roller coaster
        System.out.println("Message: NO, it is not safe for you to ride this roller coaster."); // Prints a message indicating that the rider is not allowed to ride the roller coaster
      } // End of else if statement

      
      boolean boolNext = false; // Boolean variable to ask for next rider
      while(!boolNext){ // While loop to ask for next rider
        System.out.println("Would you like to enter info for the next rider? Y/N "); // Prompts the user to enter whether or not they want to enter info for the next rider
        String strNextRider = in.next(); // Reads the user's input and stores it in the strNextRider variable

        
        
        if (strNextRider.equalsIgnoreCase("y")){ // If statement to check if the user wants to enter info for the next rider
          boolAllowed = false; // Resets the boolean variable to false to restart the main loop
          boolNext = true; // Exits this loop
        } // End of if statement
        else if (strNextRider.equalsIgnoreCase("n")){ // If statement to check if the user does not want to enter info for the next rider
          boolAllowed = true; // Exits the main loop
          boolNext = true; // Exits this loop
         } // End of else if statement
        else{ // Else statement to handle invalid input
          System.out.println("Please enter a valid input"); // Prints an error message for invalid input
          boolNext = false; // Resets the boolean variable to false to restart the loop
        } // End of else statement
      } // End of inner while loop
      
    } // End of outer while loop

    System.out.println("Goodbye!"); // Prints a goodbye message when the main loop is exited
    in.close(); // Closes the Scanner object
  } // End of main method
} // End of main class