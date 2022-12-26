package Polymorphism_1_Method_Overloading;

public class Meth_Overloading {
    public void meth(){
        System.out.println("method 1 ");
    }
    public void meth(int x){
        System.out.println("method 2 ");
    }
    public void meth(int x , int y ){
        System.out.println("method 3 ");
    }
    public void meth(double z){
        System.out.println("method 4 ");
    }

    public static void main(String[] args) {
        Meth_Overloading obj = new Meth_Overloading();
        obj.meth();
        obj.meth(15);
        obj.meth(5,14);
        obj.meth(13.41);
    }
}
