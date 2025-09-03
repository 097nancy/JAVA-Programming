package object_class;

public class Nancy {
String name;
long salary;

Nancy(String name,long salary){
	this.name=name;
	this.salary=salary;
}
@Override
public boolean equals(Object o) {
	Nancy s=(Nancy)o;
	return this.name==s.name && this.salary==s.salary;
}
	public static void main(String[] args) {
	Nancy n1= new Nancy("nan",197000);
	Nancy n2= new Nancy("nan",197000);
	System.out.println(n1.equals(n2));
	

	}

}
