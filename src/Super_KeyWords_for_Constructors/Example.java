package Super_KeyWords_for_Constructors;

class Student{
    int age;
    String school;
    String email;
    Student(int age,String school,String email){
        this.age = age;
        this.school = school;
        this.email = email;
    }
}
class kamal extends Student{
    int marks;
    kamal(int age,String school,String email,int marks){
        super(age,school,email);
        this.marks = marks;
    }
}

public class Example {
    public static void main(String[] args) {
        kamal obj = new kamal(15,"abcd","xcx",76);
        System.out.println(obj.school);
        System.out.println(obj.marks);
    }
}
