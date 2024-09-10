/*
 * @author Mr Diakoloukas, Edited by Udeshwar Sandhu
 * @Date Aug 8 2024
 * @Class ICE4UE
 * @Purpose: To create a vehicle class that can be used to create objects
*/

/* Vehicle Class
   This class outlines all instance variables and methods.
   This class assigns static values as per the assignment
   Refer to the assignment to ensure you are not missing anything!
 */
public class Vehicle { // Vehicle class

    // These are the instance variables as indicated in the assignment
    private int intPassengerNum; // Number of passengers
    private double dblPassengerFare; // Passenger fare
    private double dblFuelEfficiency; // Fuel efficiency

    // You are required to create TWO static values that are needed for the assignment
    private static double dblGasPrice; // Gas price
    private static final double PROFIT = 400.0; // Profit


    // Constructor as indicated in the assignment, however block of code is missing
    public Vehicle(int intPassengerNum, double dblPassengerFare, double dblFuelEfficiency) { // Constructor
        this.intPassengerNum = intPassengerNum; // Sets the number of passengers
        this.dblPassengerFare = dblPassengerFare; // Sets the passenger fare
        this.dblFuelEfficiency = dblFuelEfficiency; // Sets the fuel efficiency
        
    } // End of constructor

    // This method will return the revenue by multiplying the number of passengers x the fare
    public double mthdRevenue() { // Revenue method
        Double dblRevenue = intPassengerNum * dblPassengerFare; // Calculates the revenue
        return dblRevenue; // Returns the revenue
    } // End of revenue method

    // Calculate the total by multiplying the fuel's efficiency by the gas price and the distance
    public double mthdTotalCost(int intDistance) { // Total cost method
        double dblTotalCost = (dblFuelEfficiency * intDistance) * dblGasPrice; // Calculates the total cost
        return dblTotalCost; // Returns the total cost
    } // End of total cost method

    //Calculate the profit by taking the total cost multiplied by the distance, then subtracting that from the revenue
    public double mthdCalculateProfit(int intDistance) { // Profit method
        
        return mthdRevenue() - mthdTotalCost(intDistance); // Revenue is called so that the total revenue can be calculated, then totalCost is called while sending the distance to figure out how much it costed. The method then returns the profit/loss made.
    } // End of profit method

    //Check if the ride is profitable by seeing if the profit multiplied by the distance is greater than the min amount that is considered profit ($400)
    public boolean mthdIsProfitable(int intDistance) { // Profitable method
        if (mthdCalculateProfit(intDistance) > PROFIT) { // If the profit is greater than the profit
            return true; // Returns true
        } // End of if statement
        else{ // If the profit is not greater than the profit
            return false; // Returns false
        } // End of else statement
    }  // End of profitable method

    //use compareTo to check which vehicle from the vehicle class has the largest profit, and return the most profitable one
    public static Vehicle compareTo(Vehicle vehicle1, Vehicle vehicle2, int distance) { // Compare to method
        // I gave you this as you have not used compareto, but you were required to research it
        return vehicle1.mthdCalculateProfit(distance) > vehicle2.mthdCalculateProfit(distance) ? vehicle1 : vehicle2; // Returns the vehicle with the largest profit
        
    } // End of compare to method

    // This is the setter that is required specifically when using PRIVATE but you are still required to have it
    public static void mthdSetGasPrice(double dblPrice) { // Set gas price method
        // set the static gasPrice variable to the provided price
        dblGasPrice = dblPrice; // Sets the gas price
    } // End of set gas price method

    // Override toString this should be modified to make it look presentable
    @Override // Overrides the toString method
    public String toString() { // toString method
        return ("Vehical Information: \nAmount of passengers: "+ intPassengerNum+ "\nPasseneger Fare: $"+ dblPassengerFare+ "\nFuel Efficiency: "+ dblFuelEfficiency+ "km/L \nGas Price: $"+ dblGasPrice + "per Liter \n"); // Returns the toString method
    } // End of toString method
} // End of class
