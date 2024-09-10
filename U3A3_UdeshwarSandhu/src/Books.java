// Udeshwar Singh Sandhu
// ICS4UE
// August 19, 2024
// Purpose of the program: To log data of different books and store it in this object

class Books{ // Class for books

  //Instance variables
  private int intBookID; // int for Book ID
  private String strBookName; // String for Book Name



  /*
  Books construtor
  intBookID, strBookName
  This constructor takes the input given to the object and puts it in the proper instance variables.
  */
  public Books (int intBookID, String strBookName){ // Constructor for Books
    this.intBookID = intBookID; // Sets the intBookID to the input given
    this.strBookName = strBookName; // Sets the strBookName to the input given
  } // End of Books constructor


  /*
  mthdGetBookName
  strBookName
  This method gets the book's name and returns it.
  */
  public String mthdGetBookName(){ // Method to get the book's name
    return strBookName; // Returns the book's name
  } // End of mthdGetBookName
  
  /*
  mthdGetBookID
  intBookID
  This method gets the book's ID and returns it.
  */
  public int mthdGetBookID(){ // Method to get the book's ID
    return intBookID; // Returns the book's ID
  } // End of mthdGetBookID

  
} // End of Books class
