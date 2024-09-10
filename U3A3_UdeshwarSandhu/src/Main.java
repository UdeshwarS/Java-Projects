// Udeshwar Singh Sandhu
// ICS4UE
// August 19, 2024
// Purpose of the program: To show the name of a book according to its ID

import java.util.Scanner; // Imports the Scanner class
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling
import java.io.BufferedReader; // for reading files
import java.io.FileReader; // for reading files
import java.io.IOException; // for handling exceptions
import java.util.ArrayList; // Imported array lists


public class Main { // Class for main

public static ArrayList <Books> arrObject = new ArrayList <Books>(); // Creates an array list of books

  /*
  mthdArrays
  strLine, intId, strName
  This method is used to take the data from the file and put it into an array list.
  */
  public static void mthdArrays(){ //reads the BookList file and makes objects accordingly

    try{ // try statement for error handling
      BufferedReader reader = new BufferedReader(new FileReader ("BookList.txt")); // Creates a buffered reader for the file
      
      String strLine; // String for the line
      while ((strLine = reader.readLine()) != null){ //Makes it so that when the reader sees a line that has nothing in it, it will output null and the loop will stop
        int intId = Integer.parseInt(strLine); //Takes the strLine that was used to firgure out when to stop and turns it into an Integer for ID since the first line is the ID
        String strName = reader.readLine(); // Takes the next line and turns it into a String for Name since the second line is the Name

        arrObject.add(new Books(intId, strName)); // Adds the book to the array list
      } // End of while loop
      reader.close(); // Closes the reader
    } // End of try statement
    catch (IOException e){ // Catches the exception
      e.printStackTrace(); // Prints the exception
    } // End of catch statement
  } // End of mthdArrays


  /*
  mthdBinarySearch
  intFindingId, intLow, intHigh, intMid, intMidNum
  This method is used to search through the array list and find the ID that the user is looking for.
  */
  public static int mthdBinarySearch(int intFindingId){ // Method to search through the array list and find the ID that the user is looking for
    int intLow = 0; // Sets the low to 0
    int intHigh = arrObject.size() - 1; // Sets the high to the size of the array list - 1

    while (intLow <= intHigh){ // Makes it so that when the low is less than or equal to the high, the loop will continue
      int intMid = (intLow + intHigh) / 2; // Finds the middle of the array
      int intMidNum = arrObject.get(intMid).mthdGetBookID(); // Gets the ID of the middle number

      if (intMidNum == intFindingId){ // If the middle number is equal to the ID that the user is looking for
        return intMid; // Returns the middle number
      } // End of if statement
      if (intFindingId  < intMidNum){ // If the ID that the user is looking for is less than the middle number
        intHigh = intMid - 1; // Sets the high to the middle number - 1
      } // End of if statement
      else { // If the ID that the user is looking for is greater than the middle number
        intLow = intMid + 1; // Sets the low to the middle number + 1
      } // End of else statement
    } // End of while loop

    return -1; // Returns -1 if the ID that the user is looking for is not found

    
  } // End of mthdBinarySearch



  
  public static void main(String[] args) { // Main method

    
    mthdArrays(); // Calls the method to create the objects
    
    Scanner in = new Scanner(System.in); // Creates a Scanner object for input

    boolean boolValid = false; // Sets the boolean to false
    while (!boolValid){ // Makes it so that when the boolean is false, the loop will continue

      System.out.println("Please choose from these options:\n1) Find book title accoring to its library reference number\n2) Exit"); // Prints the options for the user
      String strOption = in.next(); // Takes the input for the option

      if (strOption.equals("1")){ // If the option is 1
        boolean boolStop = false; // Declares and initializes boolStop to false
        while (!boolStop){ // Makes it so that when boolStop is false, the loop will continue
        
          int intID = 0; // Declares and initializes intID to 0
          
          boolean boolValid2 = false; // Declares and initializes boolValid to false
          while (!boolValid2){ // While loop to check if the user input is valid
            System.out.println("Enter the ID of the book you want to find: "); // Asks the user to enter the ID of the book they want to find
            try{ //Try block to handle invalid input
              intID = in.nextInt();  // Takes the user input and stores it in intPassengerNum
              boolValid2 = true; //Input is valid, exits loop
            } // End of try block
            catch(InputMismatchException i) { // Catch block to handle invalid input
              System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
              in.next(); // Takes the invalid input and discards it
            } // End of catch block
          } // End of while loop
  
          int intIndex = mthdBinarySearch(intID); // Calls the method to search through the array list and find the ID that the user is looking for

          if (intIndex == -1){ // If the ID that the user is looking for is not found
              System.out.println("The book with the ID " + intID + " was not found. Please enter a valid ID"); // Prints error message for invalid input
          } // End of if statement
          else{ // If the ID that the user is looking for is found
            System.out.println("The book with the ID " + intID + " is: \n" + arrObject.get(intIndex).mthdGetBookName()+"\n"); // Prints the book's name
            boolStop = true; // Exits the loop
            
          } // End of else statement

        } // End of while loop


        
      }//End of Option 1

      else if (strOption.equals("2")){ // If the option is 2
        System.out.println("Goodbye"); // Prints goodbye
        boolValid = true; // Exits the loop
      } // End of else if statement
      else{ // If the option is not 1 or 2
        System.out.println("Invalid input. Please enter a valid option"); // Prints error message for invalid input
      } // End of else statement
      
    } // End of while loop
  
  } // End of main method
} // End of main class