package day7.programs;
// class Animal{
//     void display(){
//         System.out.println("This is parent class");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog Barks");
//     }
// }
// class Cat extends Dog{
//     void Meow(){
//         System.out.println("Cat Meows!!!");
//     }
// }
class Laptop{
    void specs(){
        System.out.println("Specs of the laptop");
    }
}
class Processor extends Laptop{
    void process(){
        System.out.println("Snapdragon");
    }
}
class Camera extends Processor{
    void sensor(){
        System.out.println("Sony IMX890");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Dog sound = new Dog();
        // sound.bark();
        // System.out.println(sound.hashCode());
        // Cat c = new Cat();
        // c.display();
        Camera cam = new Camera();
        cam.specs();
    }
}
