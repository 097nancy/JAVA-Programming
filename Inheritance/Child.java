package Inheritance;
class Parent
{
	static int pin=2345;
}

public class Child extends Parent{

	public static void main(String[] args) {
		System.out.println(pin);
		System.out.println(Parent.pin);
		Parent p=new Parent();
		System.out.println(p.pin);
		System.out.println(Child.pin);
		Child c=new Child();
		System.out.println(c.pin);
		
		

	}

}
