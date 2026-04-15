package day17;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator <Integer> itr = list.iterator();
        while(itr.hasNext()){
            if((itr.next()) %2 == 0){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
