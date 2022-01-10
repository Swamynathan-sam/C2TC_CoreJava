package collection;

import java.util.ArrayList;

public class Prgm1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add("sam");
		a1.add(3);
		System.out.println("objects of arraylist 1"+a1);
		ArrayList a2=new ArrayList();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		System.out.println("objects of arraylist 2"+a2);
		System.out.println(a1.get(2));
		a1.add(2, "hello");
		System.out.println(a1);
		a1.addAll(a2);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		a1.set(4,"shorty");
		System.out.println(a1);
	}

}
