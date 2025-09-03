package constructor_overloading;

public class book {
	book(String name,int price,String color){
		System.out.println("name :"+name);
		System.out.println("price :"+price);
		System.out.println("color :"+color);
	}
	book(String name,int price,int publishyear){
		System.out.println("name :"+name);
		System.out.println("price :"+price);
		System.out.println("publish year :"+publishyear);
	}
	

	public static void main(String[] args) {
	
		new book("Arihant",200,"green");
		System.out.println("*****");
		
		new book("NCERT",100,1980);
		System.out.println("*****");
		

	}

}
