/*
Udeshwar Singh Sandhu
ICS4UE
August 15, 2024
Purpose of the program: To get user's input and give them the fibonacci number according to the input
*/


import java.util.Scanner;// Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling


public class Main {// Start of the Main class

/*
  mthdModifiedFibonacci
  intNum
  This method will take in the input of the user and give them the fibonacci number according to the input
  */
  public static int mthdModifiedFibonacci(int intNum){ // Start of the mthdFibonacci method with intNum as a parameter
    
    if (intNum == 0){ // If intNum is equal to 0
      return 3; // Return 3
    } // End of if statement
    else if (intNum ==1){ // Else if intNum is equal to 1
      return 5; // Return 5
    } // End of else if statement
    else if (intNum == 2){ // Else if intNum is equal to 2
      return 8; // Return 8
    } // End of else if statement
    return (mthdModifiedFibonacci(intNum-1)+ mthdModifiedFibonacci(intNum-2)+ mthdModifiedFibonacci(intNum-3)); // Returns the sum of the previous three numbers
  } // End of mthdFibonacci method


  
  public static void main(String[] args) { // Start of the main method
    Scanner in = new Scanner(System.in); // Creates a scanner object

    int intNumber = 0; // Declares and initializes intNumber to 0

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Enter the term number which you would like to know: "); // Asks user for input of the term number they would like to know
      try{ //Try block to handle invalid input
        intNumber = in.nextInt();  // Takes the user input and stores it in intNumber
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop

    System.out.println("Term # " + intNumber + " is "+ mthdModifiedFibonacci(intNumber)); // Prints the fibonacci number according to the input
    
  
  }
}