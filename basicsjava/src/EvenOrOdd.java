import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = num.nextInt();
        int j = i%2;
        if(j==0)
        System.out.println("The given no is even.");
        else
        System.out.println("The given no is odd.");
    }
}
