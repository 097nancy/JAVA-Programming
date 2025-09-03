package inheritance_super_class;
class Teacher{
	Teacher(String college){
		System.out.println("college name :"+college);
	}
}

public class Student extends Teacher{
	
	Student(String college,int phno){
	super("Kashi Institute of Technology");
	System.out.println("phno :"+phno);
		
			
	}
	
			

	public static void main(String[] args) {
	new Student("kashi Institute of Technology",123);

	}

}
