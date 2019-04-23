public class Person {

	private String name; 
	private String phoneNo; 
	
	public Person(String name, String phoneNo) {
		
		this.name = name; 
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		
		return this.name; 
	}
	
	public String getNumber() {
		
		return this.phoneNo;
	}
	
	public void changeNumber(String newNumber) {
		
		this.phoneNo = newNumber;
	}
	
	public String toString() {
		
		return this.getName() + " number : " + this.getNumber();
	}
}