package exception;

public class Student {
int rollno=97;
	public static void main(String[] args) {
    System.out.println("Welcome");
    Student s= null;
   try {
	  System.out.println("Result :"+s.rollno); 
   }
   catch (NullPointerException n){
	   System.out.println("create an object") ;
	   
   }
   System.out.println("Thank You");

	}

}
