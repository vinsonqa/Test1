package datatype;

public class Variable1 {

	int Bali = 500;
	//using the Syntex we can stored the value
	// int =  data type
	// Bali = Variable Name
	// 500 = Variable Value
	// ; = end of the statement

	int Veda=1000; // Global Variable
	
	public static void main(String[] args) {
		
		
		int data = 100;
		//in is the data type, data is the variable name. 100 is the variable value
		
		System.out.println("The value is x" + data);
		
		int a= 10; // Local variable
		System.out.println(a);
		
		a = 20;
		System.out.println(a);
		
		a= 30;
		System.out.println(a);
		
//		boolean test=true;
//		boolean test1=false;
//		System.out.println(test);
//		System.out.println(test1);
		
		// in the above code we cannot use any data type but in we can use the immediate Data type
		// Overwrite the old value to new value
		
		
		char aa='T';
		System.out.println(aa);
		
		String Name = "Java is the basic framework to automate the browser";
		System.out.println(Name);
		
		//String always define in double quote and Char will always define in single quote
		 
	}
	
	int b= 20; // Global Variable
}
