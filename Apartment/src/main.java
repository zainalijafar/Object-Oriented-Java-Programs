public class main {

	public static void main(String[]args) {
		
		Apartment studioMan = new Apartment(1,16,5000);
		Apartment durocher = new Apartment(2,38,4300);
		Apartment stanley = new Apartment(3,78,2500);
		
		System.out.println(studioMan.larger(durocher));
		System.out.println(stanley.larger(durocher));
		
		System.out.println(studioMan.priceDiff(durocher));
		System.out.println(stanley.priceDiff(durocher));
		
		System.out.println(studioMan.moreExpThan(durocher));
		System.out.println(stanley.moreExpThan(durocher));
	}
}