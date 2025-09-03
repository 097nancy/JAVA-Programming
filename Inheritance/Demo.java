package Inheritance;
class Tree{
	public void t() {
		System.out.println("Tree have lots of benefits");
	}
}

class wood extends Tree{
	public void details() {
		System.out.println("Woods are very beneficial in home decoration and to make home furnitures");
		
	}
}

class home extends wood {
	public void uses() {
		System.out.println("Wood of tree used for home decorations");
		
	}
}
class room extends home{
	public void need() {
		System.out.println("wood is used to make beds and other furnitures which is our basic need");
	}
}

public class Demo {

	public static void main(String[] args) {
	home h=new home();
	room r=new room();
	h.t();
	h.details();
	r.need();
	
	System.out.println("**************************");
	r.t();
	r.details();
	r.uses();
	r.need();
	
	

	}

}
