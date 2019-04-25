import java.util.*;

public class Dictionary {

	private HashMap<String,String> definition = new HashMap<String,String>();
	private int amountOfWords = 0;
	private ArrayList<String> translations = new ArrayList<String>();
	
	public String translate(String word) {
	
		String translation = this.definition.get(word);
		return translation;
	}
	
	public void add(String word, String translation) {
		
		this.definition.put(word, translation);
		this.amountOfWords++;
	}
	
	public int amountOfWords() {
		
		return this.amountOfWords;
	}
	
	public ArrayList<String> translationList(){
		
		for (String key : this.definition.keySet()) {
			
			this.translations.add(key + " = " + this.definition.get(key));
		}
		return this.translations;
	}
}