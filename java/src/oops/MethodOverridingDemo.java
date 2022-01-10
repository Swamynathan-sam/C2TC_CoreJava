package oops;
class Bank
{
	float getRateOfInterest()
	{
		return 6.7f;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 7.0f;
	}
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 6.8f;
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj2=new SBI();
		System.out.println(obj2.getRateOfInterest());
	}

}
