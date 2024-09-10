// Udeshwar Singh Sandhu
// ICS4UE
// August 1, 2024
// Purpose of the program: This program will find out the amount of change you will get depending on the amount of money you have.

import java.util.Scanner; // Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling


public class U1A2_UdeshwarSandhu_MainFile { // Main Class
    public static void main(String[] args) { // Main Method
        Scanner in = new Scanner(System.in); // Creates a new Scanner object for user input
      

        boolean boolExit = false; // Boolean variable to control the loop
        boolean boolChoice = true; // Boolean variable to control the loop
        while (!boolExit) { // Loop to keep the program running until the user chooses to exit
          System.out.println("Change Exchange"); // Prints the title of the program

          double dblAmount = 0; // Variable to store the amount of money to be entered
          boolean boolValid = false; // Boolean variable to track valid input
          while (!boolValid) { // Loop to ensure valid input
            System.out.print("Enter the amount in dollars and cents (e.g., xxxx.xx): "); // Prompts the user to enter the amount in dollars and cents
            try{ // Try block to handle invalid input
              dblAmount = in.nextDouble(); // Reads the user's input and stores it in the variable 'dblAmount'
              boolValid = true; // Input is valid, exits loop
            }// End of try block
            catch(InputMismatchException i) { // Catch block to handle invalid input
              System.out.println("Invalid input. Please enter a valid number."); // Prints error message for invalid input
              in.next(); // Takes the invalid input and discards it
            } // End of catch block
          }
            
          int intTotalCents = (int) (dblAmount * 100); // Converts the amount to cents and stores it in the variable 'intTotalCents'
          int intToonies = intTotalCents / 200; // Calculates the number of toonies and stores it in the variable 'inttoonies'
          intTotalCents %= 200; // Updates the value of 'intTotalCents' by removing the toonies from it
          int intLoonies = intTotalCents / 100; // Calculates the number of loonies and stores it in the variable 'intLoonies'
          intTotalCents %= 100; // Updates the value of 'intTotalCents' by removing the loonies from it
          int intQuarters = intTotalCents / 25; // Calculates the number of quarters and stores it in the variable 'intQuarters'
          intTotalCents %= 25; // Updates the value of 'intTotalCents' by removing the quarters from it
          int intDimes = intTotalCents / 10; // Calculates the number of dimes and stores it in the variable 'intDimes'
          intTotalCents %= 10;  // Updates the value of 'intTotalCents' by removing the dimes from it
          int intNickels = intTotalCents / 5; // Calculates the number of nickels and stores it in the variable 'intNickels'
          int intPennies = intTotalCents % 5; // Calculates the number of pennies and stores it in the variable 'intPennies'

          System.out.println("Amount: $" + dblAmount); // Prints the amount entered by the user
          System.out.println("Toonies: " + intToonies); // Prints the number of toonies
          System.out.println("Loonies: " + intLoonies); // Prints the number of loonies
          System.out.println("Quarters: " + intQuarters); // Prints the number of quarters
          System.out.println("Dimes: " + intDimes); // Prints the number of dimes
          System.out.println("Nickels: " + intNickels); // Prints the number of nickels
          System.out.println("Pennies: " + intPennies); // Prints the number of pennies
          
          boolChoice = true; // Sets the boolean variable to start the choice loop  
          while(boolChoice){ // Loop to keep the program running until the user chooses to exit
            System.out.println("Do you want to calculate again? (yes/no)"); // Prompts the user to calculate again or exit
            String strChoice = in.next(); // Reads the user's input and stores it in the variable 'strChoice'
            if (strChoice.equalsIgnoreCase("no")) { // Checks if the user wants to exit
                boolExit = true; // Sets the boolean variable to true to exit the loop
                boolChoice = false; // Sets the boolean variable to true to exit the choice loop
            } // End of if statement
            else if (strChoice.equalsIgnoreCase("yes")) { // Checks if the user wants to exit
                boolExit = false; // Sets the boolean variable to false to stay in the loop
                boolChoice = false; // Sets the boolean variable to true to exit the choice loop
            } // End of if statement
            else{ // If the user enters an invalid input
              System.out.println("Invalid input. Please enter 'yes' or 'no'."); // Prints an error message if the user enters an invalid input
              boolChoice = true; // Sets the boolean variable to false to stay in the loop
            } // End of else statement
          } // End of while to choose if user wants to exit loop
       } // End of while loop

        in.close(); // Closes the Scanner object
    } // Closes main method
} // Closes main class