package oops;
class Suzukihayabusa {
	String name = "Suzki Hayabusa";
	int speed = 299;
	int weight = 268;
}

class Ducati {
	String name = "Ducati Paniagle V4";
	int speed = 299;
	int weight = 198;
}

class Ninja {
	String name = "Kawasaki Ninja h2r";
	int speed = 400;
	int weight = 216;
}

class honda {
	String name = "CBR 1000RR";
	int speed = 299;
	int weight = 201;
}

class BMW {
	String name = "BMW S1000RR";
	int speed = 303;
	int weight = 210;

}

public class SuperBikes {

	public static void main(String[] args) {
		Suzukihayabusa bike = new Suzukihayabusa();
		System.out.println(bike.name + " top speed is " + bike.speed + "km/h and it has a kerb weight of " + bike.weight + "kg");
		Ducati bike1 = new Ducati();
		System.out.println(bike1.name + " top speed is " + bike1.speed + "km/h and it has a kerb weight of "+ bike1.weight + "kg");
		Ninja bike2 = new Ninja();
		System.out.println(bike2.name + " top speed is " + bike2.speed + "km/h and it has a kerb weight of "+ bike2.weight + "kg");
		honda bike3 = new honda();
		System.out.println(bike3.name + " top speed is " + bike3.speed + "km/h and it has a kerb weight of "+ bike3.weight + "kg");
		BMW bike4 = new BMW();
		System.out.println(bike4.name + " top speed is " + bike4.speed + "km/h and it has a kerb weight of "+ bike4.weight + "kg");
	}

}
