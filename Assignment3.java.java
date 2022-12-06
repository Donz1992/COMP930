import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double num1, num2, sum = 0;
        double i=1;
       Scanner S1 = new Scanner(System.in);
     System.out.println("Enter two numbers");
      num1 = S1.nextDouble();
       while(i <= num1/2)
        {
            if(num1 % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==num1)
        {
            System.out.println(num1 +" is a perfect number.");
        }
        else
            System.out.println(num1 +" is not a perfect number.");

        //Question 2
        int first_num = 1;
        num2 = 999;

        for (int j = first_num +1; j< num2;j++){
            int digits = 0, sumof =0;
            int number = j, counter = 0;
            while (number != 0) {
             digits = number%10;
             sumof = sumof + (digits*digits*digits);
                number /= 10;
            }
            if (j == sumof){
                if(counter == 0){
                    System.out.print("These special numbers are: ");
                }

            System.out.println(j);
            counter++;
        }

        //Question 3
        double x, exp = 0, base_num = 1;
        System.out.print("Enter a value for x: ");
        x = S1.nextDouble();

        for (i = 1; exp != exp + base_num; i++) {
            exp += base_num;
            base_num *= (x / i);
        }
        System.out.println("e^" + x + " = " + exp);



    }
}}