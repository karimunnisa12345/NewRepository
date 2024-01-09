package javaBasics;

public class DataTypeDemo {

	//fundamental datatypes declaration and initialization	
	byte b=10;  // all these variables are instance variables
	short sh;
	static int i=100; // i is a static variable
	long ln=567l;
	
	float fa=3.1417f;
	double db=123.56578d;
	
	char ch='a';
	
	boolean bl;
	
	public static void main(String[] args) {
	
		DataTypeDemo obj1=new DataTypeDemo();
		System.out.println(obj1);   // javaBasics.DataTypeDemo@4517d9a3
		
		DataTypeDemo obj2=new DataTypeDemo();
		System.out.println(obj2);  // javaBasics.DataTypeDemo@372f7a8d

		System.out.println(obj1.b);
		System.out.println(obj1.sh);
		System.out.println(obj1.i);
		System.out.println(obj1.ln);
		System.out.println(obj1.fa);
		System.out.println(obj1.db);
		System.out.println(obj1.ch);
		System.out.println(obj1.bl);
		
		System.out.println(DataTypeDemo.i);
		
		System.out.println(obj1.b);
		

		
	}

}
