
import java.util.*;
class Student{
    int studentId;
    String studentName;
    int studentAge;
    Scanner sc=new Scanner(System.in);
    
     public void acceptDetails(){
        System.out.println("enter student Id :");
        studentId=sc.nextInt();
        System.out.println("enter student Name :");
        studentName=sc.next();
        System.out.println("enter age :");
        studentAge=sc.nextInt();
     }
     public void displayDetails(){
        System.out.println("StundetId :"+studentId);
        System.out.println("Student name: "+ studentName);
        System.out.println("student age"+studentAge);
     }
}


public class classAndObjects {
    public static void main(String[] args) {
        //creating an object of class Student
        Student student=new Student();
        student.acceptDetails();
        

        Student student2=new Student();
        student2.acceptDetails();
        student.displayDetails();
        student2.displayDetails();
    }
    
}
