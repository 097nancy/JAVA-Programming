package user_input;

import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");

		int size=sc.nextInt();
		//creating an arry for long type
		long phno[]=new long[size];
		 System.out.println("Enter Phone no.");
		 //initialising the array elements
		 for(int index=0;index<=size-1;index++)
		 {
			 phno[index]=sc.nextLong();
		 }
		 System.out.println("The array elements are :");
		//fetching array elements by using for loop
		 for(long x :phno)
		 {
			 System.out.println(x);
		 }

		 
		  
		 

	}

}
