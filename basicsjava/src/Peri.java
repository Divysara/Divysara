import java.util.Scanner;

public class Peri {
    public static void main(String[] args) {
        Peri obj = new Peri();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = obj.Triangle(number);
        System.out.println("Enter the number:");
        int b = obj.Triangle(number);
        System.out.println("Enter the number:");
        int c = obj.Triangle(number);
        obj.Calculations(a, b, c);
        int A, P = obj.Calculations(area,perimeter);
        
        System.out.println("The perimeter of the triangle is " + perimeter);
        System.out.println("The Area of the triangle is " + area);

    }

 int Triangle(Scanner num){
    int valid;
    do{
        while(!num.hasNextInt()){
            System.out.println("please enter a valid no:");
            String garbage = num.next();
        }
    valid = num.nextInt();
    }while(valid<=0); 
    return valid;
}
int Calculations(int a,int b,int c){

    int area = a*b*c;
    int perimeter=a+b+c;
    return area,perimeter;
    
}

}
