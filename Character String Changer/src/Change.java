public class Change {

	private char fromCharacter;
	private char toCharacter; 
	
	public Change(char fromCharacter, char toCharacter) {
		
		this.fromCharacter = fromCharacter; 
		this.toCharacter = toCharacter;
		
	}
	
	public String change(String characterString) {
		
		String newString = "";
		
		for (int i=0; i<characterString.length(); i++) {
			
			if (characterString.charAt(i) == this.fromCharacter) {
				
				newString = newString + this.toCharacter;
				
			}else {
				
				newString = newString + characterString.charAt(i);
			}
		}
		
		return newString;
	}
}