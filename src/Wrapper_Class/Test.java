package Wrapper_Class;

public class Test {
    public static void main(String[] args) {
        int x = 12;
        Integer y =Integer.valueOf(x); // Boxing ,Wrapping
        Integer z = x; // auto Boxing , auto Wrapping

        Integer a =3;
        int b = a.intValue(); // Unboxing , Unwrapping
        int c = a; // auto Unboxing , auto Unwrapping

    }
}
