package datatype;

public class Variable3 {
	
	int b=10; //Global variable
	static int a =1009; // Static global variable
	
	//user defined method
	public void aa() {
		int c1 = 222;//local variable
		System.out.println(c1);
	}

	public static void main(String[] args) {
		int data=109; //local variable
	System.out.println(data);
	
	
	// create object of class name
	//syntax :- ClassName refName= new className();
	Variable3 v3=new Variable3();
	System.out.println(v3.b);
//	System.out.println(v3.a);
	v3.aa();
	
	System.out.println(Variable3.a);
	// Static variable will called with the class name not for object
	
	}
}


