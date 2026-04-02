package day8;
class Add{
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(int a, int b, int c , int d){
        System.out.println(a+b+c+d);
    }
    void add(int a, int b, int c,int d, int e){
        System.out.println(a+b+c+d+e);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class subtract extends Add{
    @Override
    void add(int a, int b, int c){
        System.out.println(a-b-c);
    }

}
public class Overload {
    public static void main(String[] args) {
        Add obj1 = new Add();
        obj1.add(10,20);
        obj1.add(10,20,30);
        obj1.add(10,20,30,40);
        obj1.add(10,20,30,40,50);
        subtract obj2 = new subtract();
        obj2.add(10,20,30);
        
    }
}
