package day6;


public class defaultConstructor {
    defaultConstructor(){
        System.out.println("I am inside default constructor");
    }
    defaultConstructor(int x) {
        this.x = x;
        System.out.println("this is the input "+x);
    }
    int x = 90;
    public static void main(String[] args) {
        System.out.println("See your default constructor class file is aitomatically created while compilation");
        defaultConstructor obj = new defaultConstructor();
        defaultConstructor inp = new defaultConstructor(20);
        System.out.println(obj.x);

    }
}