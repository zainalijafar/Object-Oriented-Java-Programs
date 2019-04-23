import java.util.*;

public class Phonebook {

	private ArrayList<Person> list = new ArrayList<Person>();
	
	public void add(String name, String number) {
		
		Person person = new Person(name, number);
		list.add(person);
	}
	
	public void printAll() {
		
		for (Person p : list) {
			
			System.out.println(p);
		}
	}
	
	public String searchNumber(String name) {
		
		for (Person p : list) {
			
			if(p.getName() == name) {
				
				return "found";
			}
		}
		
		return "not found";
	}
}