import java.util.*;

public class Suitcase {
	
	private int maxWeight;
	private ArrayList<Thing> things = new ArrayList<>(); 
	private int thingsCount; 
	private int totalWeight = 0;
	
	public Suitcase(int maxWeight) {
		
		this.maxWeight = maxWeight;
	//	this.things = new ArrayList<Thing>();
	}
	
	public void addThings(Thing thing) {
		
		this.totalWeight = this.totalWeight + thing.getWeight();
		
		if (this.totalWeight<this.maxWeight) {
			
			this.things.add(thing);
			this.thingsCount++;
		}
	}
	
	public void printThings() {
		
		for (Thing t : this.things) {
			
			System.out.println(t);
		}
	}
	
	public int getTotalWeight() {
		
		return this.totalWeight;
	}
	
	public Thing getHeaviest() {
		
		Thing heaviestObj = null;
		
		int heaviest = this.things.get(0).getWeight();
		
		for (int i=1; i<this.things.size(); i++) {
			
			if (this.things.get(i).getWeight()>heaviest) {
				
//				heaviest = this.things.get(i).getWeight();
				heaviestObj = this.things.get(i);
			}
		}
		return heaviestObj;
	}
	
	public String toString() {
		
		if (this.thingsCount == 0) {
			
			return "empty " + " (" + Integer.toString(this.totalWeight) + " kg )";
		}
		return Integer.toString(this.thingsCount) + " things " + " (" + Integer.toString(this.totalWeight) +  " kg )";
	}
}