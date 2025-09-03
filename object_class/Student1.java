package object_class;

public class Student1 {
	int id;
	Student1(int id){
		this.id=id;
	}
@Override	public boolean equals( Object o)//object o=s2 //upcasting  object o=new Student(151) downcasting
	{
	//Downcasting
		Student1 s=(Student1)o;
	//return statement
	return this.id==s.id;	
			}

	public static void main(String[] args) {
		Student1 s1=new Student1(97);
		Student1 s2=new Student1(97);
		System.out.println(s1.equals(s2));


	}

}
