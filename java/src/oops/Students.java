package oops;

public class Students {
	String usn;
	String name;
	String Branch;
	double percentage;
	public Students()
	{	
	}
	

	public Students(String usn) {
		this.usn = usn;
	}


	public Students(String usn, String name, String branch, double percentage) {
		this.usn = usn;
		this.name = name;
		Branch = branch;
		this.percentage = percentage;
	}
	public String Data()
	{
		String str="("+usn+","+name+","+Branch+","+percentage+")";
		return str;
	}


	public static void main(String[] args) {
		Students s1=new Students();
		s1.usn="18ec413";
		s1.name="Swamynathan";
		s1.Branch="ECE";
		s1.percentage=70;
		System.out.println(s1.Data());
		
		Students s2=new Students("18EC414", "Thanmay", "ECE", 90);
		System.out.println(s2.Data());

	}

}
