package static_variable;
class Laptop
{
	//static variable
	static int keys=104;
}

public class Device {
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	System.out.println("keys :"+Laptop.keys);
	 Laptop l1=new Laptop();
	 
	 System.out.println("keys :"+l1.keys);

	}

}
