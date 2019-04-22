public class CashRegister {

	private double cashInRegister;
	private int economicalSold;
	private int gourmetSold;
	
	public CashRegister() {
		
		this.cashInRegister = 1000;
	}
	
	public double payEconomical(double cashGiven) {
		
		if (cashGiven>=2.50) {
			
			this.cashInRegister += cashGiven;
			this.economicalSold ++;
			
			return cashGiven - 2.50;
			
		}else {
			
			return cashGiven;
		}
	}
	
	public double payGourmet(double cashGiven) {
		
		if (cashGiven>=4.0) {
			
			this.cashInRegister += cashGiven;
			this.gourmetSold ++; 
			
			return cashGiven - 4.0;
			
		}else {
			
			return cashGiven;
		}
	}
	
	public boolean payEconomically(LyyraCard card) {
		
		if (card.balance()>=2.50) {
			
			this.economicalSold++;
			card.pay(2.50);
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public boolean payGourmetlly(LyyraCard card) {
		
		if (card.balance()>=4.0) {
			
			this.gourmetSold++;
			card.pay(4.0);
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public void loadMoneyToCard(LyyraCard card, double sum) {
		
		if(sum>0) {
			
			card.loadMoney(sum);	
		}
	}
	
	public String toString() {
		
		return "money in register " + cashInRegister + " economical lunches sold : " + economicalSold + " gourmet lunches sold : " + gourmetSold;
	}
}