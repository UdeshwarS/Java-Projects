/*  
Udeshwar Singh Sandhu
ICS4UE
August 16, 2024
Purpose of the program: To get make an array of random numbers and then sort them using different sorting methods like Selection Sort, Bubble Sort, Insertion Sort, and Quicksort Sort
*/


import java.util.Scanner;// Imports scanner class for user input
import java.util.Random;// Imports random class for random number generation

public class Main { // Main class


  /*
  mthdSelectionSort
  arrNum [}, intOrder, intLen, intI, intMin, intIndex, intX, inttemp
  This method uses selection sort to sort the array of random numbers
  */
  public static void mthdSelectionSort (int [] arrNum, int intOrder){ // Selection Sort method
    int intLen = arrNum.length;// Gets the length of the array

    for (int intI = 0; intI < intLen - 1; intI++){ // For loop that goes through the array
      int intMin = arrNum[intI]; // Sets the minimum value to the first value in the array
      int intIndex = intI; // Sets the index of the minimum value to the first index in the array
      for (int intX = intI + 1; intX < intLen; intX++){ // For loop that goes through the array
        if (arrNum[intX]< intMin){ // If statement that checks if the value at the index is less than the minimum value
          intMin = arrNum[intX]; // Sets the minimum value to the value at the index
          intIndex = intX; // Sets the index of the minimum value to the index of the value at the index
        } // End of if statement
      } // End of for loop
      int intTemp = arrNum[intI]; // Sets the temporary value to the value at the index
      arrNum[intI] = arrNum[intIndex]; // Sets the value at the index to the minimum value
      arrNum[intIndex] = intTemp; // Sets the minimum value to the temporary value
    } // End of for loop
    mthdPrintArray(arrNum, intOrder); // Calls the method to print the array

    
  } // End of method

  /*
  mthdBubbleSort
  arrNum [}, intOrder, intLen, boolSwap, intI, intTemp
  This method uses Bubble sort to sort the array of random numbers
  */
  public static void mthdBubbleSort (int [] arrNum, int intOrder){ // Bubble Sort method
    int intLen = arrNum.length;// Gets the length of the array

    boolean boolSwap = false; // Sets the boolean value to false
    while (!boolSwap){ // While loop that runs while the boolean value is false
      boolSwap = true; // Sets the boolean value to true
      for (int intI = 0;intI< (intLen - 1); intI++){ // For loop that goes through the array
        if (arrNum[intI]> arrNum[intI + 1]){ // If statement that checks if the value at the index is greater than the value at the index plus 1
          boolSwap = false; // Sets the boolean value to false
          int intTemp = arrNum[intI]; // Sets the temporary value to the value at the index
          arrNum[intI] = arrNum[intI + 1]; // Sets the value at the index to the value at the index plus 1
          arrNum[intI + 1] = intTemp; // Sets the value at the index plus 1 to the temporary value
        } // End of if statement
      } // End of for loop
    } // End of while loop
    mthdPrintArray(arrNum, intOrder); // Calls the method to print the array
  } // End of method

  /*
  mthdInsertionSort
  arrNum [}, intOrder, intLen, intI, intCurrentValue, intX
  This method uses Insertion sort to sort the array of random numbers
  */
  public static void mthdInsertionSort (int [] arrNum, int intOrder){ // Insertion Sort method
    int intLen = arrNum.length;// Gets the length of the array

    for (int intI = 1; intI< intLen; intI++){ // For loop that goes through the array
      int intCurrentValue  = arrNum[intI]; // Sets the current value to the value at the index
 
      int intX = intI - 1; // Sets the index to the index minus 1
      while (intX >= 0 && arrNum[intX] > intCurrentValue){ // While loop that runs while the index is greater than or equal to 0 and the value at the index is greater than the current
        arrNum[intX + 1] = arrNum [intX]; // Sets the value at the index plus 1 to the value at the index
        intX--; // Decrements the index
      } // End of while loop
      arrNum[intX + 1] = intCurrentValue; // Sets the value at the index plus 1 to the current value
    } // End of for loop

    mthdPrintArray(arrNum, intOrder); // Calls the method to print the array

    
  } // End of method

  /*
  mthdSwap
  arrNum [}, intI, intX
  This method swaps two values in an array
  */
  public static void mthdSwap (int [] arrNum, int intI, int intX){ // Swap method
    int intTemp = arrNum[intI]; // Sets the temporary value to the value at the index
    arrNum[intI] = arrNum[intX]; // Sets the value at the index to the value at the index plus 1
    arrNum[intX] = intTemp; // Sets the value at the index plus 1 to the temporary value
  }

  /*
  mthdQuickSort
  arrNum [}, intLowIndex, intHighIndex, intPivot, intLeftPointer, intRightPointer
  This method uses Quick sort to sort the array of random numbers
  */
  public static void mthdQuickSort (int [] arrNum, int intLowIndex, int intHighIndex){ // Quick Sort method
    
    if (intLowIndex>= intHighIndex){ // If statement that checks if the low index is greater than or equal to the high index
      return; // Returns nothing
    } // End of if statement
    
    int intPivot = arrNum[intHighIndex]; // Sets the pivot to the value at the high index
    int intLeftPointer = intLowIndex; // Sets the left pointer to the low index
    int intRightPointer = intHighIndex - 1; // Sets the right pointer to the high index minus 1

    while (intLeftPointer < intRightPointer){ // While loop that runs while the left pointer is less than or equal to the right pointer
      while (arrNum[intLeftPointer] <= intPivot && intLeftPointer < intRightPointer){ // While loop that runs while the value at the left pointer is less than or equal to the pivot and the left pointer is less
        intLeftPointer++; // Increments the left pointer
      } // End of while loop
      while (arrNum[intRightPointer] >= intPivot && intLeftPointer < intRightPointer){ // While loop that runs while the value at the right pointer is greater than or equal to the pivot and the left pointer is less
        intRightPointer--; // Decrements the right pointer
      } // End of while loop
      mthdSwap(arrNum, intLeftPointer, intRightPointer); // Calls the swap method
    } // End of while loop
    mthdSwap(arrNum, intLeftPointer, intHighIndex); // Calls the swap method
    mthdQuickSort(arrNum, intLowIndex, (intLeftPointer-1)); // Calls the quick sort method
    mthdQuickSort(arrNum, (intLeftPointer+1), intHighIndex); // Calls the quick sort method
    
  } // End of method


  /*
  mthdQuickSort
  arrNum [}, intOrder
  This method prints out the array of random numbers according to wheter the user wants it in ascending or descending order
  */
  public static void mthdPrintArray (int [] arrNum, int intOrder){ // Print Array method
    if (intOrder == 1) { // If statement that checks if the order is ascending
      for (int intI = 0; intI < arrNum.length; intI++) { // For loop that goes through the array
          System.out.print(arrNum[intI] + ", "); // Prints the value at the index with a comma and space
      } // End of for loop
    } else if (intOrder == 2) { // If statement that checks if the order is descending
      for (int intI = arrNum.length - 1; intI >= 0; intI--) { // For loop that goes through the array
          System.out.print(arrNum[intI] + ", "); // Prints the value at the index with a comma and space
      } // End of for loop
    } // End of else if statement
    System.out.println(); // Prints a new line
  } // End of method

  
  public static void main(String[] args) { // Main method

    Scanner in = new Scanner(System.in); // Creates a scanner object for user input
    
    int [] arrNumbers = new int [25]; // Creates an array of 25 integers
    int intOrder = 0; // Sets the order to 0
    Random random = new Random (); //generates numbers from 1000 to -1000
    boolean boolValid = false; // Sets the boolean value to false
    while(!boolValid){ // While loop that runs while the boolean value is false
      
      for (int intI = 0; intI < arrNumbers.length; intI++){ // For loop that goes through the array
        arrNumbers[intI] = random.nextInt(2001) - 1000; // Generates a random number from -1000 to 1000 and sets it to the value at the index
      } // End of for loop
      boolean boolOrder = false; // Sets the boolean value to false
      System.out.println("Which sorting method would you like to use?\n1) Selection Sort\n2) Bubble Sort\n3) Insertion Sort\n4) Quicksort Sort\n5) Exit"); // Prints the menu
      String strOption = in.next(); // Gets the user input
      if (strOption.equals("5")){ // If statement that checks if the user input is 5
        System.out.println("Exiting..."); // Prints exiting
        boolValid = true; // Sets the boolean value to true
        boolOrder = true; // Sets the boolean value to true
      } // End of if statement
      
      while (!boolOrder){ // While loop that runs while the boolean value is false
        System.out.println("Do you want the list to be sorted in ascending or descending order?\n1) Ascending\n2) Descending"); // Prints the menu
        String strOrder = in.next(); // Gets the user input
        if (strOrder.equals("1")) { // If statement that checks if the user input is 1
          intOrder = 1; // Sets the order to 1
          boolOrder = true; // Sets the boolean value to true
        } // End of if statement
        else if (strOrder.equals("2")){ // If statement that checks if the user input is 2
          intOrder = 2; // Sets the order to 2
          boolOrder = true; // Sets the boolean value to true
        } // End of else if statement
        else{ // Else statement
          System.out.println("Invalid, please choose again"); // Prints invalid
        } // End of else statement
        System.out.println("Oringinal Array: "); // Prints the oringinal array
        for (int intI = 0; intI < arrNumbers.length; intI++){ // For loop that goes through the array
          System.out.print(arrNumbers[intI] + ", "); // Prints the value at the index with a comma and space
        } // End of for loop
      }// End of ordering while loop
      
      
      if (strOption.equals("1")){ // If statement that checks if the user input is 1
        System.out.println("\nSelection Sort: "); // Prints selection sort
        mthdSelectionSort(arrNumbers, intOrder); // Calls the selection sort method
      } // End of if statement
      else if (strOption.equals("2")){ // If statement that checks if the user input is 2
        System.out.println("\nBubble Sort: "); // Prints bubble sort
        mthdBubbleSort(arrNumbers, intOrder); // Calls the bubble sort method
      } // End of else if statement
      else if (strOption.equals("3")){ // If statement that checks if the user input is 3
        System.out.println("\nInsertion Sort: "); // Prints insertion sort
        mthdInsertionSort(arrNumbers, intOrder); // Calls the insertion sort method
      } // End of else if statement
      else if (strOption.equals("4")){ // If statement that checks if the user input is 4
        System.out.println("\nQuicksort Sort: "); // Prints quicksort sort
        mthdQuickSort(arrNumbers,0, arrNumbers.length-1); // Calls the quicksort sort method
        mthdPrintArray(arrNumbers, intOrder); // Calls the print array method

      } // End of else if statement

    }// End of valid while loop
  } // End of main method

 
} // End of class