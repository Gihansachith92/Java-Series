package Multi_Threading_2_Thread_Class;

class A extends Thread{
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("welcome");
            try {
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
}

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.start();
        try {
            Thread.sleep(50);
        }
        catch (Exception e){}
        B obj2 = new B();
        obj2.start();
    }
}
