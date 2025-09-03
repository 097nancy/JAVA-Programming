package accessModifier;

public class Student {
	protected void deatails() {
    	System.out.println("student protected");

	public static void main(String[] args) {
		Student s=new Student();
		s.details();
   
    	
    }

	}

}
