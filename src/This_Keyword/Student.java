package This_Keyword;

public class Student {
    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student obj =new Student("gayan" , 23);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
