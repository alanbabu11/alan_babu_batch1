package day6;

public class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Default constructor");
    }

    ConstructorOverloading(int i) {
        System.out.println("Constructor overloading and the value of i is "+ i);
    }

    ConstructorOverloading(String name) {
        System.out.println("Constructor got input as: "+name);
    }
    public static void main(String[] args) {
        System.out.println("this is from the main method");

        Object ConstructorOverloading = new ConstructorOverloading();
        ConstructorOverloading one  = new ConstructorOverloading(10);
        ConstructorOverloading string = new ConstructorOverloading("Bye bitch :D");
    }
}