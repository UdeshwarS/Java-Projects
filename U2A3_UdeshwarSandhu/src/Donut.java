/**
 @author diakoloukas; Edited by Udeshwar
 ICS4UE
 August 12, 2024
 Purpose of the program: The Donut class which gets the radius of a Donut shaped room and finds the area
 */

import java.util.ArrayList; // Import the ArrayList class
// Create a Donut class that is a subclass of the Shape class (using Inheritance)
public class Donut extends Shape{ // Donut class
    // Create instance variables specific to the Donut class
    double dblRadius1; // Radius of the inner circle
    double dblRadius2; // Radius of the outer circle


    /*
    Donut Constructor
    dblRadius1, dblRadius2, arrDimentionsList
    Create a contructor for when the user wants to make an object for the Donut class
    */
    public Donut(double dblRadius1, double dblRadius2){ // Constructor
        this.dblRadius1 = dblRadius1; // Set the radius of the inner circle
        this.dblRadius2 = dblRadius2; // Set the radius of the outer circle
        arrDimentionsList.add(dblRadius1); // Add the radius of the inner circle to the ArrayList
        arrDimentionsList.add(dblRadius2); // Add the radius of the outer circle to the ArrayList
    } // End of constructor



    /*
    mthdGetArea
    dblRadius1, dblReadius2, arrDimentionsList
    This method overrides the abstract method getArea() from the Shape class to make it suitable for this class specifically.
    */
    @Override
    public double mthdGetArea(){ // Getter method for the area of the donut
        arrDimentionsList.get(0); // Get the radius of the inner circle
        arrDimentionsList.get(1); // Get the radius of the outer circle
        return Math.pow((3.14*dblRadius1),2) - Math.pow((3.14*dblRadius2),2); // Return the area of the donut
    } // End of mthdGetArea method


    /*
    mthdGetDimentionList
    arrDimentionsList
    This method overrides the abstract method getDimentionList() from Shape class to make it suitable for this class specifically.
    */
    @Override
    public ArrayList<Double> mthdGetDimentionList() {    // Getter method for the dimensions of the donut    
        return arrDimentionsList; // Return the dimensions of the donut
    } // End of mthdGetDimentionList method


    /*
    mthdCalculatePrice
    dblUnitPrice
    This method overrides the abstract method mthdCalculatePrice() from the Shape class to make it  calculate the price according to the unit price and area.
    */
    @Override
    public double mthdCalculatePrice(){ // Getter method for the price of the donut
        return dblUnitPrice * mthdGetArea(); // Return the price of the donut
    } // End of mthdCalculatePrice method



    /*
    toString
    dblRadius1, dblRadius2
    This method overrides the built in method of toString and change it so it outputs the name of the shape and dimensions in an organized manner
    */
    @Override
    public String toString(){ // Getter method for the toString of the donut
        return "--------------\nDONUT" + "\nRadius of Big Circle: " + dblRadius1 + "\nRadius of Small Circle: " + dblRadius2+ "\nArea: " + mthdGetArea() + "\nPrice: " + mthdCalculatePrice();
    } // End of toString method
} // End of Donut class
