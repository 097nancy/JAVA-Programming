package Inheritance;
class Father{
	
	
	public void calling() {
		System.out.println("Missing that when my father calls me Nancy and I used to tell..aa rhi hu  Papa....");
	}
	public void voice() {
		System.out.println("Voice of my papa is very precious for me..I missed so so muchh to listen his voice since 2 yaer....when a father stops to speak it was the very difficult time for him and for their family");
	}
	
	public void realtion() {
		System.out.println("A husband is a life for his wife..A Father is strength and support for his son and daughter");
	}
	
}

public class Daughter extends Father {
	public void Fatherlost() {
		System.out.println("Missing uh so so much papa and Love uh the Most.......");
	}
	public void fd() {
	System.out.println("Relation of father and daughter is very pure in this world...My papa loves me the most in my whole family..he got tensed when he not seen me around him ...");
	}
	
	public void cancer() {
		 System.out.println("After he got suffered by cancer he tried his best to live for him and for his family.. he faces all the difficulty all the pain to survive done everythig that he could survive well and for living with family..He lost his voice he also was unable to eat his favourite items but still he don not lose hope to live..he faced very big pain in his life and lost his strenght and power which he own ih his life but still he don not loose hope and fight greatly with cancer..");
	}
	public void god() {
		System.out.println("But after all muchh of sacrifices.....God has other plans....He taken away my father after all the practices and sacrifices.....THat was the biggest loss of my life ...");
	}
	
	public void papa() {
		System.out.println("I missed uh papa every seconds in my life....I always wish that i can see u a single time in my dream that I got some relief...But god also not doing this for me...I wishh ab aap jha ho ekdam mst aur khush rho.....I cannot forget u papa in my life jb tb mai jinda hu...missing uh a lot..aap kya gye lgta hai ghar pe kuchh hai hi nhi na koi shor na koi aawaj aur na smjh aata hai kya kya jaye..aap the to sb tha ..aap nhi to sb phikha hai papa..aapke presence ke bina to koi bhi function function nhi lgta ...A father ia a strength for his family ");
	}

	public static void main(String[] args) {
	Daughter d=new Daughter();
	d.fd();
	d.cancer();
	d.calling();
	d.voice();
	d.god();
	d.Fatherlost();
	d.realtion();
	d.papa();

	}

}
