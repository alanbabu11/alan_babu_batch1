package Student_Management_System.models;
import Student_Management_System.core.Person;
import Student_Management_System.exceptions.*;
public class Student extends Person {
  
    private int id;
    private String course;
    private double gpa;
    private String grade;
    private int idcntr = 0;

    public Student(String name , int age , String email , int id , String course , double gpa , String grade)throws InvalidstudentDataException{
        super(name,age,email);

        if(name.isBlank()){
            throw new InvalidstudentDataException("Name cannot be empty");
        }
        if(age<=17){
            throw new InvalidstudentDataException("age must be 17 and above");
        }
        if(!email.contains("@")){
            throw new InvalidstudentDataException("email should contain @");
        }
        if(course.isBlank()){
            throw new InvalidstudentDataException("course shouldn't be empty");
        }
        if(gpa<0.0 || gpa >= 10.0){
            throw new InvalidstudentDataException("gpa should be above 0 and below 10");
        }

        this.id = idcntr++;
        this.course = course;
        this.gpa = gpa;
        this.grade = calcgrade(gpa);
    }
        public String calcgrade(double gpa){
            if(gpa>=9.0){
                return "O+";
            }
            else if(gpa>=8.0){
                return "A+";
            }
            else if(gpa>=7.0){
                return "A";
            }
            else if(gpa>=6.0){
                return "B";
            }
            else if(gpa>=5.0){
                return "C";
            }
            else{
                return "F";
            }
        }

        public int getId(){
            return id;
        }
        public String getCourse(){
            return course;
        }
        public void setCourse(String course){
            this.course = course;
        }
        public double getGpa()
        {
            return gpa;
        }
        public void setGpa(double gpa){
            this.gpa = gpa;
        }
        public String getGrade(){
            return grade;
        }

    }

