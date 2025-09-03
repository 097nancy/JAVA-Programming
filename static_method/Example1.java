package static_method;

public class Example1 {
	public static void demo()
	{
		System.out.println("static method");
	}

	public static void main(String[] args) {
		//acceasing static method within the same class directly--
		demo();
		Example1 e1=new Example1();
		e1.demo();

	}

}
