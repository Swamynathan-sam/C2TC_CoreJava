package oops;

public class Employee {
	int id;
	String name;
	String email;
	Float salary;
	public Employee()
	{
	}
	 
	public Employee(int id, String name, String email, Float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public Employee(int id) {
		this.id = id;
	}
	public String toString() {
		String str="("+id+","+name+","+email+","+salary+")";
		return str;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="sam";
		e1.email="sfwdy";
		e1.salary=45000.6f;
		System.out.println(e1.toString());
		
		Employee e2=new Employee(102, "sharuk", "wertdgu", 345.435f);
		System.out.println(e2.toString());
	}
}
