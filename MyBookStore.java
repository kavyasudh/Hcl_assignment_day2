package day2_hcl_assgn_bookapp;

import java.util.Scanner;

public class MyBookStore {
	

	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);
	        Bookstore mybookstore = new Bookstore();

	        int user_choice;

	        do {

	            System.out.println();
	            System.out.println("1) Add a book to the stock");
	            System.out.println("2) Sell a book in stock");
	          
	            System.out.println("3) List all the information about the books in stock");
	           
	            System.out.println("0) Quit");
	            System.out.println();
	            System.out.print("please select one of the 4 options");
	            System.out.println();
	            System.out.print("your choice:");
	            user_choice = s.nextInt();
	            switch (user_choice) {
	                case 1:
	                    System.out.println("Enter a title");
	                    String title = s.next();
	                    System.out.println("isbn");
	                    String isbn = s.next();

	                    System.out.println("how much does this book cost?");
	                    double price = s.nextInt();
	                    System.out.println("how many of these books are there in stock?");
	                    int stock = s.nextInt();

	                    Book c = new Book(title, isbn, price, stock);
	                    mybookstore.addNewBook(c);

	                    break;
	                case 2:
	                    System.out.println("Selling books:");
	                    System.out.println("Enter the title...");
	                    String an = s.next();
	                    System.out.println("Enter a quantity");
	                    int da = s.nextInt();
	                    mybookstore.sellBook(an, da);
	                    break;
	               
	                case 3:
	                    mybookstore.listBooks();
	                    break;
	                    
	                case 0:
	                	
	                	  System.exit(1);
	              
	                default:
	                    System.out.println("please select from one of the 4 options");

	            }
	        } while (user_choice != '4');
	    }
	}


