package Static_Keyword;

class Test {
    String name;

    void call(){
        System.out.println("take a call from  " + name);
    }

    public static void main(String[] args) {
        Test phone1 = new Test();
        Test phone2 = new Test();
        Test phone3 = new Test();
        phone1.name = "nokia";
        phone2.name = "samsung";
        phone3.name = "huawei";
        phone2.call();
        phone1.call();

    }
}
