package day8;

class Encapsu{
    int a;
    Encapsu(){
        a=10;
    }
    void display(){
        System.out.println("Implementatio of Encapsulation is : "+a);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Encapsu en = new Encapsu();
        en.display();
    }
}
