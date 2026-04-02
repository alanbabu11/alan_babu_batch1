package day9;

abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Cat obj1 = new Cat();
        obj1.sound();
        
    }
}
