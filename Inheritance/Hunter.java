package Inheritance;

class Father1
{
	
	 int hno=986;
}

class son1 extends Father1{
	
	String car="Tata Punch";
}

class daughter1 extends Father1{
	String scooty="Jupiter";
}

public class Hunter {

	public static void main(String[] args) {
		son1 s=new son1();
		System.out.println("sons1 Property");
		
		System.out.println("house no. :"+s.hno);
		System.out.println("car :"+s.car);
		
		System.out.println("************");
		
		daughter1 d=new daughter1();
		System.out.println("daughter property");
		
		
		System.out.println("house no. :"+d.hno);
		System.out.println("scooty :"+d.scooty);
		
	

	}

}
