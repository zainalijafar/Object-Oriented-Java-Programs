import java.util.Scanner; 
import java.util.*;

public class Main {

	public static void main(String[]args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		String iD = input.nextLine();
		
		while(!name.equals("")) {
			
			Student newStudent = new Student(name,iD);
			list.add(newStudent);
			name = input.nextLine();
			iD = input.nextLine();
		}
		
		for (Student s : list) {
			
			System.out.println(s);
		}
		
		
/*		Student zain = new Student("Zain Ali ", "260605943");
		System.out.println("name : " + zain.getName());
		System.out.println("studentnumber: " + zain.getStudentNum() );
		
		Student safder = new Student("Safder Haider ","2606043291");
		System.out.println("name : " + safder.getName());
		System.out.println("studentnumber: " + safder.getStudentNum() );
		
		Student gul = new Student("Abdul Rehman ", "2606954123");
		System.out.println("name : " + gul.getName());
		System.out.println("studentnumber : " + gul.getStudentNum());
		
		System.out.println(zain);
		System.out.println(safder);
		System.out.println(gul);
*/	}
	
}