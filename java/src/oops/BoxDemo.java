package oops;

class Box
{
	float width;
	float height;
	float depth;
	float calcVol()
	{
		return width*height*depth;
	}
}
class box2
{
	float width;
	float height;
	float depth;
	float calcVol1()
	{
		return width*height*depth;
	}
	
}
public class BoxDemo {

	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol=box1.calcVol();
		System.out.println("volume of Box1 is "+vol);
		box2 box2;
		box2=new box2();
		box2.width=5.4f;
		box2.height=2.8f;
		box2.width=3.2f;
		float vol1=box2.calcVol1();
		System.out.println("volume of box2 is "+ vol1);
		
	}

}
