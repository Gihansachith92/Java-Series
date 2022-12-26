package Constructors;

class Test {
    Test(){
        System.out.println("welcome");
    }
    void meth(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.meth();
        Test obj1 =new Test();
    }
}
