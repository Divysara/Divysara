public class Add2nos {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        int c= a+b;
        double d = a;
        double e = 23.89d;
        int f= (int)e;
        //int f= e;       //this throw syntax error. double values cant be converted to in unless we specify it
        System.out.println("The addtion of two nos: a and b is " + c + ","+ d + ", "+ f);

    }
}
