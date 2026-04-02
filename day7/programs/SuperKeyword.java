package day7.programs;
class SuperExample1{
    SuperExample1(){
        System.out.println("Called Super example 1 by superkeyword");
    }
    void hello(){
        System.out.println("Welcome hello!!!");
    }
}
class SuperExample2 extends SuperExample1{
    SuperExample2(){
        System.out.println("Called SuperExample 2");
    }
    void reject(){
        System.out.println("Go Away");
        super.hello();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        
    }
}
