package day17;
import java.util.*;
class Student{
    int rollno;
    int age;
    double mark;
    Student(int rollno , int age , double mark){
        this.rollno = rollno;
        this.age = age;
        this.mark = mark;
    }
     @Override
    public String toString() {
        return "RollNo: " + this.rollno + ", Age: " + this.age + ", Mark: " + this.mark;
    }
}
class AgeComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.age,s2.age);
    }
}
class RollComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return Integer.compare(s1.rollno, s2.rollno);
    }
}
class MarksComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return (Double.compare(s1.mark, s2.mark))* -1;
    }
}
public class ComperatorDemo {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(16,15,20.55));
        s.add(new Student(36,18,89.67));
        s.add(new Student(21,20,100.0));
        s.add(new Student(19,15,25.98));
        s.add(new Student(45,17,33.45));
        
        Collections.sort(s, new MarksComparator());

    for (Student st : s) {
        System.out.println(st);
    }
    }
}
