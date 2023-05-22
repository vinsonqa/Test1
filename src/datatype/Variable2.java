package datatype;

public class Variable2 {

	int data=70; // Global variable
	
	//int ab = 50; // Global Variable
	static int ab = 100; // Static global  variable
	
	public static void main(String[] args) {		
		int s = 100; //local Variable
		System.out.println(s);
	
//		static int ss=1000;
//		//We cannot declare local variable as Static 

		
		String Anna= "Chinnaswami muthuswami venu gopala aayer";
		System.out.println(Anna);
	}
	//user defined method where creating our own method body
	public void a() {
		int b=100; //Local Variable
		System.out.println(b);
		
	}
	
	public void b() {
		int c=1020; //Local Variable
		System.out.println(c);
	}
	
	
	
}
