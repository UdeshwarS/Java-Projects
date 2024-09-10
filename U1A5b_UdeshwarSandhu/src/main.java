// Udeshwar Singh Sandhu
// ICS4UE
// August 7, 2024
// Purpose of the program: To let the user enter a bunch of information about their classroom and find out the average of the classroom, the average of a student, and to see every student's infromation at once. This is all done while preventing errors from occuring.

import java.util.Scanner; // Imports scanner class for user input
import java.util.InputMismatchException; // Imports InputMismatchException class for error handling
public class Main { // Main class
  public static Scanner in = new Scanner(System.in); // Creates a scanner object for user input
  
  /*
  mthdList
  strStuInfo[][], intI
  This method takes the array and displays the student information for every student in a table format, making sure not to display any information that is null.
  */

  public static void mthdList (String [][] strStuInfo){ // Method to print the list of students

    for(int intI = 0; intI < strStuInfo.length; intI++){ // For loop to print the list of students
      if (strStuInfo[intI][0] != null){ // If statement to check if the student's name is not null
          System.out.print(strStuInfo[intI][0]+" - "); // Prints the student's name
          System.out.print(strStuInfo[intI][1]+" - "); // Prints the student's age
          System.out.print(strStuInfo[intI][2]+" - "); // Prints the student's grade
          System.out.print(strStuInfo[intI][3]+" - "); // Prints the student's gender
          System.out.print(strStuInfo[intI][4]+" - "); // Prints the student's height
          System.out.print(strStuInfo[intI][5]+"\n"); // Prints the student's weight
        } // End of if statement
      } // End of for loop
    } // End of method
  
  /*
  mthdAdd
  strStuInfo[][], intStudentNum, strTempFirstName, strTempLastName, dblTempGrade1, dblTempGrade2, dblTempGrade3, dblTempGrade4, strGrade1, strGrade2, strGrade3, strGrade4, boolNotDone, boolExisting, intI, intX, boolPositive, boolValid, boolPositive2, boolValid2, boolPositive3, boolValid3, boolPositive4, boolValid4
  This method takes the array and lets the user add a student's name and grades while making sure the student is not added twice, the grades are positive numbers, and none of the infromation is left empty to the array. The method also takes the amount of students entered so that it does not orverwrite any student's information.
  */
  public static void mthdAdd (String [][] strStuInfo, int intStudentNum){ // Method to add a student to the list

    String strTempFirstName = ""; // Creates a string variable to store the student's first name
    String strTempLastName = ""; // Creates a string variable to store the student's last name
    Double dblTempGrade1 = 0.0; // Creates a double variable to store the student's first grade
    Double dblTempGrade2 = 0.0; // Creates a double variable to store the student's second grade
    Double dblTempGrade3 = 0.0; // Creates a double variable to store the student's third grade
    Double dblTempGrade4 = 0.0; // Creates a double variable to store the student's fourth grade
    String strGrade1 = ""; // Creates a string variable to store the student's first grade
    String strGrade2 = ""; // Creates a string variable to store the student's second grade
    String strGrade3 = ""; // Creates a string variable to store the student's third grade
    String strGrade4 = ""; // Creates a string variable to store the student's fourth grade
    
    boolean boolNotDone = false; // Creates a boolean variable to check if the user has finished entering the student's information
    while (!boolNotDone){ // While loop to check if the user has finished entering the student's information
      
      boolean boolExisting = false; // Creates a boolean variable to check if the student already exists in the list
      while (!boolExisting){ // While loop to check if the student already exists in the list
        
        System.out.println("Enter the student's first name: "); // Prompts the user to enter the student's first name
        strTempFirstName = in.next(); // Reads the user's input and stores it in the strTempFirstName variable
        System.out.println("Enter the student's last name: "); // Prompts the user to enter the student's last name
        strTempLastName = in.next(); // Reads the user's input and stores it in the strTempLastName variable 
        boolExisting = true; // Sets the boolExisting variable to true
        for(int intI = 0; intI < strStuInfo.length; intI++){ // For loop to check if the student already exists in the list
          for(int intX = 0; intX < 2; intX++){ // For loop to check if the student already exists in the list
            if ((strTempFirstName.equals(strStuInfo[intI][0])) && (strTempLastName.equals(strStuInfo[intI][1]))) { // If statement to check if the student already exists in the list
              boolExisting = false; // Sets the boolExisting variable to false
              } // End of if statement
            } // End of for loop
          } // End of for loop
        
    
        if (boolExisting == false){ // If statement to check if the student already exists in the list
          System.out.println("Student already exists. Please re-enter the student's information."); // Prints an error message
        } // End of if statement
      } // End of while loop
    

      boolean boolPositive = false; // Creates a boolean variable to check if the user has entered a positive number
      while(!boolPositive){ // While loop to check if the user has entered a positive number
        boolean boolValid = false; // Declares and initializes boolValid to false
        while (!boolValid){ // While loop to check if the user input is valid
          System.out.println("Enter the student's first grade: "); // Prompts the user to enter the student's first grade

          try{ //Try block to handle invalid input
            dblTempGrade1 = in.nextDouble(); // Reads the user's input and stores it in the dblTempGrade1 variable
            boolValid = true; //Input is valid, exits loop
          } // End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of while loop
    
        if (dblTempGrade1 > 0){ // If statement to check if the user has entered a positive number
          strGrade1 = String.valueOf(dblTempGrade1); // Converts the dblTempGrade1 variable to a string and stores it in the strGrade1 variable
          boolPositive = true; // Sets the boolPositive variable to true
        } // End of if statement
        else{ // Else statement to check if the user has entered a negative number
          System.out.println("Invalid input. Please enter a positive number"); // Prints error message for invalid input
        
        } // End of else statement
      } // End of while loop
      boolean boolPositive2 = false; // Creates a boolean variable to check if the user has entered a positive number
      while(!boolPositive2){ // While loop to check if the user has entered a positive number
        boolean boolValid2 = false; // Declares and initializes boolValid to false
        while (!boolValid2){ // While loop to check if the user input is valid
          System.out.println("Enter the student's second grade: "); // Prompts the user to enter the student's second grade

          try{ //Try block to handle invalid input
            dblTempGrade2 = in.nextDouble(); // Reads the user's input and stores it in the dblTempGrade2 variable
            boolValid2 = true; //Input is valid, exits loop
          } // End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of while loop

        if (dblTempGrade2 > 0){ // If statement to check if the user has entered a positive number
          strGrade2 = String.valueOf(dblTempGrade2); // Converts the dblTempGrade2 variable to a string and stores it in the strGrade2 variable
          boolPositive2 = true; // Sets the boolPositive2 variable to true
        } // End of if statement
        else{ // Else statement to check if the user has entered a negative number
          System.out.println("Invalid input. Please enter a positive number"); // Prints error message for invalid input

        } // End of else statement
      } // End of while loop
      boolean boolPositive3 = false; // Creates a boolean variable to check if the user has entered a positive number
      while(!boolPositive3){ // While loop to check if the user has entered a positive number
        boolean boolValid3 = false; // Declares and initializes boolValid to false
        while (!boolValid3){ // While loop to check if the user input is valid
          System.out.println("Enter the student's third grade: "); // Prompts the user to enter the student's third grade

          try{ //Try block to handle invalid input
            dblTempGrade3 = in.nextDouble(); // Reads the user's input and stores it in the dblTempGrade3 variable
            boolValid3 = true; //Input is valid, exits loop
          } // End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of while loop

        if (dblTempGrade3 > 0){ // If statement to check if the user has entered a positive number
          strGrade3 = String.valueOf(dblTempGrade3); // Converts the dblTempGrade3 variable to a string and stores it in the strGrade3 variable
          boolPositive3 = true; // Sets the boolPositive3 variable to true
        } // End of if statement
        else{ // Else statement to check if the user has entered a negative number
          System.out.println("Invalid input. Please enter a positive number"); // Prints error message for invalid input

        } // End of else statement
      } // End of while loop
      boolean boolPositive4 = false; // Creates a boolean variable to check if the user has entered a positive number
      while(!boolPositive4){ // While loop to check if the user has entered a positive number
        boolean boolValid4 = false; // Declares and initializes boolValid to false
        while (!boolValid4){ // While loop to check if the user input is valid
          System.out.println("Enter the student's fourth grade: "); // Prompts the user to enter the student's fourth grade

          try{ //Try block to handle invalid input
            dblTempGrade4 = in.nextDouble(); // Reads the user's input and stores it in the dblTempGrade4 variable
            boolValid4 = true; //Input is valid, exits loop
          } // End of try block
          catch(InputMismatchException i) { // Catch block to handle invalid input
            System.out.println("Invalid input. Please enter a valid number"); // Prints error message for invalid input
            in.next(); // Takes the invalid input and discards it
          } // End of catch block
        } // End of while loop

        if (dblTempGrade4>0){ // If statement to check if the user has entered a positive number
          strGrade4 = String.valueOf(dblTempGrade4); // Converts the dblTempGrade4 variable to a string and stores it in the strGrade4 variable
          boolPositive4 = true; // Sets the boolPositive4 variable to true
        } // End of if statement
        else{ // Else statement to check if the user has entered a negative number
          System.out.println("Invalid input. Please enter a positive number"); // Prints error message for invalid input

        } // End of else statement
      } // End of while loop
      //underneath is code for checking if there is any information left blank
      if ((strGrade1.equals(""))||(strGrade2.equals(""))||(strGrade3.equals(""))||(strGrade4.equals(""))||(strTempFirstName.equals(""))||(strTempLastName.equals(""))){ // If statement to check if there is any information left blank
        System.out.println("One or more of the student's information is missing. Please re-enter the student's information properly."); // Prints an error message
      } // End of if statement
      else{ // Else statement to check if there is any information left blank
        boolNotDone = true; // Sets the boolNotDone variable to true
      } // End of else statement
    
    } // End of while loop
    strStuInfo[intStudentNum][0] = strTempFirstName; // Stores the student's first name in the strStuInfo array
    strStuInfo[intStudentNum][1] = strTempLastName; // Stores the student's last name in the strStuInfo array
    strStuInfo[intStudentNum][2] = strGrade1; // Stores the student's first grade in the strStuInfo array
    strStuInfo[intStudentNum][3] = strGrade2; // Stores the student's second grade in the strStuInfo array
    strStuInfo[intStudentNum][4] = strGrade3; // Stores the student's third grade in the strStuInfo array
    strStuInfo[intStudentNum][5] = strGrade4; // Stores the student's fourth grade in the strStuInfo array
    
  }// End of mthdAdd

  /*
  mthdStudentAvg
  strStuInfo[][], dblTempGrade1, dblTempGrade2, dblTempGrade3, dblTempGrade4, boolFound, strTempFirstName, strTempLastName, intI, dblStudentAvg
  This method takes the array and asks the user which student's average they would like to see. It then cycles through the array until it finds the student's information and calculates their average.
  */

  
  public static void mthdStudentAvg (String [][] strStuInfo){ // Creates a method to calculate the student's average grade
    double dblTempGrade1 = 0.0; // Creates a double variable to store the student's first grade
    double dblTempGrade2 = 0.0; // Creates a double variable to store the student's second grade
    double dblTempGrade3 = 0.0;  // Creates a double variable to store the student's third grade
    double dblTempGrade4 = 0.0; // Creates a double variable to store the student's fourth grade
    boolean boolFound = false; // Creates a boolean variable to check if the student is found in the list
    while(!boolFound){ // While loop to check if the student is found in the list
    
      System.out.println("Please enter the student's first name: "); // Prompts the user to enter the student's first name
      String strTempFirstName = in.next(); // Reads the user's input and stores it in the strTempFirstName variable
      System.out.println("Please enter the student's last name: "); // Prompts the user to enter the student's last name
      String strTempLastName = in.next(); // Reads the user's input and stores it in the strTempLastName variable

      for(int intI = 0; intI < strStuInfo.length; intI++){ // For loop to check if the student is found in the list
        if (strTempFirstName.equals(strStuInfo[intI][0]) && strTempLastName.equals(strStuInfo[intI][1])) { // If statement to check if the student is found in the list
            
          dblTempGrade1 = Double.valueOf(strStuInfo[intI][2]); // Converts the student's first grade to a double and stores it in the dblTempGrade1 variable
          dblTempGrade2 = Double.valueOf(strStuInfo[intI][3]); // Converts the student's second grade to a double and stores it in the dblTempGrade2 variable
          dblTempGrade3 = Double.valueOf(strStuInfo[intI][4]); // Converts the student's third grade to a double and stores it in the dblTempGrade3 variable
          dblTempGrade4 = Double.valueOf(strStuInfo[intI][5]); // Converts the student's fourth grade to a double and stores it in the dblTempGrade4 variable
          boolFound = true; // Sets the boolFound variable to true
          } // End of if statement
        } // End of for loop
        
      
      if (boolFound == false){ // If statement to check if the student is found in the list
        System.out.println("Student not found. Please try again."); // Prints an error message
      } // End of if statement
    } // End of while loop
    double dblStudentAvg = (dblTempGrade1 + dblTempGrade2 + dblTempGrade3 + dblTempGrade4) / 4; // Calculates the student's average grade
    System.out.println("The student's average is " + dblStudentAvg); // Prints the student's average grade
    
  } // End of mthdStudentAvg

  /*
  mthdCourseAvg
  strStuInfo[][], dblTempGrade1, dblTempGrade2, dblTempGrade3, dblTempGrade4, intValidEntries, dblCourseAvg
  This method takes the array and calculates the course average by added all of the numbers from 2-5 in the array and divides it by the number of entries.
  */
  
  public static void mthdCourseAvg (String [][] strStuInfo){ // Creates a method to calculate the course average
    double dblTempGrade1 = 0.0; // Creates a double variable to store the student's first grade
    double dblTempGrade2 = 0.0; // Creates a double variable to store the student's second grade
    double dblTempGrade3 = 0.0; // Creates a double variable to store the student's third grade
    double dblTempGrade4 = 0.0; // Creates a double variable to store the student's fourth grade

    int intValidEntries = 0; // Creates an int variable to store the number of valid entries

    for (int intI = 0; intI < strStuInfo.length; intI++) { // For loop to calculate the course average
          if (strStuInfo[intI][2] != null) { // If statement to check if the student has entered a grade
              dblTempGrade1 += Double.valueOf(strStuInfo[intI][2]); // Adds the student's first grade to the dblTempGrade1 variable
              intValidEntries++; // Increments the intValidEntries variable
          } // End of if statement
          if (strStuInfo[intI][3] != null) { // If statement to check if the student has entered a grade
              dblTempGrade2 += Double.valueOf(strStuInfo[intI][3]); // Adds the student's second grade to the dblTempGrade2 variable
              intValidEntries++; // Increments the intValidEntries variable
          } // End of if statement
          if (strStuInfo[intI][4] != null) { // If statement to check if the student has entered a grade
              dblTempGrade3 += Double.valueOf(strStuInfo[intI][4]); // Adds the student's third grade to the dblTempGrade3 variable
              intValidEntries++; // Increments the intValidEntries variable
          } // End of if statement
          if (strStuInfo[intI][5] != null) { // If statement to check if the student has entered a grade
              dblTempGrade4 += Double.valueOf(strStuInfo[intI][5]); // Adds the student's fourth grade to the dblTempGrade4 variable
              intValidEntries++; // Increments the intValidEntries variable
          } // End of if statement
      } // End of for loop

      double dblCourseAvg = (dblTempGrade1 + dblTempGrade2 + dblTempGrade3 + dblTempGrade4) / intValidEntries; // Calculates the course average
      System.out.println("The course average is " + dblCourseAvg); // Prints the course average
  } // End of mthdCourseAvg
  
  public static void main(String[] args) { // Main method

    String [ ][ ] arrStudentInfo = new String [30][6]; // Creates a 2D array to store the student information
    int intStudentNum = 0; // Creates an int variable to store the number of students
    
    boolean boolAgain = false; // Creates a boolean variable to check if the user wants to add another student
    while(!boolAgain){ // While loop to check if the user wants to add another student
      boolean boolOptions = false; // Creates a boolean variable to check if the user has entered a valid option
      while (!boolOptions){ // While loop to check if the user has entered a valid option
    
        System.out.println("Please Choose from one of these options:\n 1. List all students and their grades\n 2. Add a student\n 3. Find a student's average\n 4. Calculate course average\n 5. Exit"); // Prints the options
        String strOption = in.next(); // Reads the user's input and stores it in the strOption variable
        if (strOption.equals("1")){ // If statement to check if the user has entered option 1
          mthdList(arrStudentInfo); // Calls the mthdList method
          boolOptions = true; // Sets the boolOptions variable to true
        }
        else if (strOption.equals("2")){ // Else if statement to check if the user has entered option 2
          if (intStudentNum == 29){ // If statement to check if the maximum number of students has been reached
            System.out.println("The class is at capacity."); // Prints an error message
          } // End of if statement
          else{ // Else statement to check if the maximum number of students has been reached
            mthdAdd(arrStudentInfo, intStudentNum); // Calls the mthdAdd method
            intStudentNum ++; // Increments the intStudentNum variable
          } // End of else statement
          boolOptions = true; // Sets the boolOptions variable to true
        } // End of else if statement
        else if (strOption.equals("3")){ // Else if statement to check if the user has entered option 3
          mthdStudentAvg(arrStudentInfo); // Calls the mthdStudentAvg method
          boolOptions = true; // Sets the boolOptions variable to true
        }  // End of else if statement
        else if (strOption.equals("4")){ // Else if statement to check if the user has entered option 4
          mthdCourseAvg(arrStudentInfo); // Calls the mthdCourseAvg method
          boolOptions = true; // Sets the boolOptions variable to true
        } // End of else if statement
        else if (strOption.equals("5")){ // Else if statement to check if the user has entered option 5

          boolOptions = true; // Sets the boolOptions variable to true
          boolAgain = true; // Sets the boolAgain variable to true
        } // End of else if statement
        else{ // Else statement to check if the user has entered an invalid option
          System.out.println("Please choose a valid option"); // Prints an error message
        } // End of else statement
      } // End of while loop
    } // End of while loop
  } // End of main method
} // End of class