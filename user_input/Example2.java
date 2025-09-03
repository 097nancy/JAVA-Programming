package user_input;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of an array");
	 int size=sc.nextInt();
	 //creating an of double size
	 double per[]=new double[size];
	 //initialising the array
	 for(int index=0;index<=size-1;index++)
	 {
		 per[index]=sc.nextDouble();
	 }
	  
	 System.out.println("The array elements are :");
	 //fetching array elements by using for loop
	 for(int index=0;index<=size-1;index++)
	 {
		 per[index]=sc.nextDouble();
	 }

	}

}
