// Udeshwar Singh Sandhu
// ICS4UE
// August 8, 2024
// Purpose of the program: To find out which of the three vehicals are the most profitable 

import java.util.Scanner; // Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling

public class Main { // Main class
  public static Scanner in = new Scanner(System.in); // Creates a scanner object for user input

  /*
  mthdPassengerNum
  This method will ask the user for the number of passengers and return it
  */
  
  public static int mthdPassengerNum (int intVehicalNum){ // Method to get the number of passengers
    int intPassengerNum = 0; // Declares and initializes the variable for the number of passengers

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Please enter the number of passengers for vehical "+intVehicalNum+": "); // Asks the user for the number of passengers

      try{ //Try block to handle invalid input
        intPassengerNum = in.nextInt();  // Takes the user input and stores it in intPassengerNum
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return intPassengerNum; // Returns the number of passengers
  } // End of mthdPassengerNum method

/*
mthdPassengerFare
This method will ask the user for the fare and return it
  */
  
  public static Double mthdPassengerFare (int intVehicalNum){ // Method to get the fare
    double dblPassengerFare = 0; // Declares and initializes the variable for the fare

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Please enter the passenger fare for vehical"+intVehicalNum+": "); // Asks the user for the fare

      try{ //Try block to handle invalid input
        dblPassengerFare = in.nextDouble(); // Takes the user input and stores it in dblPassengerFare
        boolValid = true; //Input is valid, exits loop
      }
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return dblPassengerFare; // Returns the number of passengers
  }
/*
mthdFuelEfficiency
This method will ask the user for the fuel efficiency and return it
  */

  
  public static Double mthdFuelEfficiency (int intVehicalNum){ // Method to get the fuel efficiency
    double dblFuelEfficiency = 0; // Declares and initializes the variable for the fuel efficiency

    boolean boolValid3 = false; // Declares and initializes boolValid to false
    while (!boolValid3){ // While loop to check if the user input is valid
      System.out.println("Please enter the amount of gas per km for vehical "+intVehicalNum+": "); // Asks the user for the fuel efficiency

      try{ //Try block to handle invalid input
        dblFuelEfficiency = in.nextDouble();  // Takes the user input and stores it in dblFuelEfficiency
        boolValid3 = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return dblFuelEfficiency; // Returns the number of passengers
  } // End of mthdFuelEfficiency method
      
   
/*
mthdDistance
This method will ask the user for the distance and return it
  */
  public static int mthdDistance (){ // Method to get the distance
    int intDistance = 0; // Declares and initializes the variable for the distance

    boolean boolValid4 = false; // Declares and initializes boolValid to false
    while (!boolValid4){ // While loop to check if the user input is valid
      System.out.println("Please enter the distance in km: "); // Asks the user for the distance

      try{ //Try block to handle invalid input
        intDistance = in.nextInt();  // Takes the user input and stores it in intDistance
        boolValid4 = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop
    return intDistance; // Returns the number of passengers
  } // End of mthdDistance method
 

  
  public static void main(String[] args) { // Main method
    double dblGasPrice = 0; // Declares and initializes the variable for the gas price

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Please enter the price of gas: "); // Asks the user for the gas price

      try{ //Try block to handle invalid input
        dblGasPrice = in.nextDouble();  // Takes the user input and stores it in dblGasPrice
        boolValid = true; //Input is valid, exits loop
      } // End of try block
      catch(InputMismatchException i) { // Catch block to handle invalid input
        System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
        in.next(); // Takes the invalid input and discards it
      } // End of catch block
    } // End of while loop

    Vehicle.mthdSetGasPrice(dblGasPrice); // Calls the static method to set the gas price
    int intDistance = mthdDistance(); // Calls the method to get the distance

    
    int intVehicle1PassenegerNum = mthdPassengerNum(1); // Calls the method to get the number of passengers for vehical 1
    Double dblVehical1PassengerFare = mthdPassengerFare(1); // Calls the method to get the fare for vehical 1
    Double dblVehical1FuelEfficiency = mthdFuelEfficiency(1); // Calls the method to get the fuel efficiency for vehical 1
    Vehicle vehicle1 = new Vehicle(intVehicle1PassenegerNum, dblVehical1PassengerFare, 
dblVehical1FuelEfficiency); //passenger number, passenger fare, fuel efficiency
    boolean boolProfitable = vehicle1.mthdIsProfitable(intDistance); //checks if the ride is profitable
    String strProfit = ""; // Declares and initializes the variable for the profitability
    if (boolProfitable == true){ // If the ride is profitable
      strProfit = "yes"; // Sets the variable to yes
    } // End of if statement
    else{ // If the ride is not profitable
      strProfit = "no"; // Sets the variable to no
    } // End of else statement
    System.out.println(vehicle1.toString()); // Prints the toString method for vehicle 1
    System.out.print("Is it profitable? "+strProfit+"\n How much profit was made? $"); // Prints the profitability and profit made
    System.out.print(vehicle1.mthdCalculateProfit(intDistance)); // Prints the profit made



    
    int intVehicle2PassenegerNum = mthdPassengerNum(2); // Calls the method to get the number of passengers for vehical 2
    Double dblVehical2PassengerFare = mthdPassengerFare(2); // Calls the method to get the fare for vehical 2
    Double dblVehical2FuelEfficiency = mthdFuelEfficiency(2); // Calls the method to get the fuel efficiency for vehical 2
    Vehicle vehicle2 = new Vehicle(intVehicle2PassenegerNum, dblVehical2PassengerFare, 
 dblVehical2FuelEfficiency); //passenger number, passenger fare, fuel efficiency
    boolean boolProfitable2 = vehicle2.mthdIsProfitable(intDistance); //checks if the ride is profitable
    String strProfit2 = ""; // Declares and initializes the variable for the profitability
    if (boolProfitable2 == true){ // If the ride is profitable
      strProfit2 = "yes"; // Sets the variable to yes
    } // End of if statement
    else{ // If the ride is not profitable
      strProfit2 = "no"; // Sets the variable to no
    } // End of else statement
    System.out.println(vehicle2.toString()); // Prints the toString method for vehicle 2
    System.out.print("Is it profitable? "+strProfit2+"\n How much profit was made? $"); // Prints the profitability and profit made
    System.out.print(vehicle2.mthdCalculateProfit(intDistance)); // Prints the profit made


    
    int intVehicle3PassenegerNum = mthdPassengerNum(3); // Calls the method to get the number of passengers for vehical 3
    Double dblVehical3PassengerFare = mthdPassengerFare(3); // Calls the method to get the fare for vehical 3
    Double dblVehical3FuelEfficiency = mthdFuelEfficiency(3); // Calls the method to get the fuel efficiency for vehical 3
    Vehicle vehicle3 = new Vehicle(intVehicle3PassenegerNum, dblVehical3PassengerFare, 
 dblVehical3FuelEfficiency); //passenger number, passenger fare, fuel efficiency
    boolean boolProfitable3 = vehicle3.mthdIsProfitable(intDistance); //checks if the ride is profitable
    String strProfit3 = ""; // Declares and initializes the variable for the profitability
    if (boolProfitable3 == true){ // If the ride is profitable
      strProfit3 = "yes"; // Sets the variable to yes
    } // End of if statement
    else{ // If the ride is not profitable
      strProfit3 = "no"; // Sets the variable to no
    } // End of else statement
    System.out.println(vehicle3.toString()); // Prints the toString method for vehicle 3
    System.out.print("Is it profitable? "+strProfit3+"\n How much profit was made? $"); // Prints the profitability and profit made
    System.out.print(vehicle3.mthdCalculateProfit(intDistance)); // Prints the profit made
        
    
    Vehicle mostProfitable = Vehicle.compareTo(vehicle1, vehicle2, intDistance); // Calls the static method to compare the profitability of the three vehicles
    mostProfitable = Vehicle.compareTo(mostProfitable, vehicle3, intDistance); // Calls the static method to compare the profitability of the three vehicles
    System.out.println("The most profitable vehicle is: \n"+mostProfitable.toString()); // Prints the toString method for the most profitable vehicle

    
  } // End of main method
} // End of class