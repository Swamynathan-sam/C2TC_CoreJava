package oops;

class Animal
{
	int legs;
	String name;
	String color;
	
	public Animal()
	{
		System.out.println("This is default constructor");
	}
	public Animal(String name) {
		this(); //it calls previous constructor
		this.name=name;
	}

	public Animal(String name, String color) {
		this(name); // it calls constructor accepting name
		this.color=color;
	}

	public Animal(int legs, String name, String color) {
		this(name,color);  //it calls constructor accepting name and color
		this.legs=legs;
	}
	void display()
	{
		System.out.println("Animal Description");
		System.out.println(color+" "+"color "+name+" has "+legs+"legs");	
	}
	
}
public class ThisDemo {

	public static void main(String[] args) {
		Animal obj1=new Animal(4,"dog","white");
		obj1.display();
		
		Animal obj2=new Animal("cat","Black");
		obj2.display();

	}

}
