package day6;

class Apartment {
    public void display() {
        System.out.println("I am inside apartment class hehe");
    }
}
public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("I am inside class objects");
        Apartment obj = new Apartment();
        //obj.display();
    }
}