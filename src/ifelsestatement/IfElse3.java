package ifelsestatement;

public class IfElse3 {
		
	//Nested If statement
	//# It represent the if block within another if block
	//# Concept run on the  basis of inner and outer if block
	//# The Inner if block condition will be execute where outer if block condition is true
	
	public static void main(String[] args) {
		
		int age=25; //local
		int weight=40; //local
		
		//outer if block
		
		if(age>25){
			//inner if block
			if(weight==50) {
				System.out.println("eligable for Donation");
			}
			else {
				System.out.println("Not eligable for Donation");
			}
			}
		else {
			System.out.println("age is must be greater then 18");
			}
		
	}
	
}
