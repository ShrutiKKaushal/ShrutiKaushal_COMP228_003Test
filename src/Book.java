
public abstract class Book {
	
	//Instance Variables
	private String title;
	private String ISBN;
	private String publisher;
	private double price;
	private int year;
	
	//Constructor
	public Book(String title, String ISBN, String publisher, double price, int year){
		this.title = title;
		this.ISBN = ISBN;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
	}
	
	//Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Title: %s%n ISBN: %s%n Publisher: %s%n Price: %.2f%n Year: %d%n", getTitle(), getISBN(), getPublisher(),setPrice(price),getYear());
	}
	
	//Abstract Method
		public abstract double setPrice(double price);
		public abstract String getGenre();

}
