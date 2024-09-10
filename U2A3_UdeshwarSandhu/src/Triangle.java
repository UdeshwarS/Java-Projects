/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The Triangle class which gets the base and height of a triangle shaped room and finds the area
 */
import java.util.ArrayList; // Import the ArrayList class
// Create a Triangle class that is a subclass of the Shape class (using Inheritance)
public class Triangle extends Shape{ // Subclass of Shape
    // Create instance variables specific to the Triangle class
    double dblBase; // Base of the triangle
    double dblHeight; // Height of the triangle


    /*
    Triangle Constructor
    dblBase, dblHeight, arrDimentionsList
    Create a contructor for when the user wants to make an object for the Triangle class
    */
    public Triangle(double dblBase, double dblHeight){ // Constructor
        this.dblBase = dblBase; // Set the base of the triangle
        this.dblHeight = dblHeight; // Set the height of the triangle
        arrDimentionsList.add(dblBase); // Add the base to the ArrayList
        arrDimentionsList.add(dblHeight); // Add the height to the ArrayList
    } // End of constructor


    /*
    mthdGetArea
    dblBase, dblHeight, arrDimentionsList
    This method overrides the abstract method getArea() from the Shape class to make it suitable for this class specifically.
    */
    @Override
    public double mthdGetArea(){ // Getter method for the area of the triangle
        arrDimentionsList.get(0); // Get the base of the triangle
        arrDimentionsList.get(1); // Get the height of the triangle
        return (dblBase * dblHeight)/2; // Return the area of the triangle
    } // End of mthdGetArea method


    /*
    mthdGetDimentionList
    arrDimentionsList
    This method overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.
    */
    @Override
    public ArrayList<Double> mthdGetDimentionList() { // Getter method for the dimensions of the triangle   
        return arrDimentionsList; // Return the dimensions of the triangle
    } // End of mthdGetDimentionList method


    /*
    mthdCalculatePrice
    dblUnitPrice
    This method overrides the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the unit price and area.
    */
    @Override
    public double mthdCalculatePrice(){ // Getter method for the price of the triangle
        return dblUnitPrice * mthdGetArea(); // Return the price of the triangle
    } // End of mthdCalculatePrice method


    /*
    toString
    dblBase, dblHeight
    This method overrides the built in method of toString and change it so it outputs the name of the shape and dimensions in an organized manner
    */
    @Override
    public String toString(){ // Getter method for the toString of the triangle
        return "--------------\nTRIANGLE" + "\nBase: " + dblBase + "\nHeight: " + dblHeight+ "\nArea: " + mthdGetArea() + "\nPrice: " + mthdCalculatePrice(); // Return the toString of the triangle
    } // End of toString method
} // End of Triangle class
