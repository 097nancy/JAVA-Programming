package constructor_this;

public class Laptop {
	String brand;
	double price;
	String color;
	Laptop(String brand,double price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           	Laptop l1=new Laptop("HP",35000,"Silver");
           	System.out.println("brand :"+l1.brand);
           	System.out.println("price :"+l1.price);
            System.out.println("color :"+l1.color);

	}

}
