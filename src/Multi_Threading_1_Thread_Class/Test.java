package Multi_Threading_1_Thread_Class;

class A extends Thread{
    public void run(){
        System.out.println("hello");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.start();
    }
}
