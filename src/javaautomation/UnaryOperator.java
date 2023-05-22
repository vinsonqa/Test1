package javaautomation;

public class UnaryOperator {
	
	public static void main(String[] args) {
		
		int a=10;// local variable
		int b=11;// local variable
		
		System.out.println(a++); //10 Backend 11
		System.out.println(a); //11
		
		System.out.println(a++ + ++a); //(11 + 13) = 24
		// 11 will be the latest value i.e.11 and backend will be 12  +  (1+12)=13
		System.out.println(a); // Latest value of a is 13
		System.out.println(a + a++); // 13 + 13 =26
		//  13 will be the latest value  and 13 will execute and backend will be 14  +  (1+12)=13
		System.out.println(a);// Latest value will be 14
		
		System.out.println(b++ + --b); // It will print 22 value
		//value of b is 11 and backend will store 12 + (12-1)i.e 11 =22 
		
		System.out.println(b++ + b--); // it will print 23
		//Value is 11 and backend will be 12 + latest value is 12 and backend will store 11 = 23
		
		System.out.println(b);//11
		
		System.out.println(a++ + ++a - b++ + ++b); //14+16-11+13 = 30-11 = 19+13=32
		System.out.println((a++ + ++a) - (b++ + ++b));//(16 + 18) - (13+ 15) = 34-28 = 6
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
