package day12;
import java.util.*;
public class ArrayListImplementation {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(100);
        arrlist.add(200);
        arrlist.add(300);
        arrlist.set(0,50 );
        System.out.println(arrlist);
        System.out.println(arrlist.get(1));
        arrlist.remove(2);
        System.out.println(arrlist);
        System.out.println(arrlist.contains(200));
        System.out.println(arrlist.size());
        System.out.println(arrlist.indexOf(200));
        arrlist.clear();
        System.out.println(arrlist.isEmpty());
    }
}
