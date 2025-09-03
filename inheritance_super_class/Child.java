package inheritance_super_class;

class Parent {
    Parent(double phno, String name) {
        System.out.println("Parent Constructor: Name = " + name + ", Phone = " + phno);
    }
}

public class Child extends Parent {
    Child(String name,String name2 ,double phno) {
        super(phno, name); // Correct order and number of arguments
        System.out.println("Child Constructor: Name1 = " +name  +  " ,name2  :"+name2);
    }

    public static void main(String[] args) {
        new Child("Nancy","Emma", 156);
    } 
}