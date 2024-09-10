// Udeshwar Singh Sandhu
// ICS4UE
// August 6, 2024
// Purpose of the program: 

import java.util.Scanner; // Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling
public class Main { // Main class
  
  /*
  mthdRemove
  arrNums [], intRemove, intIndex, intI, boolValid
  This method takes in the array of numbers and the number to be removed. Then, it finds which index the number to be removed is at and removes it. If the number is not in the array, boolValid becomes false so that this method can be called again.
  */
  public static boolean mthdRemove (int[] arrNums, int intRemove) { // Method to remove a number from the array
    int intIndex = 0; // Declares and initializes intIndex to 0
    boolean boolValid = false; // Value that will determine if the number to be removed is valid
    for (int intI = 0; intI < arrNums.length; intI++){ // For loop to iterate through the array
      if (arrNums[intI]!=intRemove){ // Else if statement to check if the current element is not equal to the number to be removed
        boolValid = false; // Sets boolValid to false because the number to be removed is not valid
      } // End of if statement
      if (arrNums[intI]==intRemove){ // If statement to check if the current element is equal to the number to be removed
        arrNums[intI] = 0; // Sets the current element to 0
        boolValid = true; // Sets boolValid to true because the number to be removed is valid
        break; // Stops the loop once the number is found
      } // End of if statement
    } // End of for loop
    if (boolValid == false){ // If statement to check if the number to be removed is valid
      System.out.println("This number is not in the array, please choose a valid number."); // Prints out a message to the user to choose a valid number
    }
    return boolValid;
  } // End of method

  /*
  mthdSumAll
  arrNums [], intSum, intI
  This method takes in the array of numbers. Then, it prints all of the numbers in the array while adding them to an intSum variable. Then, the sum is printed. Nothing is returned since everything is printed in the same method.
  */
  
  public static void mthdSumAll (int[] arrNums){ // Method to sum all the numbers in the array
    int intSum = 0; // Declares and initializes intSum to 0
    System.out.println("All of the numbers in this array are:"); // Prints a message
    for (int intI = 0; intI < arrNums.length; intI++){ // For loop to iterate through the array
      System.out.println((intI+1)+". "+arrNums[intI]); // Prints the current element
      intSum += arrNums[intI]; // Adds the current element to the sum
    } // End of for loop
    System.out.println("The sum of all the numbers is " + intSum); // Prints the sum
  } // End of method

  /*
  mthdSumEven
  arrNums [], intSum, intI
  This method takes in the array of numbers. Then, it prints all of the even numbers in the array while adding them to an intSum variable. Then, the sum of the even numbers is printed. Nothing is returned since everything is printed in the same method.
  */
  
  public static void mthdSumEven (int[] arrNums){ // Method to sum all the even numbers in the array
    int intSum = 0; // Declares and initializes intSum to 0
    System.out.println("All of the even numbers in this array are: "); // Prints a message
    for (int intI = 0; intI < arrNums.length; intI++){ // For loop to iterate through the array
      if (arrNums[intI]%2 == 0){ // If statement to check if the current element is even
        System.out.println((intI+1)+". "+arrNums[intI]); // Prints the current element
        intSum += arrNums[intI]; // Adds the current element to the sum
      } // End of if statement
    } // End of for loop
    System.out.println("The sum of all the even numbers is " + intSum); // Prints the sum
  } // End of method

  /*
  mthdSumOdd
  arrNums [], intSum, intI
  This method takes in the array of numbers. Then, it prints all of the odd numbers in the array while adding them to an intSum variable. Then, the sum of the odd numbers is printed. Nothing is returned since everything is printed in the same method.
  */
  public static void mthdSumOdd (int[] arrNums){ // Method to sum all the odd numbers in the array
    int intSum = 0; // Declares and initializes intSum to 0
    System.out.println("All of the odd numbers in this array are: "); // Prints a message
    for (int intI = 0; intI < arrNums.length; intI++){ // For loop to iterate through the array
      if ((arrNums[intI]%2) == 1){ // If statement to check if the current element is odd
        System.out.println((intI+1)+". "+arrNums[intI]); // Prints the current element
        intSum += arrNums[intI]; // Adds the current element to the sum
      } // End of if statement
    } // End of for loop
    System.out.println("The sum of all the odd numbers is " + intSum); // Prints the sum
  } // End of method

  /*
  main
  in, boolRestart, arrNumbers[], intI, boolPositive, boolValid, boolAgain, boolChoice, strOption, intRemove, boolInvalid2, strContinue, boolRestartInvalid, strRestart, boolRemoveValid
  This method is the main method. It asks the user to input 20 positive numbers, making sure they are all numbers and above the value of 0. Then, it asks the user to choose an option from a menu where the user can remove a number from the array, list all of the numbers and their sum, list all of the even numbers and their sum, list all of the odd numbers and their sum, or exit the program. If the user does not exit the program, they have the option to keep modifiying/printing their array or to restart the program with a new array.
  */
  public static void main(String[] args) { // Main method
    Scanner in = new Scanner (System.in); // Creates a new scanner object

    boolean boolInvalid5 = false;// used if the user picks to exit
    boolean boolRestartInvalid = false; // Declares and initializes boolRestartInvalid to false
    boolean boolInvalid2 = false; // Value that will determine if the user's input is valid
    boolean boolRestart = false; // Declares and initializes boolRestart to false
    while (!boolRestart){ // While loop to restart the program if the user wants to
    
      int [] arrNumbers = new int [20]; // Declares and initializes arrNumbers to a new array of size 20

      for (int intI = 0; intI < arrNumbers.length; intI++){ // For loop to iterate through the array

        boolean boolPositive = false; // Declares and initializes boolPositive to false
        while (!boolPositive){ // While loop to check if the user input is positive
        
          boolean boolValid = false; // Declares and initializes boolValid to false
          while (!boolValid){ // While loop to check if the user input is valid
            System.out.println("Please enter number #" + (intI + 1) + ": "); // Prints a message

            try{ //Try block to handle invalid input
              arrNumbers[intI] = in.nextInt(); //Stores the user input in the current element of the array
              boolValid = true; //Input is valid, exits loop
            }
            catch(InputMismatchException i) { // Catch block to handle invalid input
              System.out.println("Invalid input. Please enter a valid number with a limit of 20 numbers total."); // Prints error message for invalid input
              in.next(); // Takes the invalid input and discards it
            } // End of catch block
          } // End of while loop
        
          if (arrNumbers[intI] > 0){ // If statement to check if the number is positive
            boolPositive = true; // Input is positive, exits loop
          } // End of if statement
          else { // Else statement to handle negative input
            System.out.println("Invalid input. Please enter a positive number."); // Prints error message for negative input
          } // End of else statement
        } // End of while loop
      } // End of for loop
      System.out.println("That is the last number, now\n"); // Prints a message
      boolean boolAgain = false; // Declares and initializes boolAgain to false
      while (!boolAgain){ // While loop to check if the user wants to continue
        boolean boolChoice = false; // Declares and initializes boolChoice to false
        while (!boolChoice){ // While loop to check if the user input is valid
    
          System.out.println("Please choose from one of these options:\n 1. Remove a number from the array\n 2. List the array and find the sum\n 3. List all of the even numbers in the array and find their sum\n 4. List all of the odd numbers in the array and find their sum\n 5. Exit"); // Prints a message for the options
          String strOption = in.next(); // Stores the user input in strOption
          if (strOption.equals("1")){ // If statement to check if the user wants to remove a number from the array
            boolean boolRemoveValid = false; // the infromation from mthdRemove will be put in this
            while (!boolRemoveValid){
              System.out.println("Please enter the number you would like to remove: "); // Prints a message
              int intRemove = in.nextInt(); // Stores the user input in intRemove
              boolRemoveValid = mthdRemove(arrNumbers, intRemove); // Calls the mthdRemove method with the array and number to be removed as parameters
            }
            boolChoice = true; // Input is valid, exits loop
          } // End of if statement
          else if (strOption.equals("2")){ // Else if statement to check if the user wants to list the array and find the sum
            mthdSumAll(arrNumbers); // Calls the mthdSumAll method with the array as a parameter
            boolChoice = true; // Input is valid, exits loop
          }// End of else if statement
          else if (strOption.equals("3")){ // Else if statement to check if the user wants to list all of the even numbers in the array and find their sum
            mthdSumEven(arrNumbers); // Calls the mthdSumEven method with the array as a parameter
            boolChoice = true; // Input is valid, exits loop
          } // End of else if statement
          else if (strOption.equals("4")){ // Else if statement to check if the user wants to list all of the odd numbers in the array and find their sum
            mthdSumOdd(arrNumbers); // Calls the mthdSumOdd method with the array as a parameter
            boolChoice = true; // Input is valid, exits loop
          }
          else if (strOption.equals("5")){ // Else if statement to check if the user wants to exit
            System.out.println("Thank you for using this program!"); // Prints a message
            boolChoice = true; // Input is valid, exits loop
            boolAgain = true; // Exits the inner loop
            boolInvalid5 = true; //exits the outer loop
          } // End of else if statement
          else{ // Else statement to handle invalid input
            System.out.println("Invalid input. Please enter a valid option."); // Prints error message for invalid input
          } // End of else statement
        } // End of while loop
        boolInvalid2 = false; // Declares and initializes boolInvalid2 to false
        if (boolInvalid5 == true){
          boolInvalid2 = true; // Exits the outer loop if the user wants to exit
        }
        while (!boolInvalid2){ // While loop to check if the user input is valid
        
          System.out.println("Would you like to go again using the same array? (Y/N)"); // Prints a message
          String strContinue = in.next(); // Stores the user input in strContinue

          if (strContinue.equalsIgnoreCase("Y")){ // If statement to check if the user wants to continue
            boolAgain = false; // Exits the inner loop
            boolInvalid2 = true; // Input is valid, exits loop
          } // End of if statement
          else if (strContinue.equalsIgnoreCase("N")){ // Else if statement to check if the user wants to restart
            boolAgain = true; // Exits the inner loop
            boolInvalid2 = true; // Input is valid, exits loop
          } // End of else if statement
          else{ // Else statement to handle invalid input
            System.out.println("Invalid input. Please enter a valid option."); // Prints error message for invalid input
          } // End of else statement
        } // End of while loop
      } // End of while loop

      boolRestartInvalid = false; // Declares and initializes boolRestartInvalid to false
      while (!boolRestartInvalid){ // While loop to check if the user input is valid
      
        System.out.println("Would you like to go again using a different array? (Y/N)"); // Prints a message
        String strRestart = in.next(); // Stores the user input in strRestart
        if (strRestart.equalsIgnoreCase("Y")){ // If statement to check if the user wants to restart
          boolRestart = false; // Exits the outer loop
          boolRestartInvalid = true; // Input is valid, exits loop
        } // End of if statement
        else if (strRestart.equalsIgnoreCase("N")){ // Else if statement to check if the user wants to exit
          boolRestart = true; // Exits the outer loop
          boolRestartInvalid = true; // Input is valid, exits loop
        } // End of else if statement
        else{ // Else statement to handle invalid input
          System.out.println("Invalid input. Please enter a valid option."); // Prints error message for invalid input
        } // End of else statement
      } // End of while loop
    } // End of while loop
  in.close(); // Closes the scanner object
  } // End of main method
} // End of class