package inheritance_super_class;

class Mother{
	Mother(){
		System.out.println("Mother said do yoga in early morning......");
	}
}

public class Daughter extends Mother {
	Daughter(){
		System.out.println("I said i will try to woke up early......");
		
	}

	public static void main(String[] args) {
		System.out.println("Its boss order compulsory to follow....");
		new Daughter();

	}

}
