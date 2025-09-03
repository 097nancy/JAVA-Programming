package exception;
import java.util.Scanner;

public class exception_class {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	System.out.println("Give the value of a:");
	a=sc.nextInt();
	System.out.println("Give the value of b:");
	b=sc.nextInt();
	
	try {
		System.out.println("Division is :"+a/b);
		
		System.out.println("Try block is successfully executed");
	}
		catch (ArithmeticException e){
			System.out.println("sorry,Try Again");
			System.out.println("catch block is successfully executed");
		}
		finally {
			System.out.println("finally block is successfully executed");
		}
	
	

	}

}
