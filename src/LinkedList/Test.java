package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList(List.of(1,2,3));
        arr.add(12);
        System.out.println(arr);

        arr.forEach(n -> System.out.println(n*10));
    }
}
