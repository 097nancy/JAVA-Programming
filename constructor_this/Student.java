package constructor_this;

public class Student {
//non-static variables
	String name;
	double marks;
	//parameterized constructor
	Student(String name,double marks)
	{
		// initialising non-static variable
				this.name=name;
				this.marks=marks;
	}
	public static void main(String[] args) {
		//creating an object
	Student s1=new Student("Nancy",97);
	System.out.println("name :"+s1.name);
	System.out.println("marks :"+s1.marks);
	
		

	}

}
