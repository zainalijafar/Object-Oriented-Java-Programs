import java.util.*;

public class Changer {

	private ArrayList<Change> changes; 
	private String newCharacter;
	
	public Changer() {
		
		this.changes = new ArrayList<Change>();
		 
//		this.newCharacter = newCharacter;
	}
	
	public void addChange(Change change) {
		
		this.changes.add(change);
	}
	
	public String change(String newCharacter) {
		
		this.newCharacter = newCharacter;
		
		for (int i=0; i<this.changes.size(); i++) {
			
			this.newCharacter = this.changes.get(i).change(this.newCharacter);
		}
		
		return this.newCharacter;
	}
}