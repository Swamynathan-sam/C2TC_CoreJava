package collection;

import java.util.ArrayList;

public class OddNum {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(4);
		a1.add(3);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add("sam");
		a1.add('c');
		a1.add(3.3777);
		//System.out.println(a1);
		System.out.println("the odd numbers are");
		for(int i=0;i<a1.size();i++)
		{
			Object obj=a1.get(i);
			if(obj instanceof Integer)
			{
				int a=(Integer)obj;
				if(a%2!=0)
				{
					System.out.println(a);
				}
			}
		}
		
	}

}
