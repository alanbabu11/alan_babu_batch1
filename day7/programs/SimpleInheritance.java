package day7.programs;
class Parent{
    void display(){
        System.out.println("Im inside parent class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("I am inside Child class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Inside main function");
        Child obj = new Child();
        obj.display();
        obj.display1();
    }
}
