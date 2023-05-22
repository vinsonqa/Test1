package ifelsestatement;

public class IfElse2 {

	public static void main(String[] args) {
		
		//If else if ladder statement
		//in this check one condition from multiple statement
		
		int q=400;
		int w=300;
		
		if(q<w) {
			System.out.println("q is lesser");
		}
		else if(q==w) {
			System.out.println("q is equal");
		}
		else {
			System.out.println("Q is greater");
		}
		
		
		if(q <= w) {
			System.out.println("q is lesser");
		}
		else if(q+q++==w) {
			System.out.println("Test");
		}
		else if(q>w) {
			System.out.println("q is equal");
		}
		else {
			System.out.println("Q is greater");
		}
		
		
	}
}
