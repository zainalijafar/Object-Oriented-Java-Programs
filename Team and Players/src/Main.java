public class Main {

	public static void main(String[]args) {
		
		Team barcelona = new Team("FC Barcelona");
//		System.out.println("Team : " + barcelona.getName());
		barcelona.setMaxSize(1);
		
		Player zain = new Player("Zain"); 
//		System.out.println(zain);
		
		Player safder = new Player("Safder", 40);
//		System.out.println(safder);
		
		barcelona.addPlayer(zain);
		barcelona.addPlayer(safder);
		barcelona.addPlayer(new Player("Gul",1));
		
//		barcelona.printPlayers();
		
		System.out.println("Number of players " + barcelona.teamSize());
		
		System.out.println("Total goals for the team " + barcelona.noOfGoals());
	}
}