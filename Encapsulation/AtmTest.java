package Encapsulation;

class Atm{
	
	private int pin;
	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
}


public class AtmTest {

	public static void main(String[] args) {
		Atm a=new Atm();
		
        a.setPin(1234);
     System.out.println("pin :"+a.getPin());
     
    
    

	}

}
