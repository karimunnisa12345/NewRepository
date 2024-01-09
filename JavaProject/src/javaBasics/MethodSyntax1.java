package javaBasics;

public class MethodSyntax1 {

	//Method without returntype and without parameter
	//int a=10,b=20;  // class level primitive instance variable
	float f1=2.35f,f2=3.24f;
	char c1='a',c2='b';
	public void sum()    // instance method. method definition 
	{
	 int a=0,b=0;// here a,b,res variables are local variables.
	 int res=a+b;
	 float resf=f1+f2;
	 int resc=c1+c2;
	System.out.println("The sum of a and b values is: " + res); 
	System.out.println(resf);
	System.out.println(resc);
	
	}
	
	public static void main(String[] args) {
		
		MethodSyntax1 obj1=new MethodSyntax1();
		
		obj1.sum();  // method invoke/method call

	//	System.out.println(obj1.a); // local variables cannt access outside of the method
	//	System.out.println(obj1.b);
	}

}
