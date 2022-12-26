package Multi_Threading_2_Runnable_Interface;

class A implements Runnable{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
}
class B implements Runnable{
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("world");
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
        Thread o1 = new Thread(obj1);
        o1.start();
        try {
            Thread.sleep(50);
        }
        catch (Exception e){}
        B obj2 = new B();
        Thread o2 =new Thread(obj2);
        o2.start();
    }
}
