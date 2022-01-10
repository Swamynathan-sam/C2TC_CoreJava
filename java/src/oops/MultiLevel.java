package oops;
class Bike
{
	int gear;
	int speed;
	public Bike(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	void increaseSpeed(int increment)
	{
		speed+=increment;
	}
	void DecreaseSpeed(int decrement)
	{
		speed-=decrement;
	}
	@Override
	public String toString() {
		return "Bike [gear=" + gear + ", speed=" + speed + "]";
	}
}

class Mtb extends Bike
{
	int seatHeight;
	
	public Mtb(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight=seatHeight;
	}
	void adjustHeight(int value)
	{
		this.seatHeight=value;
	}	
}
class electricBike extends Mtb
{
	String BLDC_motor;

	public electricBike(int gear, int speed, int seatHeight, String value2) {
		super(gear, speed, seatHeight);
		this.BLDC_motor=value2;
	}
	

	@Override
	public String toString() {
		return "electricBike [BLDC_motor=" + BLDC_motor + ", seatHeight=" + seatHeight + ", gear=" + gear + ", speed="
				+ speed + "]";
	}
	
	
}

public class MultiLevel {

	public static void main(String[] args) {
		electricBike a1=new electricBike(6, 160, 5,"present");
		a1.adjustHeight(6);
		System.out.println(a1.toString());
		

	}

}
