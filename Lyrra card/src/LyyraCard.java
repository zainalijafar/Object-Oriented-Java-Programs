public class LyyraCard {

	private double balance;
	
	public LyyraCard(double balance) {
		
		this.balance = balance;
	}
	
	public double balance() {
		
		return this.balance;
	}
	
	public void loadMoney(double amount) {
		
		this.balance += amount;
	}
	
	public boolean pay(double amount) {
		
		if(amount>this.balance) {
			
			return false;
			
		}else {
			
			this.balance = this.balance - amount;
			return true;
		}
	}
}