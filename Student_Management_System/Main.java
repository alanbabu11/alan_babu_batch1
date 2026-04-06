package Student_Management_System;
import java.util.InputMismatchException;
import java.util.Scanner;
import Student_Management_System.core.*;
import Student_Management_System.exceptions.*;
import Student_Management_System.models.*;
public class Main {
   static Scanner sc = new Scanner(System.in);
   static StudentManager manager = new StudentManager();
    public static void main(String[] args) {
        int choice;
         do{
            System.out.println("Enter your choice : ");
            try{
                choice = sc.nextInt();
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                choice=-1;
                continue;
            }
            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewall();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deletestudent();
                    break;
                case 6:
                    getCount();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default :
                    System.out.println("Invalid choice");
            }
         }while(choice!=0);

    }
    static void addStudent(){
        
            System.out.print("Enter Name of the Student : ");
            String name = sc.nextLine().trim();
            System.out.print("\nEnter Age of the Student : ");
            int age = sc.nextInt();
            System.out.print("\nEnter the course of the student : ");
            String course = sc.nextLine().trim();
            // System.out.print("\n");
    }
    static void viewall(){

    }
    static void searchStudent(){

    }
    static void updateStudent(){

    }
    static void deletestudent(){

    }
    static void getCount(){

    }
}
