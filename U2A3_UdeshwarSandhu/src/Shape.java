/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The parent class for all shapes
 */
import java.util.ArrayList; // Import the ArrayList class
import java.util.Scanner; // Import the Scanner class
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling

//Create an abstract parent class called "Shape" 
public abstract class Shape { // Abstract class


    // Create protected variables/ArrayList, meaning anything within the package can access these variables/ArrayList
    protected static double dblUnitPrice; // Unit price of the shape
    protected ArrayList <Double> arrDimentionsList = new ArrayList<Double>(); // ArrayList to store the dimensions of the shape

    /*
    mthdGetUnitPrice
    dblGetUnitPrice
    This method returns the unit price of the shape
    */
    // Create a method to mthdGetUnitPrice
    public double mthdGetUnitPrice(){ // Getter method for the unit price
        return dblUnitPrice; // Return the unit price
    }


    /*
    mthdGetArea
    No variables
    This method creates an abstract method (getter) that all subclasses will need to Override for mthdGetArea
    */
    public abstract double mthdGetArea(); // Abstract method to get the area of the shape


    /*
    mthdGetDimentionList
    No variables
    This method creates an abstract method (getter) that all subclasses will need to Override for mthdGetDimentionList
    */
    public abstract ArrayList mthdGetDimentionList(); // Abstract method to get the dimensions of the shape


    /*
    mthdSetUnitPrice
    dblUnitPrice, boolValid
    This method sets the unit price of the shape
    */
    public static void mthdSetUnitPrice () { // Setter method for the unit price
        Scanner in = new Scanner(System.in); // Create a Scanner object

        boolean boolValid = false; // Declares and initializes boolValid to false
        while (!boolValid){ // While loop to check if the user input is valid
          System.out.println("Please enter the unit price"); // Asks the user for the unit price
          try{ //Try block to handle invalid input
            dblUnitPrice = in.nextDouble();  // Takes the user input and stores it in intPassengerNum
            boolValid = true; //Input is valid, exits loop
          } // End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of while loop
    } // End of mthdSetUnitPrice method
    public abstract double mthdCalculatePrice(); // Create an abstract method (getter) that all subclasses will need to Override for mthdCalculatePrice
    
} // End of Shape class


