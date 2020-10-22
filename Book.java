package day2_hcl_assgn_bookapp;

public class Book {
	
	    private String title;
	    private String isbn;
	    private double price;
	    private int quantity;

	    public Book(String theTitle, String isbn, double cost, int num) {
	        title = theTitle;
	        this.isbn=isbn;
	        price = cost;
	        num = quantity;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public double getPrice() {
	        return price;
	    }

	    public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getQuantity() {
	        return quantity;
	    }
	    public String toString() {
	        return "Title:" + title + "\nisbn: " + isbn + "\nPrice:" + price + "\nquantity left:" + getQuantity();
	    }

	    public void subtractQuantity(int quantity) {
	        this.quantity-= quantity ;
	        setQuantity(this.quantity);
	    }

		public void addQuantity(int quantity) {
			// TODO Auto-generated method stub
			 this.quantity+= quantity;
			setQuantity(this.quantity);
		}
	}
