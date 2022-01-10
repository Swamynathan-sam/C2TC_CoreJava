// Program to find the even numbers by using ArrayList
package collection;

import java.util.ArrayList;

public class EvenNum {

	public static void main(String[] args) {
	 ArrayList a1=new ArrayList();
	 a1.add(2);
	 a1.add(4);
	 a1.add(3);
	 a1.add(6);
	 a1.add("sam");
	 a1.add('c');
	 System.out.println("the even numbers are ");
	 for(int i=0;i<a1.size();i++) //it is used for accessing index values
	 {
		Object obj=a1.get(i); //used to fetch array list values 
		if(obj instanceof Integer ) //it fetches only integer type of objects  
		{
		int a=(Integer)obj; //downcasting
		if(a%2==0)
		{
			System.out.println(a);
		}
		}
	 }
	}
}
