// Udeshwar Singh Sandhu
// ICS4UE
// August 13, 2024
// Purpose of the program: To log data of inventory in a store into a text file 


// import libraries
import java.io.BufferedReader; // for reading files
import java.io.BufferedWriter; // for writing files
import java.io.FileReader; // for reading files
import java.io.FileWriter; // for writing files
import java.io.IOException; // for handling exceptions
import java.util.ArrayList; // for storing items
import java.util.Scanner; // for reading user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling


public class Main { // main class
  
  public static Scanner in = new Scanner(System.in); // Creates a scanner object for user input
  public static ArrayList <Item> arrItemsMeat = new ArrayList <Item>(); // Creates an array list of items for meats
  public static ArrayList <Item> arrItemsVeggie = new ArrayList <Item>(); // Creates an array list of items for veggies
  public static ArrayList <Item> arrItemsFruit = new ArrayList <Item>(); // Creates an array list of items for fruits

  // THESE ARRAYS ARE CREATED IN ORDER TO ORGINIZE THE ITEMS INTO THEIR CORRESPONDING CATEGORIES SO THAT IF THEY ARE EVER NEEDED TO BE DISPLAYED, THEY CAN BE ACCESSED EASILY

  /*
  mthdClearScreen
  No variables
  This method is used muliple times in the program to clear the console. This code is taken from https://stackoverflow.com/questions/2979383/how-to-clear-the-console-using-java
  */
  public static void mthdClearScreen() {  // Method to clear the console
      System.out.print("\033[H\033[2J");   // Clears the console
      System.out.flush();   // Flushes the console
  }   // End of mthdClearScreen

  /*
  mthdReader
  strLine, boolValid, reader, arrInfo
  This method is used to read the file with all of the information and make objects for each item.
  */
  
  public static void mthdReader(){ // Method to read the file
    String strLine; // Variable to store each line of the file
    boolean boolValid = false; // Variable to check if the line is valid
    while (!boolValid){ // While loop to check if the line is valid
      try{ // Try statement to handle exceptions
        boolValid = true; // Sets boolValid to true
        BufferedReader reader = new BufferedReader(new FileReader ("inventory.txt")); // Creates a buffered reader object to read the file
        while ((strLine = reader.readLine()) != null){ //Makes it so that when the reader sees a line that has nothing in it, it will output null and the loop will stop
          String[] arrInfo = strLine.split(","); // Splits the line into an array of strings
          String strCategory = arrInfo[2]; // Sets strCategory to the third element of the array
          if (strCategory.equals("MEAT")){ // If statement to check if the third element of the array is MEAT
            arrItemsMeat.add(new Item(arrInfo[0], arrInfo[1], arrInfo[2], Integer.parseInt(arrInfo[3]), Integer.parseInt(arrInfo[4]), Double.parseDouble(arrInfo[5]), Double.parseDouble(arrInfo[6]), Double.parseDouble(arrInfo[8]))); // Adds the item to the array list
          } // End of if statement
          else if (strCategory.equals("VEGETABLE")){ // Else if statement to check if the third element of the array is VEGETABLE
            arrItemsVeggie.add(new Item(arrInfo[0], arrInfo[1], arrInfo[2], Integer.parseInt(arrInfo[3]), Integer.parseInt(arrInfo[4]), Double.parseDouble(arrInfo[5]), Double.parseDouble(arrInfo[6]), Double.parseDouble(arrInfo[8]))); // Adds the item to the array list
          } // End of else if statement
          else if (strCategory.equals("FRUIT")){ // Else if statement to check if the third element of the array is FRUIT
            arrItemsFruit.add(new Item(arrInfo[0], arrInfo[1], arrInfo[2], Integer.parseInt(arrInfo[3]), Integer.parseInt(arrInfo[4]), Double.parseDouble(arrInfo[5]), Double.parseDouble(arrInfo[6]), Double.parseDouble(arrInfo[8]))); // Adds the item to the array list
          } // End of else if statement
        } // End of while loop
        reader.close(); // Closes the reader
      } // End of try statement
      catch (IOException e){ // Catch statement to handle exceptions
        e.printStackTrace(); // Prints the stack trace of the exception
        System.out.println("Error reading file. Please try again."); // Prints an error message
      } // End of catch statement
    } // End of while loop


  } // End of mthdReader
  
  /*
  mthdChecker
  dblReturnNumber, boolValid
  This method is used muliple times in the program to check if the user input is a valid number for doubles.
  */
  public static Double mthdChecker( String strInput){ // Method to check if the user input is a double
    double dblReturnNumber = 0; // Declares and initializes dblReturnNumber to 0

    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println(strInput); // Prints the string
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
      System.out.println(strInput); // Prints the string
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
    mthdReader(); // Calls the mthdReader method
    boolean boolValid = false; // Declares and initializes boolValid to false
    while (!boolValid){ // While loop to check if the user input is valid
      System.out.println("Welcome to the Grocery Store Inventory Management System!");
      System.out.println("Please select an option:\n1) Search through the inventory\n2) Add a new item to the inventory\n3) Save the file\n4) Exit the program"); // Prints the menu
      String strOption = in.next(); // Gets the user's input for the option they want to choose

      if (strOption.equals("1")) { // If the user chooses option 1, they can search through
        boolean boolSearch = false;  // Declares and initializes boolSearch to false
        while(!boolSearch){ // While loop to check if the user input is valid
          System.out.println("Please select the category of the item you would like to search for:\n1) Meat\n2) Veggie\n3) Fruit");      // Prints the menu   
          String strCategory = in.next(); // Gets the user's input for the category they want to search for
          boolean boolType = false; // Declares and initializes boolType to false
          while(!boolType){ // While loop to check if the user input is valid
          
            System.out.println("Would you like to search by SKU or Name? Select 1 for SKU and 2 for Name"); // Prints the menu
            String strSearch = in.next(); // Gets the user's input for the search type they want to use
            
            if (strSearch.equals("1")){ // If the user chooses to search by SKU
              boolean boolInvalid = false; // Declares and initializes boolInvalid to false
              while(!boolInvalid){ // While loop to check if the user input is valid
                if (strCategory.equals("1")){ // If the user chooses to search for meat
                
                  boolean boolFound = false; // Declares and initializes boolFound to false
                  while (!boolFound){ // While loop to check if the user input is valid
                    System.out.println("Please enter the SKU of the item you would like to search for:"); // Prints the menu
                    String strSku = in.next(); // Gets the user's input for the SKU they want to search for
                
                    for (int intI = 0; intI< arrItemsMeat.size(); intI++){ // For loop to search through the array list
                      if (arrItemsMeat.get(intI).getSku().equals(strSku)){ // If the SKU is found
                        System.out.println(arrItemsMeat.get(intI).mthdOutput()); // Prints the item's information
                        boolFound = true; // Sets boolFound to true
                        boolSearch = true; // Sets boolSearch to true
                        boolType = true; // Sets boolType to true
                      } // End of if statement
                    } // End of for loop
                    if (boolFound == false){ // If the SKU is not found
                      System.out.println("Item not found. Please try again"); // Should ask for category again
              
                    } // End of if statement
                  } // End of while loop
                  boolInvalid = true; // Sets boolInvalid to true
                } // End of if statement
                else if (strCategory.equals("2")){ // If the user chooses to search for veggie
                  boolean boolFound = false; // Declares and initializes boolFound to false
                  while (!boolFound){ // While loop to check if the user input is valid
                    System.out.println("Please enter the SKU of the item you would like to search for:"); // Prints the menu
                    String strSku = in.next(); // Gets the user's input for the SKU they want to search for
                
                    for (int intI = 0; intI< arrItemsVeggie.size(); intI++){ // For loop to search through the array list
                      if (arrItemsVeggie.get(intI).getSku().equals(strSku)){ // If the SKU is found
                        System.out.println(arrItemsVeggie.get(intI).mthdOutput()); // Prints the item's information
                        boolFound = true; // Sets boolFound to true
                        boolSearch = true; // Sets boolSearch to true
                        boolType = true; // Sets boolType to true
                      } // End of if statement
                    } // End of for loop
                    if (boolFound == false){ // If the SKU is not found
                      System.out.println("Item not found. Please try again"); // Should ask for category again

                    } // End of if statement
                  } // End of while loop
                  boolInvalid = true; // Sets boolInvalid to true
                } // End of else if statement
                else if (strCategory.equals("3")){ // If the user chooses to search for fruit
                  boolean boolFound = false; // Declares and initializes boolFound to false
                  while (!boolFound){ // While loop to check if the user input is valid
                    System.out.println("Please enter the SKU of the item you would like to search for:"); // Prints the menu
                    String strSku = in.next(); // Gets the user's input for the SKU they want to search for
                
                    for (int intI = 0; intI< arrItemsFruit.size(); intI++){ // For loop to search through the array list
                      if (arrItemsFruit.get(intI).getSku().equals(strSku)){ // If the SKU is found
                        System.out.println(arrItemsFruit.get(intI).mthdOutput()); // Prints the item's information
                        boolFound = true; // Sets boolFound to true
                        boolSearch = true;// Sets boolSearch to true
                        boolType = true; // Sets boolType to true
                      } // End of if statement
                    } // End of for loop
                    if (boolFound == false){ // If the SKU is not found
                      System.out.println("Item not found. Please try again"); // Should ask for category again

                    } // End of if statement
                  } // End of while loop
                  boolInvalid = true; // Sets boolInvalid to true
                } // End of else if statement
                else{ // If the user enters an invalid input
                  System.out.println("Invalid input. Please try again"); // Prints error message for invalid input
                } // End of else statement
              } // End of while loop
            } // End of if statement
            else if (strSearch.equals("2")){ // If the user chooses to search by name
              boolean boolInvalid = false; // Declares and initializes boolInvalid to false
              while(!boolInvalid){ // While loop to check if the user input is valid
                if (strCategory.equals("1")){ // If the user chooses to search for meat
                  boolean boolFound = false; // Declares and initializes boolFound to false
                  while (!boolFound){ // While loop to check if the user input is valid
                    System.out.println("Please enter the Name of the item you would like to search for:"); // Prints the menu
                    String strName = in.next(); // Gets the user's input for the name they want to search for
                  
                    for (int intI = 0; intI< arrItemsMeat.size(); intI++){ // For loop to search through the array list
                      if (arrItemsMeat.get(intI).mthdGetName().equals(strName)){ // If the name is found
                        System.out.println(arrItemsMeat.get(intI).mthdOutput()); // Prints the item's information  
                        boolFound = true; // Sets boolFound to true
                        boolSearch = true; // Sets boolSearch to true
                        boolType = true; // Sets boolType to true
                      } // End of if statement
                    } // End of for loop
                    if (boolFound == false){ // If the name is not found
                      System.out.println("Item not found. Please try again"); // Should ask for category again

                    } // End of if statement
                  } // End of while loop
                  boolInvalid = true; // Sets boolInvalid to true
                } // End of if statement
                else if (strCategory.equals("2")){ // If the user chooses to search for veggie
                  boolean boolFound = false; // Declares and initializes boolFound to false
                  while (!boolFound){ // While loop to check if the user input is valid
                    System.out.println("Please enter the Name of the item you would like to search for:"); // Prints the menu
                    String strName = in.next(); // Gets the user's input for the name they want to search for
                  
                    for (int intI = 0; intI< arrItemsVeggie.size(); intI++){ // For loop to search through the array list
                      if (arrItemsVeggie.get(intI).mthdGetName().equals(strName)){ // If the name is found
                        System.out.println(arrItemsVeggie.get(intI).mthdOutput()); // Prints the item's information
                        boolFound = true; // Sets boolFound to true
                        boolSearch = true; // Sets boolSearch to true
                        boolType = true; // Sets boolType to true
                      } // End of if statement
                    } // End of for loop
                    if (boolFound == false){ // If the name is not found
                      System.out.println("Item not found. Please try again"); // Should ask for category again

                    } // End of if statement
                  } // End of while loop
                  boolInvalid = true; // Sets boolInvalid to true
                } // End of else if statement
                else if (strCategory.equals("3")){ // If the user chooses to search for fruit
                  boolean boolFound = false; // Declares and initializes boolFound to false
                  while (!boolFound){ // While loop to check if the user input is valid
                    System.out.println("Please enter the Name of the item you would like to search for:"); // Prints the menu
                    String strName = in.next(); // Gets the user's input for the name they want to search for
                  
                    for (int intI = 0; intI< arrItemsFruit.size(); intI++){ // For loop to search through the array list
                      if (arrItemsFruit.get(intI).mthdGetName().equals(strName)){ // If the name is found
                        System.out.println(arrItemsFruit.get(intI).mthdOutput()); // Prints the item's information
                        boolFound = true; // Sets boolFound to true
                        boolSearch = true; // Sets boolSearch to true
                        boolType = true; // Sets boolType to true
                      } // End of if statement
                    } // End of for loop
                    if (boolFound == false){ // If the name is not found
                      System.out.println("Item not found. Please try again"); // Should ask for category again

                    } // End of if statement
                  } // End of while loop
                  boolInvalid = true; // Sets boolInvalid to true
                } // End of else if statement
                else{ // If the user enters an invalid input
                  System.out.println("Invalid input. Please try again"); // Prints error message for invalid input
                } // End of else statement
              } // End of while loop
            } // End of else if statement
            else{ // If the user enters an invalid input
              System.out.println("Invalid input. Please Choose SKU or Name using 1 or 2 respectively"); // Prints error message for invalid input
            } // End of else statement
          } // End of while loop
        
        } // End of if statement
      } // End of while loop
      else if (strOption.equals("2")){ // If the user chooses option 2, they can add a new item
        String strName = ""; // Declares and initializes strName to an empty string
        boolean boolName = false; // Declares and initializes boolName to false
        while (!boolName){ // While loop to check if the user input is valid
          System.out.println("Please enter the name of the item you would like to add:"); // Prints the menu
          strName = in.next(); // Gets the user's input for the name of the item they want to add
          if (strName.length() > 20){ // If the name is too long
            System.out.println("Please enter a name that is less than 20 characters long"); // Prints error message for too long
            boolName = false; // Sets boolName to false
          } // End of if statement
          else{ // If the name is valid
            boolName = true; // Sets boolName to true
          } // End of else statement
        } // End of while loop
        String strSku; // Declares strSku
        int intQuantity = mthdCheckerInt("Please enter the quantity of the item you would like to add:"); // Declares and initializes intQuantity to the user's input for the quantity of the item they want to add
        int intQuantityMin = mthdCheckerInt("Please enter the minimum quantity of the item you would like to add:"); // Declares and initializes intQuantityMin to the user's input for the minimum quantity of the item they want to add
        double dblVendorPrice = mthdChecker("Please enter the vendor's price of the item you would like to add:"); // Declares and initializes dblVendorPrice to the user's input for the vendor's price of the item they want
        double dblMarkUp = mthdChecker("Please enter the store's markup percentage"); // Declares and initializes dblMarkUp to the user's input for the store's markup percentage
        double dblDiscount = mthdChecker("Please enter the store's discount percentage"); // Declares and initializes dblDiscount to the user's input for the store's discount percentage

        boolean boolCategory = false; // Declares and initializes boolCategory to false
        while (!boolCategory){ // While loop to check if the user input is valid
          System.out.println("Please enter the category of the item you would like to add (Meat, Vegetable, or Fruit):"); // Prints the menu
          String strCategory = in.next(); // Gets the user's input for the category of the item they want to add
        
          if (strCategory.equalsIgnoreCase("Meat")){ // If the user chooses meat
            strCategory = "MEAT"; // Sets strCategory to MEAT
            int intArrSize = arrItemsMeat.size(); // Declares and initializes intArrSize to the size of the array list
            if (intArrSize > 10){ // If the array list more than 10 items
              strSku = ("MEA-00"+(intArrSize+1)); // Sets strSku to MEA-00 plus the size of the array list plus 1
            } // End of if statement
            else if (intArrSize > 100){ // If the array list more than 100 items
              strSku = ("MEA-0"+(intArrSize+1)); // Sets strSku to MEA-0 plus the size of the array list plus 1
            } // End of else if statement
            else if (intArrSize > 1000){ // If the array list more than 1000 items
              strSku = ("MEA-"+(intArrSize+1)); // Sets strSku to MEA- plus the size of the array list plus 1
            } // End of else if statement
            else{ // If the array list is under 10 items
              strSku = ("MEA-000"+(intArrSize+1)); // Sets strSku to MEA-000 plus the size of the array list plus 1
            } // End of else statement
            arrItemsMeat.add(new Item(strSku, strName, strCategory, intQuantity, intQuantityMin, dblVendorPrice, dblMarkUp, dblDiscount)); // Adds a new item to the array list
            
            boolCategory = true; // Sets boolCategory to true
          } // End of if statement
          else if (strCategory.equalsIgnoreCase("Vegetable")){ // If the user chooses vegetable
            strCategory = "VEGGIE"; // Sets strCategory to VEGGIE
            int intArrSize = arrItemsVeggie.size(); // Declares and initializes intArrSize to the size of the array list
            if (intArrSize > 10){ // If the array list more than 10 items
              strSku = ("VEG-00"+(intArrSize+1)); // Sets strSku to VEG-00 plus the size of the array list plus 1
            } // End of if statement
            else if (intArrSize > 100){ // If the array list more than 100 items
              strSku = ("VEG-0"+(intArrSize+1)); // Sets strSku to VEG-0 plus the size of the array list plus 1
            } // End of else if statement
            else if (intArrSize > 1000){ // If the array list more than 1000 items
              strSku = ("VEG-"+(intArrSize+1)); // Sets strSku to VEG- plus the size of the array list plus 1
            } // End of else if statement
            else{ // If the array list is under 10 items
              strSku = ("VEG-000"+(intArrSize+1)); // Sets strSku to VEG-000 plus the size of the array list plus 1
            } // End of else statement
            arrItemsVeggie.add(new Item(strSku, strName, strCategory, intQuantity, intQuantityMin, dblVendorPrice, dblMarkUp, dblDiscount)); // Adds a new item to the array list
            boolCategory = true; // Sets boolCategory to true
          } // End of else if statement
          else if (strCategory.equalsIgnoreCase("Fruit")){ // If the user chooses fruit
            strCategory = "FRUIT"; // Sets strCategory to FRUIT
            int intArrSize = arrItemsFruit.size(); // Declares and initializes intArrSize to the size of the array list
            if (intArrSize > 10){ // If the array list more than 10 items
              strSku = ("FRU-00"+(intArrSize+1)); // Sets strSku to FRU-00 plus the size of the array list plus 1
            } // End of if statement
            else if (intArrSize > 100){ // If the array list more than 100 items
              strSku = ("FRU-0"+(intArrSize+1)); // Sets strSku to FRU-0 plus the size of the array list plus 1
            } // End of else if statement
            else if (intArrSize > 1000){ // If the array list more than 1000 items
              strSku = ("FRU-"+(intArrSize+1)); // Sets strSku to FRU- plus the size of the array list plus 1
            } // End of else if statement
            else{ // If the array list is under 10 items
              strSku = ("FRU-000"+(intArrSize+1)); // Sets strSku to FRU-000 plus the size of the array list plus 1
            } // End of else statement
            arrItemsFruit.add(new Item(strSku, strName, strCategory, intQuantity, intQuantityMin, dblVendorPrice, dblMarkUp, dblDiscount)); // Adds a new item to the array list
            boolCategory = true; // Sets boolCategory to true
          } // End of else if statement
          else{ // If the user enters an invalid input
            System.out.println("Invalid category. Please try again"); // Prints error message for invalid input
          } // End of else statement
        } // End of while loop
      } // End of else if statement
      else if (strOption.equals("3")){ // If the user chooses option 3, they can Save the file
        try{ // Start of try statement
          BufferedWriter writer = new BufferedWriter(new FileWriter ("inventory.txt")); // Creates a BufferedWriter object to write to the file
          for (int intI = 0; intI< arrItemsMeat.size(); intI++){ // For loop to write the array of meats to the file
            writer.write(arrItemsMeat.get(intI).toString()); // Writes to the file
            writer.newLine(); // Creates a new line
          } // End of for loop
          for (int intI = 0; intI< arrItemsVeggie.size(); intI++){ // For loop to write the array of vegetables to the file
            writer.write(arrItemsVeggie.get(intI).toString()); // Writes to the file
            writer.newLine(); // Creates a new line
          } // End of for loop
          for (int intI = 0; intI< arrItemsFruit.size(); intI++){ // For loop to write the array of fruits to the file
            writer.write(arrItemsFruit.get(intI).toString()); // Writes to the file
            writer.newLine(); // Creates a new line
          } // End of for loop
          writer.close(); // Closes the writer
        } // End of try statement
        catch (IOException e){ // Catch statement for IOException
          e.printStackTrace(); // Prints the stack trace
        } // End of catch statement

      } // End of else if statement
      else if (strOption.equals("4")){ // If the user chooses option 4, they can exit
        System.out.println("Exiting ..."); // Prints exiting message
        boolValid = true; // Sets boolValid to true
        mthdClearScreen(); // Clears the screen
      }  // End of else if statement
    } // End of while loop
  } // End of main method

 
} // End of Main class