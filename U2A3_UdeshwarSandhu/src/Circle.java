/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The Circle class which gets the radius of a Circle shaped room and finds the area
 */

import java.util.ArrayList; // Import the ArrayList class
// Create a Circle class that is a subclass of the Shape class (using Inheritance)
public class Circle extends Shape{ // Subclass of Shape
    // Create instance variables specific to the Circle class
    double dblRadius; // Radius of the circle



    /*
    Circle Constructor
    dblRadius, arrDimentionsList
    Create a contructor for when the user wants to make an object for the Circle class
    */
    public Circle(double dblRadius){ // Constructor
        this.dblRadius = dblRadius; // Set the radius of the circle
        arrDimentionsList.add(dblRadius); // Add the radius to the ArrayList
    } // End of constructor


    /*
    mthdGetArea
    dblRadius, arrDimentionsList
    This method overrides the abstract method getArea() from the Shape class to make it suitable for this class specifically.
    */
    @Override
    public double mthdGetArea(){ // Getter method for the area of the circle
        arrDimentionsList.get(0); // Get the radius of the circle
        arrDimentionsList.get(1); // Get the height of the circle
        return Math.pow((3.14*dblRadius),2); // Return the area of the circle
    } // End of mthdGetArea method


    /*
    mthdGetDimentionList
    arrDimentionsList
    This method overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.
    */
    @Override
    public ArrayList<Double> mthdGetDimentionList() { // Getter method for the dimensions of the circle  
        return arrDimentionsList; // Return the dimensions of the circle
    } // End of mthdGetDimentionList method


    /*
    mthdCalculatePrice
    dblUnitPrice
    This method overrides the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the unit price and area.
    */
    @Override
    public double mthdCalculatePrice(){ // Getter method for the price of the circle
        return dblUnitPrice * mthdGetArea(); // Return the price of the circle
    } // End of mthdCalculatePrice method


    /*
    toString
    dblRadius
    This method overrides the built in method of toString and change it so it outputs the name of the shape and dimensions in an organized manner
    */
    @Override
    public String toString(){ // Getter method for the toString of the circle
        return "--------------\nCircle" + "\nRadius: " + dblRadius+ "\nArea: " + mthdGetArea() + "\nPrice: " + mthdCalculatePrice(); // Return the toString of the circle
    } // End of toString method
} // End of Circle class
