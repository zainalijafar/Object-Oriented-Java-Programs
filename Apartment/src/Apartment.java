public class Apartment {

	private int rooms; 
	private int squareMeters; 
	private int pricePerSquareMeter;
	
	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}
	
	public boolean larger(Apartment otherApt) {
		
		if (this.squareMeters>otherApt.squareMeters) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public int priceofApt() {
		
		return this.squareMeters*this.pricePerSquareMeter;
		
	}
	public int priceDiff(Apartment otherApt) {
		
		int diff = priceofApt() - otherApt.priceofApt();
		
		return Math.abs(diff);
	}
	
	public boolean moreExpThan(Apartment otherApt) {
		
		if (priceofApt()>otherApt.priceofApt()) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
}