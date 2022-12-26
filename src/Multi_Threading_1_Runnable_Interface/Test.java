package Multi_Threading_1_Runnable_Interface;

class A implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}
public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        Thread o = new Thread(obj1);
        o.start();
    }
}
