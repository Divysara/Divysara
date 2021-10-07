import java.util.Scanner;
public class CheckPositive {

    public static void main(String[] args) {
        System.out.println("checking positive no or not?:");
        CheckPositive obj = new CheckPositive();
        Scanner sc = new Scanner(System.in);
        obj.validate(sc);
        sc.close();
        
    }
    int validate(Scanner scan)
    { 
    int num;
        do{
            System.out.println("enter a valid number:");
            while(!scan.hasNextInt()){
                System.out.println("not a valid no, plz type again:"); 
                String name = scan.next();  
            }
        num= scan.nextInt();
        }while(num<=0);
        System.out.println("the entered no is positive :"+ num);
        return num;
    }   
}
