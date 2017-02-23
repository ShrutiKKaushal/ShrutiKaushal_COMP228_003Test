
import javax.swing.JOptionPane;

public class BooksTest {

	public static void main(String[] args) 
	{

		Book[] BookArray = new Book[2]; //Book array
		int control = 0; //Control variable

		//Loop through array to create objects
		
		while (control < BookArray.length) {
				//Getting values from end user
				
				String genre = JOptionPane.showInputDialog("Enter the Genre of the Book: Science or Children");
				String title = JOptionPane.showInputDialog("Enter the Title");
				String ISBN = JOptionPane.showInputDialog("Enter the ISBN");
				String publisher = JOptionPane.showInputDialog("Enter the Name of Publisher");
				double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the Price"));
				int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the Year"));
					
				//Genre Sciene
					if (genre.toLowerCase().equals("science")) {
						ScienceBook scienceBook = new ScienceBook(title, ISBN, publisher, price, year, genre); //Creating health object
						BookArray[control] = scienceBook;
						control++;
					} else {
					//Genre Children
						
						if (genre.toLowerCase().equals("children")) {
							ChildrenBook childrenBook = new ChildrenBook(title, ISBN, publisher, price, year, genre); //Creating life object
							BookArray[control] = childrenBook;
							control++;
						}

						else{
							JOptionPane.showMessageDialog(null, "Type of Book unknown by the system! Try again");
						}
				int i = 0;
						
				for(Book BookItem : BookArray){
						
					JOptionPane.showMessageDialog(null, "Book object: "+i+"\n"+BookItem.toString(), "Display Information", 1);
					i++;
					}
		}
		//Loop through array to display information
		
		
		}
	}
}

	
	
	
	
	
	
	
	