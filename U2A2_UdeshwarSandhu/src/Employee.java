/*
Udeshwar Singh Sandhu
ICS4UE
August 9, 2024
Purpose of the program: To keep track of different employees in an object. Including their name, salary, and ID number. The class can also print all of these values
*/

public class Employee{ // Employee class

  // These are the instance variables as indicated in the assignment
  private String strEmployeeIdNumber; // Employee ID number
  private String strFirstName; // Employee first name
  private String strLastName; // Employee last name
  private double dblAnnualSalary; // Employee annual salary
  private String strStartDate; // Employee start date

  /*
  Employee constructor
  strEmployeeIdNumber, strFirstName, strLastName, dblAnnualSalary, strStartDate
  updated the values sent to the constructor into the values for the instance variables
    */
  public Employee (String strEmployeeIdNumber, String strFirstName, String strLastName, double dblAnnualSalary, String strStartDate){ // Employee constructor
    this.strEmployeeIdNumber = strEmployeeIdNumber; // Sets the employee ID number
    this.strFirstName = strFirstName; // Sets the employee first name
    this.strLastName = strLastName; // Sets the employee last name
    this.dblAnnualSalary = dblAnnualSalary; // Sets the employee annual salary
    this.strStartDate = strStartDate; // Sets the employee start date
  } // End of Employee constructor

  /*
  mthdGetEmployeeIdNumber
  strEmployeeIdNumber
  returns the value of strEmployeeIdNumber
    */
  public String mthdGetEmployeeIdNumber(){  // Method to get the employee ID number
    return strEmployeeIdNumber; // Returns the employee ID number
  } // End of mthdGetEmployeeIdNumber method

  /*
  mthdGetFirstName
  strFirstName
  returns the value of strFirstName
    */
  public String mthdGetFirstName(){ // Method to get the employee first name
    return strFirstName; // Returns the employee first name
  } // End of mthdGetFirstName method

  /*
  mthdGetLastName
  strLastName
  returns the value of strLastName
    */
  public String mthdGetLastName(){ // Method to get the employee last name
    return strLastName; // Returns the employee last name
  } // End of mthdGetLastName method

  /*
  mthdGetAnnualSalary
  dblAnnualSalary
  returns the value of dblAnnualSalary
    */
  public double mthdGetAnnualSalary(){ // Method to get the employee annual salary
    return dblAnnualSalary; // Returns the employee annual salary
  } // End of mthdGetAnnualSalary method

  /*
  mthdGetStartDate
  strStartDate
  returns the value of strStartDate
    */
  public String mthdGetStartDate(){ // Method to get the employee start date
    return strStartDate; // Returns the employee start date
  } // End of mthdGetStartDate method


  /*
  toString Override
  strEmployeeIdNumber, strFirstName, strLastName, dblAnnualSalary, strStartDate
  returns the values for each variable in a neat way
    */
  @Override // Overrides the toString method
  public String toString(){ // toString method
    return "Employee ID Number: " + strEmployeeIdNumber + "\nFirst Name: " + strFirstName + "\nLast Name: " + strLastName + "\nAnnual Salary: " + dblAnnualSalary + "\nStart Date: " + strStartDate; // Returns the employee information
    
  } // End of toString method


  
} // End of Employee class