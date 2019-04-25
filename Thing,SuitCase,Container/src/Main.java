public class Main {

	public static void main(String[]args) {
		
/*		Thing book = new Thing("Harry Potter ", 2);
		Thing mobile = new Thing("Nokia 3310 ", 1);
		Thing brick = new Thing("Brick ", 4);
		
//		System.out.println("Book name : " + book.getName());
//		System.out.println("Book weight : " + book.getWeight());
		
//		System.out.println("Book : " + book);
//		System.out.println("Mobile : " + mobile);
		
		Suitcase zainsCase = new Suitcase(10);
		zainsCase.addThings(book);
		zainsCase.addThings(mobile);
		
		Suitcase safdersCase = new Suitcase(10);
		safdersCase.addThings(brick);
		
		Container container = new Container(1000);
		container.addSuitCase(zainsCase);
		container.addSuitCase(safdersCase);
		
//		System.out.println(container);
		
		System.out.println("The suitcase contains "); 
		container.printThings();
		
//		suitcase.addThings(book);
//		suitcase.addThings(mobile);
//		suitcase.addThings(brick);
		
//		System.out.println("Your suitcase contains the following : ");
//		suitcase.printThings();
//		System.out.println("Total weight : " + suitcase.getTotalWeight() + " kg");
		
//		Thing heaviest = suitcase.getHeaviest();
//		System.out.println("The heaviest thing : " + heaviest); */
		
		Container container = new Container(1000);
		addSuitCasesFullOfBricks(container);
		System.out.println(container);
	}
	
	public static void addSuitCasesFullOfBricks(Container container) {
		
		for (int i=1; i<101; i++) {
			
			Thing brick = new Thing("Brick",i);
			Suitcase suitcase = new Suitcase(10);
			suitcase.addThings(brick);
			container.addSuitCase(suitcase);
		}
	}
}