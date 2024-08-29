package homeassignment.three;

public class Library {
	
	//Define Method addBook(String bookTitle)
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	//Define a method issueBook()
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library library = new Library();
		
		//call addBook method
		String addedBook = library.addBook("Thirukkural");
		System.out.println("Added Book is "+addedBook);
		
		library.issueBook();
		

	}

}
