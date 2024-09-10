/* Mr. Diakoloukas; Edited by Udeshwar
 * ICS4UE
 * Aug 13 2024
 * Purpose of Program: Create a grocery store inventory.
 */


// create item class
class Item 
{ // start of class
  // Instance variables
  private String strSku; // private variable for the sku
  private String strName; // private variable for the name
  private String strCategory; // private variable for the category
  private int intQuantity; // private variable for the quantity
  private int intMinimumQuantity; // private variable for the minimum quantity
  private double dblVendorPrice; // private variable for the vendor's price
  private double dblMarkupPercentage; // private variable for the markup percentage
  private double dblRegularPrice; // private variable for the regular price
  private double dblCurrentDiscount; // private variable for the current discount
  private double dblCurrentPrice; // private variable for the current price

  /*
  Item Constructor
  strSku, strName, strCategory, intQuantity, intMinimumQuantity, dblVendorPrice, dblMarkupPercentage, dblCurrentDiscount
  A contructor for when the user wants to make an object for the item class
  */ 
  public Item(String strSku, String strName, String strCategory, int intQuantity, int intMinimumQuantity, double dblVendorPrice, double dblMarkupPercentage, double dblCurrentDiscount) { // start of constructor
    this.strSku = strSku; // set the sku to the sku
    this.strName = strName; // set the name to the name
    this.strCategory = strCategory; // set the category to the category
    this.intQuantity = intQuantity; // set the quantity to the quantity
    this.intMinimumQuantity = intMinimumQuantity; // set the minimum quantity to the minimum quantity
    this.dblVendorPrice = dblVendorPrice; // set the vendor price to the vendor price
    this.dblMarkupPercentage = dblMarkupPercentage; // set the markup percentage to the markup percentage
    this.dblCurrentDiscount = dblCurrentDiscount; // set the current discount to the current discount
    mthdRegularPrice(); // call the method to calculate the regular price
    mthdCurrentPrice(); // call the method to calculate the current price
    } // end of constructor

  
  /*
  mthdRegularPrice
  dblRegularPrice, dblVendorPrice, dblMarkupPercentage
  This method calculates the value of the regular price and sets it to the instance variable dblRegularPrice.
  */
  public void mthdRegularPrice(){ // start of method
    double dblRegularPrice = dblVendorPrice * (1+dblMarkupPercentage/100); // calculate the regular price
    this.dblRegularPrice = dblRegularPrice; // set the regular price to the instance variable dblRegularPrice
  } // end of method

  
  /*
  getSku
  No variables
  This method gets the value of SKU and returns it.
  */
  public String getSku() { // start of method
    return strSku; // return the sku
  } // end of method

  
  /*
  mthdGetName
  No variables
  This method gets the value of Name  and returns it.
  */
  public String mthdGetName(){ // start of method
    return strName; // return the name
  } // end of method

  
  /*
  mthdCurrentPrice
  dblCurrentprice, dblRegularPrice, dblCurrentDiscount
  This method calculates the value of the current price and sets it to the instance variable dblCurrentPrice.
  */
  public void mthdCurrentPrice() { // start of method
    double dblCurrentprice = dblRegularPrice * (1-dblCurrentDiscount/100); // calculate the current price
    this.dblCurrentPrice = dblCurrentprice; // set the current price to the instance variable dblCurrentPrice
  } // end of method

  /*
  mthdOutput
  strSku, strName, strCategory, intQuantity, intMinimumQuantity, dblVendorPrice, dblMarkupPercentage, dblRegularPrice, dblCurrentDiscount, dblCurrentPrice
  This method outputs the values of the object in an orginized manner
  */
  public String mthdOutput (){ // start of method
    return("SKU: "+strSku + "\nName: " + strName + "\nCategory: " + strCategory + "\nQuantity: " + intQuantity + "\nMinimum Quantity: " + intMinimumQuantity + "\nVendor Price: " + dblVendorPrice + "\nMarkup Percentage: " + dblMarkupPercentage + "\nRegular Price: " + dblRegularPrice + "\nCurrent Discount: " + dblCurrentDiscount + "\nCurrent Price: " + dblCurrentPrice); // return the values of the object in an orginized manner
  } // end of method
  
  /*
  toString Override
  strSku, strName, strCategory, intQuantity, intMinimumQuantity, dblVendorPrice, dblMarkupPercentage, dblRegularPrice, dblCurrentDiscount, dblCurrentPrice
  This method overrides the inbuilt toString method and outputs the values of the object so that they can be put in the array or text file.
  */  
  @Override 
  public String toString() { // start of method
    return String.format("%s,%s,%s,%d,%d,%.2f,%.2f,%.2f,%.2f,%.2f",
      strSku, strName, strCategory, intQuantity, intMinimumQuantity, dblVendorPrice, dblMarkupPercentage, dblRegularPrice, dblCurrentDiscount, dblCurrentPrice); // return the values of the object in the same format as the text file
  } // end of method
} // end of class