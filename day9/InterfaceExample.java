package day9;
interface A{
    void show();
}
interface B{
    void display();
}
class C implements B{
    public void display(){
        System.out.println("Hello");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
