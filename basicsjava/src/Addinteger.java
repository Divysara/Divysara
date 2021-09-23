import java.util.Scanner;

public class Addinteger {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        int i = integer.nextInt();
        System.out.println("Enter the second number: ");
        int j = integer.nextInt();
        int k= i + j;
        System.out.println(" The sum of given integers is "+ k);


    }
}
