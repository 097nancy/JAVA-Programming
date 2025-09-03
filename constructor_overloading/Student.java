package constructor_overloading;

public class Student {
	Student(){
		("There is the group of Students");
	}
	Student(int size){
		
		System.out.println("THere is a Group of" +Size "+Student");
		}
	
	Student(int size,double budget){
		System.out.println("THere is Student of"+size "Student :"+budget" );
	}

	public static void main(String[] args) {
   Student std=new Student();
		new Student(100);
		new Student(50,500000);
	}

}
