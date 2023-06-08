package datatype;

public class Variable4 {
	
	int[] b = {2,3,4,5,6};
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		//size of array 5
		
		System.out.println(a[0]);
		// this will return the 0 index i.e. 1
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[9]);
		
		Variable4 v4=new Variable4();
		System.out.println(v4.b[3]);
		//Limitation of Array
		/*
		 * ## Size of array is also fixed that is we mentioned the last size (it will not allowed to retrieve the value more then it size
		 * in the above code size is 5  
		 * if we called the more then the size then it shows error message "Index 9 out of bounds for length 5"
		 *
		 * ## Array is collection of similar data type i.e. integer array can't store the string
		 * int[] aa= {1,2,3,4,5,"Bali"};
		   error message :- Type mismatch: cannot convert from String to int
		 * 
		 */
		
		
		String[] s= {"Veda","Denny","Trilok","Peter","Angelo"};
		System.out.println(s[2]);
		System.out.println(s[1]);
		System.out.println(s[5]);
}
		
}
