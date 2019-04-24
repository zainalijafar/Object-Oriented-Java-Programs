import java.util.*;
public class Library {

	private ArrayList<Book> books;
	private ArrayList<Book> found;
	
	public Library() {
		
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book newBook) {
		
		books.add(newBook);
	}
	
	public void printBooks() {
		
		for (Book b: books) {
			
			System.out.println(b);
		}
	}
	
	public ArrayList<Book> searchByTitles(String title){
		
		this.found = new ArrayList<Book>();
		
		for (int i=0; i<books.size(); i++) {
			
			if(books.get(i).title().contains(title)){
				
				this.found.add(books.get(i));
			}
		}
		
		return this.found;
	}
	
	public ArrayList<Book> searchByPublisher(String title){
		
		this.found = new ArrayList<Book>();
		
		for (int i=0; i<books.size(); i++) {
			
			if (books.get(i).publisher().contains(title)) {
				
				this.found.add(books.get(i));
			}
		}
		
		return this.found;
	}
	
	public ArrayList<Book> searchByYear(int year){
		
		this.found = new ArrayList<Book>();
		
		for (int i=0; i<books.size(); i++) {
			
			if (books.get(i).year() == year) {
				
				this.found.add(books.get(i));
			}
		}
		
		return books;
	}
}