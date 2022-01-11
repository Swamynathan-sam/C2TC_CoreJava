//WAP to handle Array index out of bound using try and catch blocks
package day11Jan22_Exception_Handling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		try {
			arr[3] = 35;  //try block contains suspected lines of code
			System.out.println("In try block");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception in try block"); 	//catch block is used to handle exceptions
		} finally {
			System.out.println("In finally block");		//finally block will be executed even if exception occurs or not
		}												//finally block is used to write closing statements
		System.out.println("In the class");
	}
}
