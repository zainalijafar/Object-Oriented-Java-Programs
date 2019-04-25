import java.util.*;

public class Main {

	public static void main(String[]args) {
		
/*		Dictionary dictionary = new Dictionary();
		dictionary.add("Soleil", "Sun");
		dictionary.add("Lune", "Moon");
		
		System.out.println(dictionary.amountOfWords());
		dictionary.add("Terre", "Earth");
		
		System.out.println(dictionary.translate("Soleil"));
		System.out.println(dictionary.translate("Lune"));
		
		System.out.println(dictionary.amountOfWords());
		
		ArrayList<String> translations = dictionary.translationList();
		
		for (String translation : translations) {
			
			System.out.println(translation);		
		}
		
		*/
		
		Scanner reader = new Scanner(System.in);
		Dictionary dict = new Dictionary();
		
		TextUserInterface ui = new TextUserInterface(reader,dict);
		ui.start();
	}
}
