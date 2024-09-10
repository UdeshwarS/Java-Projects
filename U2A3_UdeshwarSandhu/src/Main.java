/*
Udeshwar Singh Sandhu
ICS4UE
August 12, 2024
Purpose of the program: To calculate the price of tiles based on the dimensions of the room and the price per square foot of the tile.
*/

import java.util.Scanner;// Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling
import java.util.ArrayList; // Import for ArrayList


public class Main { // Main class
  public static Scanner in = new Scanner(System.in); // Creates a global scanner object for user input
  public static ArrayList <Shape> arrShapes = new ArrayList <Shape>(); // Creates an array list of shapes


  /*
  mthdClearScreen
  No variables
  This method is used muliple times in the program to clear the console. This code is taken from https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
  */
  public static void mthdClearScreen() {  
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
  }  

  
  /*
  mthdChecker
  dblReturnNumber, boolValid
  This method is used muliple times in the program to check if the user input is a valid number for doubles.
  */
  public static Double mthdChecker( String strInput){ // Method to check if the user input is a double
    double dblReturnNumber = 0; // Declares and initializes dblReturnNumber to 0
    
    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println(strInput); // Asks the user for the unit price
      try{ //Try block to handle invalid input
        dblReturnNumber = in.nextDouble();  // Takes the user input and stores it in intPassengerNum
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return dblReturnNumber; // Returns the value of dblReturnNumber
  } // End of method mthdChecker


  /*
  mthdChecker
  intReturnNumber, boolValid
  This method is used muliple times in the program to check if the user input is a valid number for integers.
  */
  public static int mthdCheckerInt( String strInput){ // Method to check if the user input is an integer
    int intReturnNumber = 0; // Declares and initializes intReturnNumber to 0

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println(strInput); // Asks the user for the unit price
      try{ //Try block to handle invalid input
        intReturnNumber = in.nextInt();  // Takes the user input and stores it in intPassengerNum
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return intReturnNumber; // Returns the value of intReturnNumber
  } // End of method mthdCheckerInt


  
  public static void main(String[] args) { // Main method

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Please choose from one of the following options:\n1) Create a new shape\n2) Delete an existing shape\n3) Display a list of existing shapes with details of each shape\n4) Enter the price per square unit\n5) Calculate the total cost of the floor\n6) Calculate the total area of the floor\n7) Clear the the list of shapes\n8) Exit"); // Asks the user for the unit price
      String strOption = in.next(); // Takes the user input and stores it in strOption

      if (strOption.equals("1")){ // If the user input is 1
        boolean boolShape = false; // Declares and initializes boolShape to false
        while (!boolShape){ // While loop to check if the user input is valid
          System.out.println("Please choose from one of the following options:\n1) Create a new rectangle\n2) Create a new parallelogram\n3) Create a new triangle\n4) Create a new circle\n5) Create a new donut\n6) Create a new trapazoid\n7) Create a new Ellipses\n8) Return to the main menu"); // Asks the user for the unit price
          String strShape = in.next(); // Takes the user input and stores it in strShape

          if (strShape.equals("1")){ // If the user input is 1
            double dblLength = mthdChecker("Please enter the length of the rectangle"); // Asks the user for the length of the rectangle
            double dblWidth = mthdChecker("Please enter the width of the rectangle");  // Asks the user for the width of the rectangle
            arrShapes.add(new Rectangle(dblLength, dblWidth)); // Creates a new rectangle object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of if statement
          else if (strShape.equals("2")){ // If the user input is 2
            double dblBase = mthdChecker("Please enter the base of the parallelogram"); // Asks the user for the base of the parallelogram
            double dblHeight = mthdChecker("Please enter the height of the parallelogram"); // Asks the user for the height of the parallelogram
            arrShapes.add(new Parallelogram(dblBase, dblHeight)); // Creates a new parallelogram object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else if (strShape.equals("3")){ // If the user input is 3
            double dblBase = mthdChecker("Please enter the base of the triangle"); // Asks the user for the base of the triangle
            double dblHeight = mthdChecker("Please enter the height of the triangle"); // Asks the user for the height of the triangle
            arrShapes.add(new Triangle(dblBase, dblHeight)); // Creates a new triangle object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else if (strShape.equals("4")){ // If the user input is 4
            double dblRadius = mthdChecker("Please enter the radius of the circle"); // Asks the user for the radius of the circle
            arrShapes.add(new Circle(dblRadius)); // Creates a new circle object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else if (strShape.equals("5")){ // If the user input is 5
            double dblRadius1 = mthdChecker("Please enter the radius of the big circle"); // Asks the user for the radius of the big circle
            double dblRadius2 = mthdChecker("Please enter the radius of the small circle"); // Asks the user for the radius of the small circle
            arrShapes.add(new Donut(dblRadius1, dblRadius2)); // Creates a new donut object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else if (strShape.equals("6")){ // If the user input is 6
            double dblLen1 = mthdChecker("Please enter the length of the first side"); // Asks the user for the length of the first side
            double dblLen2 = mthdChecker("Please enter the length of the second side"); // Asks the user for the length of the second side
            double dblHeight = mthdChecker("Please enter the height of the trapazoid"); // Asks the user for the height of the trapazoid
            arrShapes.add(new Trapazoid(dblLen1, dblLen2, dblHeight)); // Creates a new trapazoid object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else if (strShape.equals("7")){ // If the user input is 7
            double dblRadius1 = mthdChecker("Please enter the radius of the first side"); // Asks the user for the radius of the first side
            double dblRadius2 = mthdChecker("Please enter the radius of the second side"); // Asks the user for the radius of the second side
            arrShapes.add(new Ellipse(dblRadius1, dblRadius2)); // Creates a new ellipse object and adds it to the array list
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else if (strShape.equals("8")){ // If the user input is 8
            System.out.println("Returning to the main menu..."); // Prints a message to the user
            boolShape = true; // Sets boolShape to true to exit the while loop
          } // End of else if statement
          else{ // Else statement
            System.out.println("Invalid input. Please try again."); // Prints an error message to the user
          }// End of else 
        } // End of while loop
      } // End of if statement, option 1

      else if (strOption.equals("2")){ // If the user input is 2

        boolean boolRemove = false; // Declares and initializes boolRemove to false
        while (!boolRemove){ // While loop to check if the user input is valid
          int intIndex = mthdCheckerInt("Please enter the index of the shape you would like to delete"); // Asks the user for the index of the shape they would like to delete
          if (intIndex < arrShapes.size() && intIndex >= 0){ // If the user input is valid
            arrShapes.remove(intIndex); // Removes the shape at the index specified by the user from the array list
            System.out.println("Shape deleted successfully."); // Prints a message to the user
            boolRemove = true; // Sets boolRemove to true to exit the while loop
          } // End of if statement
          else{ // Else statement
            System.out.println("Invalid index. Please try again."); // Prints an error message to the user
          } // End of else
        } // End of while loop
      } // End of else if statement, option 2

      else if (strOption.equals("3")){ // If the user input is 3
        for (int i = 0; i < arrShapes.size(); i++){ // For loop to iterate through the array list
          System.out.println("Shape " + (i+1) + ": " + arrShapes.get(i)); // Prints the details of each shape in the array list
        } // End of for loop
      } // End of else if statement, option 3

      else if (strOption.equals("4")){ // If the user input is 4
        Shape.mthdSetUnitPrice(); // Calls the mthdSetUnitPrice method from the Shape class
      } // End of else if statement, option 4

      else if (strOption.equals("5")){ // If the user input is 5
        double dblTotalCost = 0; // Declares and initializes dblTotalCost to 0
        for (int i = 0; i < arrShapes.size(); i++){ // For loop to iterate through the array list
          dblTotalCost += arrShapes.get(i).mthdCalculatePrice(); // Calculates the total cost of all the shapes in the array list and adds it to the total cost variable
        } // End of for loop
        System.out.println("The total cost of the floor is $" + dblTotalCost); // Prints the total cost of the floor
      } // End of else if statement, option 5

      else if (strOption.equals("6")){ // If the user input is 6
        double dblTotalArea = 0; // Declares and initializes dblTotalArea to 0
        for (int i = 0; i < arrShapes.size(); i++){ // For loop to iterate through the array list
          dblTotalArea += arrShapes.get(i).mthdGetArea(); // Calculates the total area of all the shapes in the array list and adds it to the total area variable
        } // End of for loop
        System.out.println("The total area of the floor is " + dblTotalArea + " square units"); // Prints the total area of the floor
      } // End of else if statement, option 6

      else if (strOption.equals("7")){ // If the user input is 7
        arrShapes.clear(); // Clears the array list of shapes
        System.out.println("The list of shapes has been cleared."); // Prints a message to the user
      }

      else if (strOption.equals("8")){ // If the user input is 8
        System.out.println("Exiting the program..."); // Prints a message to the user
        boolValid = true; // Sets boolValid to true to exit the while loop
        mthdClearScreen(); // Calls the mthdClearScreen method from the Main class
      } // End of else if statement, option 8

      else{ // Else statement
        System.out.println("Invalid input. Please try again."); // Prints an error message to the user
        mthdClearScreen(); // Calls the mthdClearScreen method from the Main class
      } // End of else
    } // End of while loop
  
  } // End of main method
} // End of class