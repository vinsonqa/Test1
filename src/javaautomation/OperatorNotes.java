package javaautomation;

public class OperatorNotes {
/*
 * OPERATOR
 * 
 * # Operator is symbol that used to perform operation
 * 
 * Types:-
 * 1. Unary Operator :- Expr ++ (post increment) , Expr-- (post decrement) , ++Expr (pre increment) , --Expr (pre decrement)
 * 2. Arithmetic Operator :-  +,/,*,-, etc
 * 3. Relational Operator :-  =,<,>,=<,>=
 * 4. Logical Operator:- &&
 * 5. Bitwise Operator :- &
 * 6. Assignment Operator:- +=, -=, *=, /=
 *
 */
	
	/*
	 * Unary Operator
	 * 
	 * 1. Post increment ( Expr++ , expr--)
	 * ## It will execute the logic first and increment the value by 1
	 * 
	 * ex. int i=1;
	 * syso(i++) // print 1 and  backend will store 1+1=2
	 *  syso(i) //print the backend value i.e.2
	 *  
	 *  int i=2;
	 *  syso(i++) // print 2 andd backend will store 2+1=3
	 *  syso(i) // print the latest value of the i i.e. 3
	 *  syso(i++)// 3  backend 4
	 *  syso(i++)// 4  backend 5
	 *  syso(i) // 5
	 *  syso(i++) // 5 backend 6
	 *  syso(i++) // 6 backend 7
	 * syso (i) //7
	 * syso(i) //7
	 * 
	 * 
	 * 2. Pre Increment ( ++Expr , --expr)
	 * ## First it will increment the value and then execute the logic
	 * 
	 * ex- int z=9;
	 * syso(++z) // it will print the value i.e.10 
	 * 
	 * ex. int u=8
	 * syso(++u) //9
	 * 
	 *  int p=u //9
	 *  syso(u); //9
	 *  syso(p); //9
	 * 
	 * ex- int i=2
	 * syso(i++); //2 backend 3
	 * syso(i); //3
	 * syso(++i); //4
	 * syso(i--); //4 backend 3
	 * syso(--i); //2
	 * syso(i); //2
	 * 
	 */
	
	/*
	 * Logical Operator (&&) and Bitwise Operator (&)
	 * ## (&&)- The Logical && operator doesnot check the second condition
	 * 
	 * Note:- First condition is true  and Second condition is False then output will true
	 * First condition is false  and Second condition is true then output will false
	 * First condition is False  and Second condition is False then output will False
	 * First condition is True  and Second condition is true then output will true
	 * 
	 * ## (&) - The Bit wise & Operator always check both condition whether first condition is true or false
	 * 
	 * Note:- First condition is true  and Second condition is False then output will false
	 * First condition is false  and Second condition is true then output will false
	 * First condition is False  and Second condition is False then output will False
	 * First condition is True  and Second condition is true then output will true
	 *  
	 */
	
	/* Relational Operator
	 * ## In java there is 6 relational operator, compare the two number and return the boolean value
	 * ## <, >, <=, >=, ==, != etc
	 * 
	 * 1. x<y 5<10	true	5<2 False
	 * 1. x>y 5<10	false	5>2 True
	 * 1. x<=y 5<10	false	5<=6 true
	 * 1. x>=y 5>=10 false	12>=10 true
	 * 1. x==y 5==5 true	5==10 false
	 * 1. x!=y 5!=10 true	5!=5 false
	 * 
	 * 
	 * if(condition){
	 *	// executable code for if block
	 * }
	 * else{
	 * 	//	executable code for else block
	 * }
	 *  
	 *  e.x
	 *  if(5<4){
	 * 	System.out.println("true") //this statement get printed
	 *   }
	 *   else{
	 *   System.out.println("false")
	 *   }
	 *   
	 *   Note:- 
	 *   1. == :- it is used to compare the number only
	 *   2. equals() :- it used to compare the string but it compare each character including the upper case and lower case letter
	 *   3. equalsIgnorecase() :- it used to compare the string but it compare each character excluding the upper case and lower case letter
	 *   
	 *   
	 */
	
}
 