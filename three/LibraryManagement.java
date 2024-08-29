package homeassignment.three;

public class LibraryManagement {

	public static void main(String[] args) {
		Library library = new Library();
		
		String addedBook = library.addBook("Silapathigaram");
		System.out.println("Added Book is " + addedBook);
		
		library.issueBook();

	}

}
