package day9;

abstract class Employee{
    public int Employeeid;
    Employee(int empid){
        this.Employeeid = empid;
    }
    abstract void timings();
    abstract void name();
    abstract void Salary();
}
class FulltimeEmp extends Employee{
    FulltimeEmp(int id){
        super(id);
    }
    public void timings(){
        System.out.println("For full time employee timings is from 9am to 5pm"); 
    }
    public void name(){
        System.out.println( "Name of the employee is alan babu");
    }
    public void Salary(){
        System.out.println("For fulltime Employee the typical Salary is 60k");
    }
}
class Partemp extends Employee{
    Partemp(int id){
        super(id);
    }
    public void timings(){
        System.out.println("For full time employee timings is from 1pm to 5pm"); 
    }
    public void name(){
        System.out.println( "Name of the employee is alan babu");
    }
    public void Salary(){
        System.out.println("For Parttime Employee the typical Salary is 10k");
    }
}

public class Scenario1 {
    public static void main(String[] args) {
        FulltimeEmp obj1 = new FulltimeEmp(19);
        obj1.timings();
        obj1.name();
        obj1.Salary();
        Partemp obj2 = new Partemp(10);
        obj2.timings();
        obj2.name();
        obj2.Salary();
    }
}
