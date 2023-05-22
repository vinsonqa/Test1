package datatype;

public class Datatype_Variable_Notes {
	
	//Data types
	
	/*--> Data structure means organising the data in the memory
	 * # there are two types
	 * 1. Primitive Data Type:- boolean,char,int,float,double,short,long,byte
	 * 2. Non Primitive Data Type	:- String, Array etc.
	 * 
	 * 
	 *  Primitive Data Type:-
	 * Size of the Primitive data type (8bit = 1byte)
	 * 1. Byte = 8 bit = 1 byte
	 * 2. short = 16 bit = 2 byte
	 * 3. int = 32 bit = 4 byte
	 * 4. long = 64 bit = 8 byte
	 * 5. char = 16 bit = 2 byte
	 * 6. float = 32 bit = 4 byte
	 * 7. double= 64 bit = 8 byte
	 * 8. Boolean= 1bit = less then 1 byte always return True and false
	 
	 * 
	 * Difference between Primitive and Non-primitive Data type
	 *  Primitive data type will be start with lower case
	 *  Non-primitive data type will be start with upper case  
	 *  Size is fixed for the primitive data type
	 *
	 *
	 */
	
	
	
	/* Variable
	 *  --> Variable is the container which contains the data
	 * # Data types gives different size and value that can store in variable
	 * # Variable is hold the value while Java program execute.
	 * # A Variable should be assigned with Data type
	 * 
	 * Syntex of declaring the variable
	 * 				dataType variableName = variableValue;
	 * 		ex. 	int a=50;
	 * 		//String always use double quote
	 * 		ex. String s= "Baliraj";
	 * 
	 * 
	 *  ex. String anna = "Chinnaswami muthuswami venu gopala aayer"
	 *  
	 *  String always define in double quote and Char will always define in single quote
	 * 
	 *Create a new class and understand the above module then after understand the below module
	 * 
	 * Types of variable
	 * 
	 * 1. Local variable:- A Variable declare inside the method body is called as local variable
	 * For. Ex. Main method,  user defined method
	 * 
	 * 2. Global Variable :- A variable declare inside the class body but outside the method body
	 * is called as global variable
	 * 
	 * 3. Static Variable :- A variable which is declare as a static is called as a static variable
	 * or Static Global Variable
	 * If we called static in the method body then it shows error message
	 *We cannot declare local variable as Static 
	 *
	 *
	 *Variable3 notes
	 *
	 * When we run as a java then it shows only main method code in the console
	 * 
	 * 
	 * Memory Location 
	 *1Local variable
	 *# they get memory respected to method so they are called as Method variable
	 *# Local variable get memory location when method is called so their creation statement is executed
	 *	syntex
	 *
	 * 
	 *
	 *
	 *2.Global Variable
	 *#they get  memory location when object creation using the "new" keyword
	 *# They get memory with respect to object so they are called as Object Variable
	 *
	 *		*******Create Object class
	 * syntax :- ClassName refName= new className();
	 *  Variable3 data=new variable3();
	 * 	
	 *3. Static Global Variable
	 * #static variable get memory when class is loaded ino JVM so they get memory with respect to class name
	 * they are also called as Class variable
	 * Static variable will always called with class name
	 * Syso(Variable3.c);
	 * 
	 */
	
	
	/*
	 * Limitation of the Primitive Data Type
	 * 
	 * ## By using primitive data type we cannot store multiple value in continuous memory location
	 * ex. int raj= 1,2,4,5,6; //it will store only single value
	 * 
	 * ## Size is fixed in the primitive data type 
	 * 
	 */
	
	
	/*
	 * Non-primitive data type
	 * # In java array is non-primitive data type
	 * # it is used to store fixed number of multiple value of same data type in continuous memory location
	 * syntax - datType[]  variableName={Variablevalue1,Variablevalue2......nVariableValue};
	 * 
	 *Fore.x int[] b= {1,2,3,4,5,6,7,8,9,10};// size is 10
	 *
	 *			1	2	3	4	5	6	7	8	9	0
	 *index		0	1	2	3	4	5	6	7	8	9
	 *
	 *	
	 *Note:- Index will always start with 0
	 *
	 * ex. int[] a={234,456,245,643,2222} // what the size of array //5
	 *	What is the index of 245 //2
	 *what is the index of 2222 //4
	 *
	 *ex. 1 to 385 value are there then what is the last index //384 
	 *
	 *
	 */
}
