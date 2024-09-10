/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The Trapazoid class which gets the radius of a Trapazoid shaped room and finds the area
 */

import java.util.ArrayList; // Import the ArrayList class
// Create a Trapazoid class that is a subclass of the Shape class (using Inheritance)
public class Trapazoid extends Shape{ // Subclass of Shape
    // Create instance variables specific to the Trapazoid class
    double dblLen1; // Length of the first side of the trapazoid
    double dblLen2; // Length of the second side of the trapazoid
    double dblHeight; // Height of the trapazoid


    /*
    Trapazoid Constructor
    dblLen1, dblLen2, dblHeight, arrDimentionsList
    Create a contructor for when the user wants to make an object for the Trapazoid class
    */
    public Trapazoid(double dblLen1, double dblLen2, double dblHeight){ // Constructor
        this.dblLen1 = dblLen1; // Set the length of the first side of the trapazoid
        this.dblLen2 = dblLen2; // Set the length of the second side of the trapazoid
        this.dblHeight = dblHeight; // Set the height of the trapazoid
        arrDimentionsList.add(dblLen1); // Add the length of the first side to the ArrayList
        arrDimentionsList.add(dblLen2); // Add the length of the second side to the ArrayList
        arrDimentionsList.add(dblHeight); // Add the height to the ArrayList
    } // End of constructor


    /*
    mthdGetArea
    dblLen1, dblLen2, dblHeight, arrDimentionsList
    This method overrides the abstract method mthdGetArea() from the Shape class to make it suitable for this class specifically.
    */
    @Override
    public double mthdGetArea(){ // Getter method for the area of the trapazoid
        arrDimentionsList.get(0); // Get the length of the first side of the trapazoid
        arrDimentionsList.get(1); // Get the length of the second side of the trapazoid
        arrDimentionsList.get(2); // Get the height of the trapazoid
        return ((dblLen1+dblLen2)/2)*dblHeight; // Return the area of the trapazoid
    } // End of mthdGetArea method



    /*
    mthdGetDimentionList
    arrDimentionsList
    This method overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.
    */
    @Override
    public ArrayList<Double> mthdGetDimentionList() { // Getter method for the dimensions of the trapazoid  
        return arrDimentionsList; // Return the dimensions of the trapazoid
    } // End of mthdGetDimentionList method



    /*
    mthdCalculatePrice
    dblUnitPrice
    This method overrides the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the unit price and area.
    */
    @Override
    public double mthdCalculatePrice(){ // Getter method for the price of the trapazoid
        return dblUnitPrice * mthdGetArea(); // Return the price of the trapazoid
    } // End of mthdCalculatePrice method


    /*
    toString
    dblLen1, dblLen2, dblHeight
    This method overrides the built in method of toString and change it so it outputs the name of the shape and dimensions in an organized manner
    */
    @Override 
    public String toString(){ // Getter method for the toString of the trapazoid
        return "--------------\nTRAPAZOID" + "\nLength of Side 1: " + dblLen1 + "\nLength of Side 2: " + dblLen2+ "\nHeight: " + dblHeight+ "\nArea: " + mthdGetArea() + "\nPrice: " + mthdCalculatePrice(); // Return the toString of the trapazoid
    } // End of toString method
} // End of Trapazoid class
