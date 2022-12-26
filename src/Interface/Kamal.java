package Interface;

public class Kamal implements Student {
    public void eat(){
        System.out.println("eating");
    }
    public void drink(){
        System.out.println("drinking");
    }
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Student x =new Kamal();
        System.out.println(Student.number);
        x.drink();
        x.eat();
        x.run();
    }
}
