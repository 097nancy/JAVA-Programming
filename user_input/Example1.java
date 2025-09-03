package user_input;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("PLease enter ur salary");
    long salary=sc.nextLong();
    System.out.println("salary :"+salary);
    System.out.println("Enter ur percentage");
    float percentage=sc.nextFloat();
    System.out.println("percentage :"+percentage);
    
    System.out.println("please enter ur grade");
    char grade=sc.next().charAt(0);
    System.out.println("grade :"+grade);
    
    System.out.println("Tell are u eligible to vote or not :");
    boolean p=newBoolean();
    System.out.println("Replyp :"+p);
    
    
    
     
    
	}

}
