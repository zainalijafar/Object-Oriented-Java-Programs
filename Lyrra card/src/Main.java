public class Main {

	public static void main(String[]args) {
		
		CashRegister lahoreCafe = new CashRegister();
		System.out.println(lahoreCafe);
		
		
//		double theChange = lahoreCafe.payEconomical(10);
//		System.out.println("the change was " + theChange);
		
		LyyraCard cardOfZain = new LyyraCard(2);
		
		
		System.out.println("the card balance " + cardOfZain.balance() + " pkr");
		
		boolean succeed = lahoreCafe.payGourmetlly(cardOfZain);
		System.out.println("payment success : " + succeed);
		
		lahoreCafe.loadMoneyToCard(cardOfZain, 100);
		System.out.println("the new balance is " + cardOfZain.balance());
//		System.out.println(cardOfZain.balance());
		succeed = lahoreCafe.payGourmetlly(cardOfZain);
		System.out.println("payment success : " + succeed);
		
		System.out.println("the card balance : " + cardOfZain.balance() + " pkr");
		
//		System.out.println(cardOfZain.balance());
//		succeed = lahoreCafe.payEconomically(cardOfZain);
//		System.out.println("payment success : " + succeed);
		
/*		theChange = lahoreCafe.payEconomical(5);
		System.out.println("the change was " + theChange);
		
		theChange = lahoreCafe.payGourmet(4);
		System.out.println("the change was " + theChange);
		
		System.out.println(lahoreCafe);
		
		
/*		LyyraCard cardOfPekka = new LyyraCard(10);
		
		System.out.println("money on the card " + cardOfPekka.balance());
		boolean succeed = cardOfPekka.pay(8);
		System.out.println("money taken : " + succeed);
		System.out.println("money on the card " + cardOfPekka.balance());
		
		succeed = cardOfPekka.pay(4);
		System.out.println("money taken : " + succeed);
		System.out.println("money on the card " + cardOfPekka.balance());
*/	}
}