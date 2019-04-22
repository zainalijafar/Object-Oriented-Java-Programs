import java.util.*;
public class Team {

	private String teamName; 
	ArrayList<Player> team = new ArrayList<Player>();
	private int maxSize; 
	
	public Team(String teamName) {
		
		this.teamName = teamName;
	//	this.player = new ArrayList<Player>();
	}
	
	public String getName() {
		
		return this.teamName;
	}
	
	public void addPlayer(Player player) {
		
		team.add(player);
	}
	
	public void printPlayers() {
		
		for (Player player : team) {
			
			System.out.println(player);
		}
	}
	
	public int setMaxSize(int maxSize) {
		
		this.maxSize = maxSize;
		
		return maxSize;
	}
	
	public int teamSize() {
		
		int counter = 0;
		
		for (Player player : team) {
			
			if (setMaxSize(this.maxSize)>counter) {
				
				counter ++;
			}
		}
		return counter;
	}
	
	public int noOfGoals() {
		
		int numberofGoals = 0;
		
		for (int i=0; i<team.size(); i++) {
			
			numberofGoals = numberofGoals + team.get(i).getGoals();
		}
		
		return numberofGoals;
	}
}