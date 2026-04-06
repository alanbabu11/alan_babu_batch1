package Student_Management_System.core;

import Student_Management_System.exceptions.*;
import Student_Management_System.models.Student;
public abstract class Management {
   public abstract void addStudent(Student student) throws InvalidstudentDataException,DuplicateDataException;
   public abstract void viewall() throws InvalidstudentDataException,StudentNotFoundException;
   public abstract Student searchStudent(int id) throws StudentNotFoundException;
   public abstract void updateStudent(String name,int age, String email, int id, String course , double gpa) throws InvalidstudentDataException,StudentNotFoundException;
   public abstract void  deletestudent(int id) throws StudentNotFoundException;
   public abstract int getCount();
}