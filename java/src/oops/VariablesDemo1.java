//
package oops;

public class VariablesDemo1 {
	//class variable
	final static int a=1024;
	int b;
	void func1()
	{
		//static int x; we can't declare static variables in non-static method
		final int c;
		c=10;
		System.out.println("class variable "+a+""+b);
		System.out.println("local variable "+c);
		//a=7890;
		b=56;
		System.out.println("class variable "+a+""+b);
	}

	public static void main(String[] args) {
	VariablesDemo1 obj= new VariablesDemo1();
	System.out.println(obj.b);
	System.out.println(VariablesDemo1.a);// we can access static variables using class_name
	}

}
