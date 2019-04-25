import java.util.*;
public class Main {

	public static void main(String[]args) {
		
		HashMap<String, Book> bookCollection = new HashMap<String,Book>();
		
		Book firstBook = new Book("Harry Potter", 1990, " Harry");
		Book secondBook = new Book("Peter Pan ", 1995, " Peter"); 
		
		bookCollection.put(firstBook.getName(),firstBook);
		bookCollection.put(secondBook.getName(),secondBook);
		
		Book book = bookCollection.get("Harry Potter");
		System.out.println(book);
		
		book = bookCollection.get("Harry");
		System.out.println(book);
	}
}