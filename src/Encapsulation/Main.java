package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("kamal");
        System.out.println(obj.getName());

        obj.setAge(30);
        System.out.println(obj.getAge());
    }
}
