import java.util.*;
public class TextUserInterface {
	
	private Scanner reader;
	private Dictionary dictionary;
	private String input; 
	
	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		
		this.reader = reader; 
		this.input = this.reader.nextLine();
		this.dictionary = dictionary;
	}
	
	public void start() {
		
		while(true) {
			
			if (this.input.equals("quit")) {
				
				System.out.println("Cheers!");
				break;
				
			}else if (this.input.equals("add")) {
				
				System.out.println("In French : ");
				String word = this.reader.nextLine();
				System.out.println("In English : ");
				String translation = this.reader.nextLine();
				this.dictionary.add(word,translation);
				System.out.println("Statement : ");
				this.input = this.reader.nextLine();
				
			}else if (this.input.equals("translate")) {
				
				System.out.println("Give the word you want to translate");
				String nextWord = this.reader.nextLine();
				System.out.println("Translation : " + this.dictionary.translate(nextWord));
				System.out.println("Statement : ");
				this.input = this.reader.nextLine();
			}
		}
	}
}