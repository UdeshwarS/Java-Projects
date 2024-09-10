/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The Ellipse class which gets the base and height of a Ellipse shaped room and finds the area
 */
import java.util.ArrayList; // Import the ArrayList class
// Create a Ellipse class that is a subclass of the Shape class (using Inheritance)
public class Ellipse extends Shape{ // Subclass of Shape
    // Create instance variables specific to the Ellipse class
    double dblRadius1; // Radius1 of the ellipse
    double dblRadius2; // Radius2 of the ellipse

/*
    Ellipse Constuctor
    dblRadius1, dblRadius2, arrDimentionsList
    This constructor takes in the radius1 and radius2 of the ellipse and sets them to the instance variables. It also addes them to the arrayList.
    */
    public Ellipse(double dblRadius1, double dblRadius2){ // Constructor
        this.dblRadius1 = dblRadius1; // Set the radius1 of the ellipse
        this.dblRadius2 = dblRadius2; // Set the radius2 of the ellipse
        arrDimentionsList.add(dblRadius1); // Add the radius1 to the ArrayList
        arrDimentionsList.add(dblRadius2); // Add the radius2 to the ArrayList
    } // End of constructor

    /*
    mthdGetArea
    dblRadius1, dblRadius2, arrDimentionsList
    This method overrides the abstract method getArea() from the Shape class to make it suitable for this class specifically.
    */
    @Override
    public double mthdGetArea(){ // Getter method for the area of the ellipse
        arrDimentionsList.get(0); // Get the radius1 of the ellipse
        arrDimentionsList.get(1); // Get the radius2 of the ellipse
        return (dblRadius1 * dblRadius2); // Return the area of the ellipse
    } // End of mthdGetArea method


    /*
    mthdGetDimentionList
    arrDimentionsList
    This method overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.
    */
    @Override
    public ArrayList<Double> mthdGetDimentionList() { // Getter method for the dimensions of the ellipse     
        return arrDimentionsList; // Return the dimensions of the ellipse
    } // End of mthdGetDimentionList method


    /*
    mthdCalculatePrice
    dblUnitPrice
    Override the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the unit price and area.
    */
    @Override
    public double mthdCalculatePrice(){ // Getter method for the price of the ellipse
        return dblUnitPrice * mthdGetArea(); // Return the price of the ellipse
    } // End of mthdCalculatePrice method



    /*
    toString
    dblRadius1, dblRadius2
    This method returns the name of the shape and the dimensions in an organized manner.
    */
    @Override
    public String toString(){ // Getter method for the toString of the ellipse
        return "--------------\nELLIPSE" + "\nRadius of Side 1: " + dblRadius1 + "\nRadius of Side 2: " + dblRadius2+ "\nArea: " + mthdGetArea() + "\nPrice: " + mthdCalculatePrice(); // Return the toString of the ellipse
    } // End of toString method
} // End of Ellipse class
