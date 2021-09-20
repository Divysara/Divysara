import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner enterName = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = enterName.next();
        System.out.println("Your name is: "+ name);
        enterName.close();
    }
}
