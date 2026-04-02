package day10;

class Name{
    private String name;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
public class getterSetter {
    public static void main(String[] args) {
        Name n = new Name();
        n.setName("Alan Babu");
        System.out.println(n.getName());
    }
}
