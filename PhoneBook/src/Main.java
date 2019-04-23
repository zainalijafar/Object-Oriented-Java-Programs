public class Main {

	public static void main(String[]args) {
		
/*		Person pekka = new Person("Pekka Safder ", "514-423-0982");
		
		System.out.println(pekka.getName());
		System.out.println(pekka.getNumber());
		
		System.out.println(pekka);
		
		pekka.changeNumber("514-453-7968");
		System.out.println(pekka);		
*/		
		Phonebook phonebook = new Phonebook();
		
		phonebook.add("Zain Ali", "514-543-2918");
		phonebook.add("Safder Haider", "514-983-9098");
		phonebook.add("Hamza", "514-983-9098");
		
		phonebook.printAll();
		
		String number = phonebook.searchNumber("Ali");
		System.out.println(number);
	}
}