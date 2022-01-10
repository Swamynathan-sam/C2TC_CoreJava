package oops;
public class MethodOverloading {
	
	int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	float add(float a, float b)
	{
	float sum=a+b;
	return sum;
	}	
	float add(int a, float b, int c)
	{
		float sum=a+b+c;
		return sum;
	}	
	float add(float a, int b, int c)
	{
		float sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(3.45f, 5.67f));
		System.out.println(obj.add(10, 20.22f,67));
		System.out.println(obj.add(24.67f, 20,100));
		

	}

}
