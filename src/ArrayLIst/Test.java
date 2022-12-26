package ArrayLIst;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(10);
        arr.add(5);
        arr.add(30);
        arr.add(0,99);
        System.out.println(arr);

        arr.forEach(x -> System.out.println(x));
    }
}
