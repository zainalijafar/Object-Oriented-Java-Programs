import java.util.Scanner;

public class GuessingGame {

	private Scanner reader; 
	private String readerNo;
	private int maxQuestions;
	private int qCounter = 1;
	
	public GuessingGame() {
		
		this.reader = new Scanner(System.in);
	}
	
	public void play(int lowerLimit, int upperLimit) {
		
		instructions(lowerLimit,upperLimit);
//		System.out.println("Is your number greater than " + average(lowerLimit,upperLimit));
		while(true){
			
			boolean greaterThan = isGreaterThan(average(lowerLimit,upperLimit));
			
			if (greaterThan) {
				lowerLimit = average(lowerLimit,upperLimit);
				System.out.println("new avg " + lowerLimit);
				
				if(this.qCounter == this.maxQuestions) {
					System.out.println("This is your number " + lowerLimit);
					break;
				}
			} else {
				upperLimit = average(lowerLimit,upperLimit);
				System.out.println("new average " + upperLimit);
				
				if(this.qCounter == this.maxQuestions) {
					System.out.println("This is your number " + (lowerLimit+1));
					break;
				}
			}
			
			this.qCounter ++;
		}
	}
	
	public boolean isGreaterThan(int value) {
		
		boolean check = true;
		System.out.println("Is your number greater than " + value + " value? (y/n) ");
		this.readerNo = reader.nextLine();
		
		if(this.readerNo.equals("y")) {
			
			check = true;
			
		}else if (this.readerNo.equals("n")) {
			
			check = false; 	
		}		
		return check;
	}
	
	public int average(int firstNumber, int secondNumber) {
		
		int sum = firstNumber + secondNumber; 
		int avg = sum/2; 
		
		return avg;
	}
	
	public void instructions(int lowerLimit, int upperLimit) {
		
		 this.maxQuestions = howManyTimesHalvable(upperLimit-lowerLimit);
		
		System.out.println("Think of a number between " + lowerLimit + "...." + upperLimit);
		System.out.println("I promise I can guess the number in " + maxQuestions + " questions");
		System.out.println("Next I ll present you with a series of questions. Answer them honestlyy ");
		System.out.println("");
		
	}
	
	public static int howManyTimesHalvable(int number) {
		
		return (int)(Math.log(number)/Math.log(2)) + 1;
	}
}