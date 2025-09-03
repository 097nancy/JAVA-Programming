package Encapsulation;
class Test{
	
	private double mno;
	
	public double getMno()
	{
		return mno;
		
	}
	
	public void setMno(double mno)
	{
		this.mno=mno;
	}

	



public class PersonDetail {

	public static void main(String[] args) {
		
	Test p=new Test();
	p.setMno(102939930);
	System.out.println("mno :"+p.getMno());
	
	}
   
    
	}

}
