import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Question 1 a)
        double num1, num2, Ans;
        num1 = 15;
        num2 = 6;
        Ans = num1 / num2 + num1 % num2;

        System.out.println("Answer " + Ans);

       //Question 1 b)
        double num3, num4, e;
        num1 =  3;
       num2 = 1;
       num3 = 2;
       e = 4;
       Ans = (num1 * e - num2) + (num3 * e * num2);
        System.out.println("Answer " + Ans);

        //Question 1 c)
        num1 = 2;
        num2 = 5;
        num3 = 8;

        Ans = num1 / num2 * num3;

        System.out.println("Answer " + Ans);

        //Question 1d)
        num1 = 1.6;
        num2 = 20;
        num3 = 8;

        Ans = num1 * num2 % num3;

        System.out.println("Answer " + Ans);

        //Question 1e)
        num1 = 25;
        num2 = 4;

        Ans = (double) (num1/num2);

        System.out.println("Answer " + Ans);

        //Question 1f)

        num1 = 2.7;
        num2 = 6.3;

        Ans = (int) num1 + num2;

        System.out.println("Answer " + Ans);

        // Question 1g)
        num1 = 20;
        num2 = 10;
        num3 = 15;
        num4 = 4;

        Ans = num1 - num2 * (num3%num4);

        System.out.println("Answer " + Ans);

        //Question 1h)
        num1 = 7;
        num2 = -5;
        num3 = 4;
        num4 = -3;

        Ans = num1/(num2) + num3%(num4);

        System.out.println("Answer " + Ans);

        //Question 1i)
        num1 = 2;
        num2 = 3;
        num3 = 4;

        Ans = num1 * num2 / (double)num3;

        System.out.println("Answer " + Ans);

        //Question 1j)
        num1 = 4.8;
        num2 = 1.1;

        Ans = (int) num1 % num2;

        System.out.println("Answer " + Ans);

        /*Question 2

        a)(a *x *x + b)/ ((c *x) + d). correct
        b) (a * Math.pow(x,2) + b) / (c *x + d) correct
        c) ((a)(x)(x) + (b)) / ((c)(x) + d) incorrect
        d) (b + x * (x *(a))) / (d + x * (c)) correct
        e) (a) * Math.pow(x,2) + (b) / ((c) *(x) + d) incorrect. this the structure of the equation and will yield a different result
        f) (a *(x *x) + (b) / c *(x) + d. incorrect. This is missing a closing bracket so it will not execute if the script is ran.  */

        //Question 3
        int i, j, k;
        i = 3;
        j = 4;
        k = 2;

        //a
        j = ++i * k--;
        System.out.println("i = " + i);

        //b
        i = 3;
        j = 4;
        k = 2;
        i = --j + k/2;
        System.out.println("i = " + i);

        //c
        i = 3;
        j = 4;
        k = 2;
        k = i-- - j++;
        System.out.println("k = " + k);

        //d
        i = 3;
        j = 4;
        k = 2;
        j = (2*i++)%(++k + 1);
        System.out.println("j = " + j);

        //e
        i = 3;
        j = 4;
        k = 2;
        i += j -= --k;
        System.out.println("i = " + i);

        //f
        i = 3;
        j = 4;
        k = 2;
        i *= j /= k++;
        System.out.println("i = " + i);

        //Question 4
       System.out.println((char)('b' + 6));
       System.out.println((int)('M' - 'T'));

        //Question 5
        System.out.println("5a: " + Math.round(Math.sqrt(20)));
        System.out.println("5b: " + Math.ceil(-4.6));
        System.out.println("5c: " + Math.min(0.0024,1.2e-3));
        System.out.println("5d: " + Math.pow(0.5,-4));

        /*Question 6
       a)  Math.sqrt(Math.PI(Math.pow(a,2)-Math.pow(b,2)));
       b)  Math.pow(x,6) + Math.pow(y,6);
       c)  (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2 * a;
       d) 1/(Math.pow(a,-1) + Math.pow(b,-1)); */

       /* Question 7
     a) y = 1/(Math.pow(Math.sin(1),2)*(x) - (Math.pow(Math.cos(1),2)* (x));
     b) s = Math.sqrt(1 + (Math.pow(Math.tan(1),2) * (x)));
     c) t = Math.log(1-(Math.pow(x,4)));
     d) y = (1/(Math.sqrt(2*Math.PI))) * Math.pow(e,Math.pow(-x,2));*/

       //Question 8
     /* if before x = 7 and y = 4 then after execution of x = y and y = x then x would now contain 4 and y contain 4 as well*/
      int x, y;
      x = 7;
      y = 4;
      x = y;
      y = x;
      System.out.println("x is " + x + " and y is " + y);
      /* the correct way would have been x = x ^ y ^ (y = x);*/
      x = 7;
      y = 4;

        x = x ^ y ^ (y = x);
        System.out.println("x is " + x + " and y is " + y);


        //Question 9
        double a , b, c, mean;
        a = 2.55524;
        b = 3.25632;
        c = 4.75524;
        mean = ((a+b+c)/3);

        System.out.printf("The mean is %.2f %n", mean);

        // Question 10
        double deficit = 47000000, year1, year2, percentage;
        percentage = 1.045;
        year1 = deficit * percentage;
        year2 = year1 * percentage;

        System.out.println(" The deficit in the next two years are  " + year1 + " in year 1 and " + year2 + " in year 2");


        // Question 11
            int number, sum;
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter a three digit number");
        number = S1.nextInt();
        sum = 0;
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of digits : "+ sum);
        System.out.println("The number is " + number);


















    }
}