package Multi_Threading_3_Synchronization;

class Display{
    void print(){
        Thread t = Thread.currentThread();

        synchronized (this){
            for (int i=0; i<5; i++){
                try {
                    Thread.sleep(1000);
                    System.out.println(t.getName());
                }
                catch (Exception e){}
            }
        }
    }
}

class T extends Thread{
    Display c;

    T(Display c){
        this.c = c;
    }
    public void run(){
        c.print();
    }
}

public class Test {
    public static void main(String[] args) {
        Display obj = new Display();

        T t1 = new T(obj);
        T t2 = new T(obj);

        t1.start();
        t2.start();
    }
}
