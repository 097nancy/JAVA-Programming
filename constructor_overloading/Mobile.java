package constructor_overloading;
class Electronic()
{
	Electronic(){
		System.out.println("I have a Samsung phone");
	}
}

public class Mobile {

	public static void main(String[] args) {
    new Electronic("I have S23 series");

	}

}
