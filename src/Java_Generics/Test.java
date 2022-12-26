package Java_Generics;

class A<T>{
    void print(T x){
        T y = (T) x;
        System.out.println(y);
    }
}

public class Test {
    public static void main(String[] args) {
        A<Integer> obj1 = new A();
        obj1.print(34);
        A<String> obj2 = new A();
        obj2.print("hello");
        A<Double> obj3 = new A();
        obj3.print(44.72);
    }
}
