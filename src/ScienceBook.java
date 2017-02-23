
public class ScienceBook extends Book {

	private String genre;
	//Constructor
	public ScienceBook(String title, String ISBN, String publisher, double price, int year, String genre) {
		super(title, ISBN, publisher, price, year);
		this.genre = genre;
	}
	
	
	@Override
	public double setPrice(double price) {
		// TODO Auto-generated method stub
		double discount = (price * .1);
		price -= discount;
		return price;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return this.genre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%n Genre: %s",super.toString(),getGenre());
	}
}
