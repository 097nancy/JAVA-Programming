package constructor_chainning;

public class Car {
	
	Car(String name)
	{
		System.out.println("Details of cars are :");
	System.out.println("name :+name");
	}
	
	Car(String name,double Price){
		this(name);
		System.out.println("price :+price");
		
	}
	


	public static void main(String[] args) {
		System.out.println("main method");
	new Car("Honda City");
	

	}

}
