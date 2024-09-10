/*
Udeshwar Singh Sandhu
ICS4UE
August 9, 2024
Purpose of the program: To keep track of employees. To see when an employee started, their salary, and their ID number. The program can also remove employees when they are fired and add new employees.
*/

import java.util.Scanner; // Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling
import java.time.LocalDate; // Imports LocalDate class for date handling
import java.time.format.DateTimeFormatter; // Import for DateTimeFormatter
import java.util.ArrayList; // Import for ArrayList


public class Main { // Main class
  public static Scanner in = new Scanner(System.in); // Creates a global scanner object for user input

/*
mthdSalary
dblSalary, boolValid
Returns the salary of the employee, making sure it is a valid number
  */
  public static Double mthdSalary (){ // Method to get the salary of the employee
    Double dblSalary = 0.0; // Creates a double variable for the salary
    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Please enter the annual salary of the employee: "); // Asks the user to enter the salary

      try{ //Try block to handle invalid input
        dblSalary = in.nextDouble();  // Takes the user input and stores it in dblSalary
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number for salary"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return dblSalary; // Returns the valid input for the salary of the employee
  } // End of mthdSalary method

  /*
  mthdRemoveEmployee
  intEmployeeRNum, boolValid
  Returns the employee number, making sure it is a valid number
    */
  public static int mthdRemoveEmployee (){ // Method to get the employee number to remove
    int intEmployeeRNum = 0; // Creates an integer variable for the employee number
    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Please enter the employee number of the employee you would like to remove:"); // Asks the user to enter the employee number
      try{ //Try block to handle invalid input
        intEmployeeRNum = in.nextInt();  // Takes the user input and stores it in dblSalary
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number for employee ID"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return intEmployeeRNum; // Returns the valid input for the salary of the employee
  } // End of mthdRemoveEmployee method
  
  public static void main(String[] args) { // Main method
    
    LocalDate date = LocalDate.now(); // Gets the current date
    LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Formats the date
    String strDate = date.toString(); // Converts the current date to a string

    ArrayList <Employee> arrEmployee = new ArrayList <Employee>(); // Creates an array list of employees

    boolean boolAgain = false; // Declares and initializes boolAgain to false
    while (!boolAgain){ // While loop to keep the program running until the user exits
    
      System.out.println("Please choose an option from the menu below:"); // Prints the menu
      System.out.println("1) Add\n2) Remove\n3) List\n4) Exit"); // Prints the menu
      String strOption = in.next(); // Takes the user input and stores it in strOption

      if (strOption.equals("1")){ // If statement to add an employee
        int intEmployeeNumber = arrEmployee.size(); // Gets the size of the array list and keeps it at the newest employee number
        System.out.println("Please enter the First name of the employee you would like to add:"); // Asks the user to enter the first name of the employee
        String strFirstName = in.next(); // Takes the user input and stores it in strFirstName
        System.out.println("Please enter the Last name of the employee you would like to add:"); // Asks the user to enter the last name of the employee
        String strLastName = in.next(); // Takes the user input and stores it in strLastName
        Double dblSalary = mthdSalary(); // Calls the mthdSalary method to get the salary of the employee
        String strEmployeeNumber = String.valueOf(intEmployeeNumber); // Converts the employee number to a string
        arrEmployee.add(new Employee(strEmployeeNumber, strFirstName, strLastName, dblSalary, strDate)); // Adds the employee to the array list 
      } // End of if statement
      else if (strOption.equals("2")){ // Else if statement to remove an employee
        boolean boolRemoved = false; // Declares and initializes boolRemoved to false
        boolean boolValid = false; // Declares and initializes boolValid to false
        while (!boolValid){ // While loop to check if the user input is valid      
          int intEmployeeRNum = mthdRemoveEmployee(); // Calls the mthdRemoveEmployee method to get the employee number to remove
          for (int i = 0; i < arrEmployee.size(); i++){ // For loop to go through the array list
            if (arrEmployee.get(i).mthdGetEmployeeIdNumber().equals(String.valueOf(intEmployeeRNum))){ // If statement to check if the employee number is valid
              arrEmployee.remove(i); // Removes the employee from the array list
              System.out.println("Employee removed successfully"); // Prints a message to confirm the removal
              boolValid = true; // Input is valid, exits loop
              boolRemoved = true; // Employee was removed, exits loop
            } // End of if statement
          

          } // End of for loop
          if (boolRemoved == false){ // If statement to check if the employee was removed
            System.out.println("Employee not found, please try again"); // Prints a message to confirm the removal 
          } // End of if statement

        } // End of while loop
      } // End of else if statement

      else if (strOption.equals("3")){ // Else if statement to list the employees

        for (int i = 0; i < arrEmployee.size(); i++){ // For loop to go through the array list
          System.out.println(arrEmployee.get(i)+"\n"); // Prints the employee
        } // End of for loop
      
      } // End of else if statement

      else if (strOption.equals("4")){ // Else if statement to exit the program
        System.out.println("Exiting program"); // Prints a message to confirm the exit
        boolAgain = true; // Exits the program
      } // End of else if statement

      else{ // Else statement to handle invalid input
        System.out.println("Invalid input, please try again"); // Prints a message to confirm the exit
      } // End of else statement

    } // End of while loop
  } // End of main method

} // End of Main class