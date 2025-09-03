package Demo;

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
}



public class NancyDetail {

	public static void main(String[] args) {
		Test p=new Test();
		System.out.println("mno :"+p.getMno());
	}
		

}
