public class Book {

	private String name;
	private String contents; 
	private int pubYear; 
	
	public Book(String name, int pubYear, String contents) {
		
		this.name = name; 
		this.pubYear = pubYear; 
		this.contents = contents; 
	}
	
	public String getName() {
		
		return this.name; 
	}
	
	public void setName(String name) {
		
		this.name = name; 
	}
	
	public int getPublishingYear() {
		
		return this.pubYear;
	}
	
	public void setPublishingYear(int pubYear) {
		
		this.pubYear = pubYear;
	}
	
	public String getContents() {
		
		return this.contents;
	}
	
	public void setContents(String contents) {
		
		this.contents = contents; 
	}
	
	public String toString() {
		
		return "Name : " + this.name + " (" + this.pubYear + ")" + " Contents " + this.contents;
	}
}
