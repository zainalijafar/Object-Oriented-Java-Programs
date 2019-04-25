import java.util.*;

public class Container {
	
	private int maxWeight;
	private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
	private int suitCases = 0;
	private int containerWeight = 0;
	
	public Container(int maxWeight) {
		
		this.maxWeight = maxWeight;
	}
	
	public void addSuitCase(Suitcase suitcase) {
		
		this.containerWeight = this.containerWeight + suitcase.getTotalWeight();
		
		if (this.containerWeight < this.maxWeight) {
			
			this.container.add(suitcase);
			this.suitCases++;
		}
	}
	
	public void printThings() {
		
		for (Suitcase s : container) {
			
			s.printThings();
		}
	}
	
	public String toString() {
		
		return this.suitCases + " suitcases (" + this.containerWeight + " kg)";
	}
}