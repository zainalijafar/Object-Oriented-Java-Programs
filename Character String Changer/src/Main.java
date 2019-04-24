public class Main {

	public static void main(String[]args) {
		
/*		String word = "carrot";
		
		System.out.println(word);
		Change change1 = new Change('a','b');
		
		String newWord = change1.change(word);
		
		System.out.println(newWord);
		
		Change change2 = new Change('r','x');
		
		String newWord1 = change2.change(word);
		
		System.out.println(newWord1); */
		
		Changer scandies = new Changer();
		
		scandies.addChange(new Change('a','Z'));
		scandies.addChange(new Change('n', 'A'));
		
		System.out.println(scandies.change("zain"));
	}
}