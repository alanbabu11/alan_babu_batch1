package Student_Management_System.models;
import Student_Management_System.core.*;
import Student_Management_System.exceptions.*;
import java.util.ArrayList;
public class StudentManager extends Management {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) throws DuplicateDataException{
        for(Student s : studentList){
            if(s.getId() == student.getId() && s.getName() == student.getName()){
                throw new DuplicateDataException("already exist!!");
            }
        }
        studentList.add(student);
        System.out.println("Student Added");
    }

    public void viewall() throws InvalidstudentDataException,StudentNotFoundException{
        if(studentList.isEmpty()) {
            throw new StudentNotFoundException("List is empty");
        }
        System.out.println("All students");
        for(Student s : studentList){
            System.out.println(" "+s);
        }
    }
    public Student searchStudent(int id) throws StudentNotFoundException{
        for(Student s :studentList){
            if(s.getId() == id){
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found");
    }
    public void updateStudent(String name,int age, String email, int id, String course , double gpa) throws InvalidstudentDataException,StudentNotFoundException{
        Student s = searchStudent(id);
         
        if(name.isBlank()){
            throw new InvalidstudentDataException("name shouldn't be blank");
        }
        if(course.isBlank()){
            throw new InvalidstudentDataException("course can't be empty");
        }

        s.setName(name);
        s.setAge(age);
        s.setCourse(course);
        s.setGpa(gpa);
        System.out.println("Updated");
    }
    public void deletestudent(int id) throws StudentNotFoundException{
        Student s = searchStudent(id);
        studentList.remove(s);
    }
    public int getCount(){
        return studentList.size();
    }
}
