import java.time.Year;
import java.util.Scanner;
class student1{
    public int age=20;
    public String name ="Dhivya";
}
   class student2{
    public int age1;
   public String name1;
     void getinput()
    {
    Scanner getData = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name1 = getData.next();
    Scanner getage = new Scanner(System.in);
    System.out.println("Enter the age:");
    age1 = getage.nextInt();
    System.out.println("the given name is :" + name1);
    System.out.println("the given age is :" + age1); 

    }
}
public class Student {
    public static void main(String[] args) {
        student1 obj= new student1();
        System.out.println("The name of student1:  " + obj.name);
        System.out.println("The age of student1:  " + obj.age);
        student2 obj1 = new student2();
        obj1.getinput();
        
    }   
    
}



