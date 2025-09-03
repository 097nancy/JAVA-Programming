package Inheritance;
class Vehicle{
	//non static variable
	public void detail() {
	System.out.println("Vehicles are comfortable for life");
	}
}

public class Car extends Vehicle {

	public static void main(String[] args) {
	Vehicle v=new Vehicle();
	 v.detail();
	 
	

	}

}
