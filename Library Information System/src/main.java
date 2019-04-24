import java.util.*;
public class main {

	public static void main(String[]args) {
		
		Book cheese = new Book("Cheese Problems ", "Oxford Publishers ", 2012);
		
		System.out.println(cheese.title());
		System.out.println(cheese.publisher());
		System.out.println(cheese.year());
		
		System.out.println(cheese);
		
		Library library = new Library();
		
		Book nhl = new Book("NHL hockey ", " Stanley Cup ", 1945);
		
		library.addBook(nhl);
		
		library.addBook(new Book("Harry Potter ", " JK Rowling", 1999));
		
		library.printBooks();
		
		ArrayList<Book> result = library.searchByTitles("NHL");
		
		for (Book book : result) {
			
			System.out.println(book);
		}
		
		ArrayList<Book> result1 = library.searchByPublisher("JK");
		
		for (Book book : result1) {
			
			System.out.println(book);
		}
		
		ArrayList<Book> result2 = library.searchByYear(1999);
		
		for (Book book : result2) {
			
			System.out.println(book);
		}
	}
}