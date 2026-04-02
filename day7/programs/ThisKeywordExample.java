package day7.programs;

class NameandRollNo{
    String dept;
    String name;
    String rollno;
    NameandRollNo(String name,String rollno , String dept){
            this.name = name;
            this.rollno = rollno;
            this.dept = dept;
    }
    void display(){
        System.out.println("Name : "+name +"\nRoll no :"+rollno);
    }
}
public class ThisKeywordExample{
    public static void main(String[] args) {
             NameandRollNo s1 = new NameandRollNo("Alan","24cs216","CSE");
             NameandRollNo s2 = new NameandRollNo("Babu","24cs212","CSE");
             NameandRollNo s3 = new NameandRollNo("Gayston","24cs416","CSE");
             NameandRollNo s4 = new NameandRollNo("abel","24cs230","ECE");

        s1.display();
        System.out.println(s1.hashCode());
         s2.display();
        System.out.println(s2.hashCode());
         s3.display();
        System.out.println(s3.hashCode());
         s4.display();
        System.out.println(s4.hashCode());
        
    }
}