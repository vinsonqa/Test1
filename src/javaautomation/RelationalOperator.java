package javaautomation;

	public class RelationalOperator {
	
		public static void main(String[] args) {
			
			int x=300;
			int y=200;
			String p = "Selenium class";
			String q = "selenium Class";
			
			
			System.out.println(x>y);
			System.out.println(x<y);
		
		//1st way comparison
		if(x==y) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
		// above code return false Because 300 is not equal to 200 

	
		//2nd way of comparison
		//String is the pre-defined class in java class having 2 properties 
		if(p.equals(q)) {
			System.out.println("True");
		}
		else {
			System.out.println("flase");
		}
		// it used to compare the string but it compare each character including the upper case and lower case letter
	
		if(p==q) {
			System.out.println("True");
		}
		else {
			System.out.println("flase");
		}
		//Condition will false because it find to compare the number in the condition
		
		//3rd Way of comparison
		if(p.equalsIgnoreCase(q)) {
			System.out.println("3rd way right");
		}
		else {
			System.out.println("3rd way wrong");
		}
		//It will execute the If block because it will ignore the upper and lower case letter checking only content
	}
	
}
