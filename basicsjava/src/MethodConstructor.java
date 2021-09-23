import java.util.Scanner;
public class MethodConstructor {
public static void main(String[] args) {
    
    Method mc = new Method();
    int price = 250;
    System.out.println("the value of the product is " + price);
    System.out.println("the value of the product is "+ mc.price);
    System.out.println("the name of the product is " + mc.product);
    mc.display(); 
}
}
     class Method{
           int price;
         String product;
        Method(){
            System.out.println(" Enter the product and price : ");
            Scanner details = new Scanner(System.in);
             product = details.next();
           price = details.nextInt();
            System.out.println("The price of the product " + product + " is: " + price);       
    }
    void display()
    {
        System.out.println("The price of the product " +  product+ " is " + price );
    }
    }


    
