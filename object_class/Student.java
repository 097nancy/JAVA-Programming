package object_class;

public class Student//extend object implicitly
{
	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;
		return this.name==s.name && this.id==s.id;
		
		
	}
	
	

	public static void main(String[] args) {
	Student s1=new Student("Nancy",97);
	Student s2=new Student("Nancy",97);
	System.out.println(s1.equals(s2));
	//in line 15 s1 is current obj ref and s2 is past object..
	System.out.println(s2.equals(s1));

	}

}
