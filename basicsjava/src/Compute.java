import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println(" Enter the no: ");
        int i = number.nextInt();
        System.out.println("Enter the second no: ");
        int j = number.nextInt();
        System.out.println("The remainder is: "+ i%j);
        System.out.println("The quotient is: "+ i/j);




    }
}
