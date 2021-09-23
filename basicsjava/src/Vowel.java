import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char x = letter.next().charAt(0);
        switch(x){
            case 'a':
            System.out.println("The letter is a vowel");
            break;
            case 'e':
            System.out.println("The letter is a vowel");
            break;
            case 'i':
            System.out.println("The letter is a vowel");
            break;
            case 'o':
            System.out.println("The letter is a vowel");
            break;
            case 'u':
            System.out.println("The letter is a vowel");
            break;
            default:
            System.out.println("The letter is a consonant");




        }
    }
    
}

