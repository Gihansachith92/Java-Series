package Abstract_Class_And_Method;

public class Kamal extends Nimal{
    void drink(){
        System.out.println("drinking");
    }
    void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Kamal obj1 = new Kamal();
        obj1.drink();
        obj1.run();
        obj1.eat();
    }
}
