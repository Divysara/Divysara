public class Swap {
    public static void main(String[] args) {
        int a = 2;
        int b= 4;
        System.out.println("The value of A : " + a);
        System.out.println("The value of B : " + b);
        int c = a;
        a= b;
        b = c;
        System.out.println("The value of A after swapping: " + a);
        System.out.println("The value of B after swapping: " + b);

    }
}
