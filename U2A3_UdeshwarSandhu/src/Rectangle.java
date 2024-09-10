/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The rectangle class which gets the length and width of a rectagular room and finds the area
 */
import java.util.ArrayList; // Imports ArrayList class for error handling
// Create a Rectangle class that is a subclass of the Shape class (using Inheritance)
public class Rectangle extends Shape{ // Creates a Rectangle class that is a subclass of the Shape class
    // Create instance variables specific to the Rectangle class
    double dblLen; // Creates a double variable for the length of the rectangle
    double dblWid; // Creates a double variable for the width of the rectangle


    /*
    Rectangle Constructor
    dblLen, dblWid, arrDimentionsList
    Create a contructor for when the user wants to make an object for the Rectangle class
    */
    public Rectangle(double dblLen, double dblWid){ // Creates a constructor for when the user wants to make an object for the Rectangle class
        this.dblLen = dblLen; // Sets the length of the rectangle 
        this.dblWid = dblWid; // Sets the width of the rectangle 
        arrDimentionsList.add(dblLen); // Adds the length of the rectangle to the arrayList 
        arrDimentionsList.add(dblWid); // Adds the width of the rectangle to the arrayList 
    } // End of the constructor for when the user wants to make an object for the Rectangle class



    /*
    mthdGetArea
    dblLen, dblWid, arrDimentionsList
    This method overrides the abstract method getArea() from the Shape class to make it suitable for this class specifically.
    */
    @Override
    public double mthdGetArea(){ // Overrides the abstract method getArea() from the Shape class to make it suitable for this class specifically.
        arrDimentionsList.get(0); // Gets the first element of the array list of dimensions
        arrDimentionsList.get(1); // Gets the second element of the array list of dimensions
        return dblLen * dblWid; // Returns the area of the rectangle
    } // End of the override for the abstract method getArea() from the Shape class to

    
    /*
    mthdGetDimentionList
    arrDimentionsList
    This method overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.
    */
    @Override 
    public ArrayList<Double> mthdGetDimentionList() { // Overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.  
        return arrDimentionsList; // Returns the array list of dimensions
    } // End of the override for the abstract method getDimentionList() from Shape class to


    /*
    mthdCalculatePrice
    dblUnitPrice
    This method overrides the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the unit price and area.
    */
    @Override 
    public double mthdCalculatePrice(){ // Overrides the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the
        return dblUnitPrice * mthdGetArea(); // Returns the price of the rectangle
    } // End of the override for the abstract method mthdCalculatePrice() from the Shape class to


    /*
    toString
    dblLen, dblWid
    This method overrides the built in method of toString and change it so it outputs the name of the shape and dimensions in an organized manner
    */
    @Override 
    public String toString(){ // Overrides the built in method of toString and change it so it outputs the name of the shape and dimensions in an organized
        return "--------------\nRECTANGLE" + "\nLength: " + dblLen + "\nWidth: " + dblWid+ "\nArea: " + mthdGetArea() + "\nPrice: " + mthdCalculatePrice(); // Returns the name of the shape and dimensions in an organized manner
    } // End of the toString
} // End of the Rectangle class
