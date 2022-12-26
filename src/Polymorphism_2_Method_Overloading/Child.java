package Polymorphism_2_Method_Overloading;

public class Child  extends Parent{
    public void phone(){
        System.out.println("nokia");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.phone();
    }
}
