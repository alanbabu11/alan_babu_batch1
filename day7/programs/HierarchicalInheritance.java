package day7.programs;

class Father{
    void display()
    {
        System.out.println("I am Father");
    }
}

class Son extends Father{
    void job(){
        System.out.println("Since you are going I am going to handover the business to sister");
    }
}
class Daughter extends Father{
    void business(){
        System.out.println("Since I have my own Business I don't hav proper time to manage yours. Hsnd over the business to brother as the job is temporary");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Son son  = new Son();
        son.display();
        son.job();
        Daughter daughter = new Daughter();
        daughter.display();
        daughter.business();
    }
}
