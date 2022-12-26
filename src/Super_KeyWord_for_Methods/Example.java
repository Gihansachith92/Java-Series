package Super_KeyWord_for_Methods;

class A{
    void show(){
        System.out.println("hi");
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("hello");
    }
}


public class Example {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
