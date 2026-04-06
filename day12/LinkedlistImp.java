package day12;

import java.util.*;

public class LinkedlistImp {
    public static void main(String[] args) {
        List<String> runningrace = new LinkedList<>();
        runningrace.add("A");
        runningrace.add("B");
        runningrace.add("C");
        System.out.println(runningrace);
        runningrace.addFirst("Start Race");
        System.out.println(runningrace);
        runningrace.remove("B");
        System.out.println("B is disqualified due to early start");
        System.out.println(runningrace);
        runningrace.addLast("Race Completed");
        System.out.println(runningrace);
        System.out.println("A Won");
    }
}
