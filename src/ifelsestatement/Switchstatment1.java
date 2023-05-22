package ifelsestatement;

public class Switchstatment1 {

	public static void main(String[] args) {
		
		int number=25;
		
		//switch statement
		//compare the case value to the expression i.e. compare the 50=25 then its false
		// Will any case is not match with expression then default statement get execute
		switch(number) {
		case 50:
			System.out.println("Not Matched, It is 15");
		break;
		case 10:
			System.out.println("Not Matched, It is 10");
			break;	
		case 25:
			System.out.println("Matched, It is 25");
			break;
		case 20:
			System.out.println("Not Matched, It is 20");
			break;
			default:
				System.out.println("Nothing matched");
				
		}
		
		// Printing the above code it will print match and other statement also
		//Break is a jumping statement and its most important stuff in case of switch 
		//if Break statement not found then it will execute the next all statement
		
		
		
	}
	
}
