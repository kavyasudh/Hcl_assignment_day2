package day2_hcl_assgn_bookapp;

import java.util.Scanner;

public class Bookstore {
	private Book[] books;    // all the books in this bookstore
    private int totalBooks;   // the number of books in this bookstore
   // private double grossIncome;   //the gross income of the bookstore (will be incremented when books are sold)

    public Bookstore() {

        books = new Book[100];
        totalBooks = 0;
       // grossIncome = 0;

    }
    //If it is already in stock, simply ask the user to enter how many extra books to stock, and then do so. 

    public void addNewBook(Book b) {
        books[totalBooks] = b;
        totalBooks++;

        for (int i = 0; i < totalBooks; i++) {
            if (b.getTitle() == books[i].getTitle()) {
                String name = b.getTitle();
                Scanner m = new Scanner(System.in);
                System.out.println("books is already in stock, how many additonal books would you like to stock?");
                int stock = m.nextInt();


                addBookQuantity(name, stock);
            }
        }

        System.out.println("book has been logged");
        return;
    }

    public void addBookQuantity(String title, int quantity){

        // Adds quantity number of books to the book already in stock in the Bookstore object with
        // the title title. If the book is not in the Bookstore object, nothing is done.

        for (int i =0; i<totalBooks; i++) {
            if (title == books[i].getTitle()) {
                books[i].addQuantity(quantity);
                System.out.println("quantity added successfully");
                return;
            }
    }
        System.out.println("book not found.");
    }

    // Returns true if quantity or more copies of a book with the title title are contained in the Bookstore object.
    public boolean inStock(String title, int quantity){
        for (int i =0; i<totalBooks; i++) {
            if (title == books[i].getTitle()) {
                if (quantity <= books[i].getQuantity()) {return true;}
                else {return false;}
            }
        }
        return false;       
    }

        // Executes selling quantity number of books from the Bookstore object with the title title to the
        // buyer. The Bookstore object is changed to reflect the sale. The gross income of the bookstore is incremented 
        //accordingly. The method returns true is the sale was executed successfully, false otherwise.
        public void sellBook(String title, int quantity){
             for ( int i = 0; i < totalBooks;i++) {
            	 //System.out.println("books sold. " );
                    if (title == books[i].getTitle()  ) {
                        books[i].subtractQuantity(quantity);
                       // double l = books[i].getPrice();
                      //  double profit = l*quantity;
                       // grossIncome = grossIncome + profit;
                      //rework this
                      System.out.println("books sold. " );
                      return;
    
                    }

             }
        
        System.out.println("Book not in stock");
        }


	/*
	 * public void listTitles(){ // Lists all of the titles of the books in the
	 * Bookstore object. for (int i = 0; i<totalBooks; ) {
	 * System.out.println(books[i].getTitle());
	 * 
	 * 
	 * return; } }
	 */

    // Lists all of the information about the books in the Bookstore object. 
    public void listBooks(){

        for (int i = 0; i<totalBooks;) {
            System.out.println(books[i].toString()); 


              return;
            }



    }

    // Returns the total gross income of the Bookstore object.
	/*
	 * public double getIncome(){ return grossIncome;
	 * 
	 * 
	 * }
	 */
}


