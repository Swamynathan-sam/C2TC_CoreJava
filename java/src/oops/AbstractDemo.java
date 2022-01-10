package oops;

abstract class Bank1 {

	abstract float getRateOfInterest();
	
	void display()
	{
		System.out.println("Abstarct class"); //abstract keyword cannot used in constructor
	}										 //in interface all methods are abstract 
	
}
class Syndicate extends Bank1
{
	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
	
}
class IOB extends Bank1
{
	float getRateOfInterest()
	{
		return 6.8f;
	}
}

class Canara extends Bank1
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Syndicate obj=new Syndicate();
		System.out.println(obj.getRateOfInterest());
		
		Bank1 obj1=new IOB();
		System.out.println(obj1.getRateOfInterest());
	}
}
