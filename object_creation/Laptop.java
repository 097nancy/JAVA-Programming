package object_creation;

public class Laptop {
	
	String brand;
	double price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Laptop l1=new Laptop();
		 Laptop l2=new Laptop();
		 
		 l1.brand="hp";
		 l1.price=60000;
		 
		 l2.brand="dell";
		 l2.price=40000;
		 
		 System.out.println("brand :"+l1.brand);
		 System.out.println("price :"+l1.price);


		 

	}

}
