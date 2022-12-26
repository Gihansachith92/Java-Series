package Single_Inheritance;

public class NewPhone extends OldPhone {

    public static void main(String[] args) {
        NewPhone obj2 = new NewPhone();
        obj2.call(); // NewPhone can access OldPhone methods , because OldPhone class inherit to the NewPhone class.
        obj2.message(); // NewPhone can access OldPhone methods , because OldPhone class inherit to the NewPhone class.
    }

}
