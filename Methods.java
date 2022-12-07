import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // public static (type of function) (name of function)

        Scanner s1 = new Scanner(System.in);
        int x, n;
        ;
        System.out.println("Enter two numbers");
        x = s1.nextInt();
        n = s1.nextInt();

        int sign = -1;
        double sum = 0;
        for (int i=1; i<=n;i+=2){
            sum=sum*sign;
            sum += (double)(pow(x,i))/(fact(i));
        }
        System.out.println(sum);
    }

    public static void sumfunction(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        System.out.println(sum);

    }

    public static void powfunction(int num1, int num2) {// void function prints the result inside the function
        int pow = 1;

        for (int i = 1; i <= num2; i++) {
            pow = pow * num1;
        }
        System.out.println(pow);

    }

    public static int pow(int num1, int num2) {// this type returns the value in the main function
        int p = 1;
        for (int i = 1; i <= num2; i++) {
            p = p * num1;
        }
        return p;
    }

    public static int fact(int num1) {
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
