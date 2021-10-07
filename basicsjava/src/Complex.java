import java.util.Scanner;
public class Complex {
    int real;
     int imaginary;
    public static void main(String[] args) {
        Complex obj1 = new Complex();
         
         Scanner myScannerObj = new Scanner(System.in);
         System.out.println("enter value for real" );
         int real = myScannerObj.nextInt();

         System.out.println("enter value for imaginary");
         int imaginary = myScannerObj.nextInt();
         System.out.println("complex number is " +real+" + "+imaginary+"i");
         obj1.sum(real,imaginary);
         obj1.diff(real,imaginary);
         obj1.product(real,imaginary);
         
         System.out.println("Sum : "+obj1.sum(real,imaginary)+ " Diff :"+ obj1.diff(real,imaginary)+" Product : "+obj1.product(real,imaginary));

         myScannerObj.close();
    }
    
    int sum(int real,int imaginary){
         return real+imaginary;
    }
    int diff(int real,int imaginary){
        return real - imaginary;
    }
    int product(int real,int imaginary){
        return real*imaginary;
}
}