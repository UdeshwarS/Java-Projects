// Udeshwar Singh Sandhu
// ICS4UE
// August 5, 2024
// Purpose of the program: To let the user input two numbers and find the GCF, exponent of the first number to the power of the second number, and the difference of the first number and the second number.

import java.util.Scanner; // Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling

public class Main { // Main class
  /*
  mthdGCF
  intNum1, intNum2, intBig, intNum, intI
  This method takes the two numbers inputted by the user and finds the GCF of the two numbers. By going through a loop, it finds out when the number is fully divisible by both the first number and the second number. The GCF is then returned.
  */
  public static int mthdGCF (int intNum1, int intNum2) { // Greatest Common Factor method

    int intBig = Math.max(intNum1, intNum2); // Finds the bigger number
    int intNum=0; // Declares intNum variable
    for (int intI=1; intI<intBig;intI++) { // For loop to go through each number from 1-the bigger number
      if (((intNum1%intI)==0)&&((intNum2%intI)==0)) { // If statement to check if the number is a factor of both numbers
        intNum = intI; //Stores the value of the GCF in intNum
      } // End of if statement
    }// End of for loop
    
    return intNum; // Returns the value of intNum
  } // End of mthdGCF method
  
  /*
  mthdCalcExp
  intNum1, intNum2
  This method takes the two numbers inputted by the user and finds the exponent of the first number to the power of the second number. It does this by using the Math.pow method. The exponent is then printed.
  */
  public static void mthdCalcExp  (int intNum1, int intNum2) { // Calculates the exponent of the two numbers
    System.out.println("The Exponent is: "+ (Math.pow(intNum1, intNum2))); // calculates and prints the exponent
  } // End of mthdCalcExp method

  /*
  mthdCalcDifference
  intNum1, intNum2
  This method takes the two numbers inputted by the user and finds the difference of the first number and the second number. It does this by finding the bigger number and subtracting the smaller number from it. The difference is then printed.
  */
  public static void mthdCalcDifference (int intNum1, int intNum2) { // Calculates the difference of the two numbers
    System.out.println("The difference of the two numbers is: "+ (Math.max(intNum1, intNum2)-Math.min(intNum1, intNum2))); // Calculates and prints the difference
  } // End of mthdCalcDifference method

  /*
  main
  in, intNum1, intNum2, boolRestart, boolContinue, boolValid, boolValid2, boolSelect, strOption, intSum, boolExit
  This is the main method, it asks the user for the two numbers that they want to use, making sure they are valid numbers. Then, it allows the user to select which option of the calculator they want to use. The options are to find the GCF, calculate the exponent, calculate the difference, and exit. The method also makes sure this input is valid. Then finally, it asks if the user wants to restart the program. If they do, it restarts the program. If not, it ends the program. Again, making sure this input is valid.
  */
  public static void main(String[] args) { // Main method

    Scanner in = new Scanner(System.in); // Creates a new scanner object

    int intNum1 = 0;// Declares intNum1 variable
    int intNum2 = 0; // Declares intNum2 variable

    boolean boolRestart = false; // Declares boolRestart variable and sets it to false
    while (!boolRestart){ // While loop if the user wants to use the calculator again
      
      boolean boolContinue = false; // Declares boolContinue variable and sets it to false
      while(!boolContinue){ // While loop if the user has the wrong input for the numbers
    
        boolean boolValid = false; // Boolean variable to track valid input
        while (!boolValid) { // Loop to ensure valid input
          System.out.println("Please enter the first number: "); // Prompts user to enter the first number
          try{ // Try block to handle invalid input
            intNum1 = in.nextInt(); // Stores the user input in intNum1
            boolValid = true; // Input is valid, exits loop
          }// End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number."); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of inner while loop

        boolean boolValid2 = false; // Boolean variable to track valid input
        while (!boolValid2) { // Loop to ensure valid input
          System.out.println("Please enter the second number: "); // Prompts user to enter the second number
          try{ // Try block to handle invalid input
            intNum2 = in.nextInt(); // Stores the user input in intNum2
            boolValid2 = true; // Input is valid, exits loop
          }// End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number."); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of inner while loop

        if ((intNum1 > 0)&&(intNum2>0)){ // If statement to check if the numbers are positive
          boolContinue = true; // Input is valid, exits loop
        } // End of if statement
        else{ // Else statement if the numbers are not positive
          System.out.println("Please enter positive numbers"); // Prints error message for invalid input
        } // End of else statement
      
      } // End of inner while loop

      Boolean boolSelect = false; // Declares boolSelect variable and sets it to false
      while (!boolSelect){ // While loop if the user has the wrong input for the selection
    
        System.out.println("Please select one of the options: \n1 - Calculate the difference \n2 - Calculate the Exponent \n3 - Find the Greatest Common Factor \n4 - Exit"); // Prompts user to select one of the options
        String strOption = in.next();  // Stores the user input in strOption
        if (strOption.equalsIgnoreCase("1")) { // If statement to check if the user selected option 1
          mthdCalcDifference (intNum1, intNum2); // Calls the mthdCalcDifference method
          boolSelect = true; // Input is valid, exits loop
        } // End of if statement
        else if (strOption.equalsIgnoreCase("2")) { // If statement to check if the user selected option 2
          mthdCalcExp (intNum1, intNum2); // Calls the mthdCalcExp method
          boolSelect = true; // Input is valid, exits loop
        } // End of else if statement
        else if (strOption.equalsIgnoreCase("3")) { // If statement to check if the user selected option 3
          int intSum = mthdGCF (intNum1, intNum2); // Calls the mthdGCF method and stores the return value in intSum
          System.out.println("The GCF of the two numbers is: "+intSum); // Prints the GCF
          boolSelect = true; // Input is valid, exits loop
        } // End of else if statement
        else if (strOption.equalsIgnoreCase("4")) { // If statement to check if the user selected option 4
          System.out.println("Exiting"); // Prints exit message
          boolSelect = true; // Input is valid, exits loop
        } // End of else if statement
        else { // Else statement if the user selected an invalid option
          System.out.println("Invalid option, please try again"); // Prints error message for invalid input
        } // End of else statement  

      } // End of inner while loop

      Boolean boolExit = false; // Declares boolExit variable and sets it to false
      while (!boolExit){ // While loop if the user has the wrong input for the exit
        System.out.println("Would you like to use the calculator for another set of numbers? (Y/N)"); // Prompts user to select one of the options
        String strContinue = in.next(); // Stores the user input in strContinue

        if (strContinue.equalsIgnoreCase("Y")){ // If statement to check if the user selected option Y
          boolRestart = false; // User does not want to use the calculator again, exits loop
          boolExit = true; // Input is valid, exits loop
        } // End of if statement
        else if (strContinue.equalsIgnoreCase("N")){ // If statement to check if the user selected option N
          boolRestart = true; // User wants to use the calculator again, stays in the loop
          boolExit = true; // Input is valid, exits loop
          System.out.println("Exiting"); // Prints exit message
        } // End of else if statement
        else{ // Else statement if the user selected an invalid option
          System.out.println("Please select a valid option"); // Prints error message for invalid input
          boolExit = false; // Input is invalid, stays in loop
        } // End of else statement
      } // End of inner while loop
    } // End of outer while loop
    in.close(); // Closes the Scanner object
  }// End of main method
} // End of Main class