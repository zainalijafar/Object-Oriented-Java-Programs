public class Player {

	private String name; 
	private int numberGoals;
	
	public Player(String name) {
		
		this.name = name;
	}
	
	public Player(String name, int numberGoals) {
		
		this.name = name; 
		this.numberGoals = numberGoals;
	}
	
	public String toString() {
		
		return this.name + " , goals " + this.numberGoals; 
	}
	
	public int getGoals() {
		
		return this.numberGoals;
	}
}