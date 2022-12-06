import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1, num2;
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter two numbers");
        num1 = S1.nextInt();
        num2 = S1.nextInt();
        if (num1 >= num2)
            System.out.println("The greater number is " + num1);
        else
            System.out.println("The greater number is " + num2);

        double Ans;
        System.out.println("Enter a number");
        num1 = S1.nextInt();
        if (num1 < 0)
            Ans = Math.pow(num1, 2);
        else
            Ans = num1 * 2;
        System.out.println("Answer is " + Ans);

        double x, y;

        System.out.println("Enter a number");
        x = S1.nextDouble();
        if (x > 0)
            y = (2 * x) + 1;
        else
            y = (2 * x) - 1;
        System.out.println("y is " + y);

       System.out.println("Enter a number");
        num1 = S1.nextDouble();
        if (num1 >= 1 && num1 <= 10)
            System.out.println("Number is in group 1");
        else if (num1 > 10 && num1 <= 20)
            System.out.println("Number is in group 2");
        else if (num1 > 20 && num1 <= 30)
            System.out.println("Number is in group 3");
        else if (num1 > 30 && num1 <= 40)
            System.out.println("Number is in group 4");
        else if (num1 > 40 && num1 <= 50)
            System.out.println("Number is in group 5");
        else
            System.out.println("Number is out of order");


       System.out.println("Enter a number");
        num1 = S1.nextDouble();
        if (num1 == 1)
            System.out.println("Monday");
        else if (num1 == 2)
            System.out.println("Tuesday");
        else if (num1 == 3)
            System.out.println("Wednesday");
        else if (num1 == 4)
            System.out.println("Thursday");
        else if (num1 == 5)
            System.out.println("Friday");
        else if (num1 == 6)
            System.out.println("Saturday");
        else if (num1 == 7)
            System.out.println("Sunday");
        else
            System.out.println("Not valid ");

      String username, password;
        username = S1.next();
        password = S1.next();
        System.out.println("***************************************************\n" +
                "*                                                 *\n" +
                "*                                                 *\n" +
                "*       Username: " + username+ "                            *\n" +
                "*       Password: " + password+ "                       *\n" +
                "*                                                 *\n" +
                "*                                                 *\n" +
                "*                                                 *\n" +
                "***************************************************");

        if (username.equals("Java")  && password.equals("Test1234$"))
            System.out.println("User name and password are correct");
        else if (!username.equals("Java") && password.equals("Test1234$"))
            System.out.println("Username is not correct");
        else if (username.equals("Java") && !password.equals("Test1234$"))
            System.out.println("Password is incorrect");
        else
            System.out.println("both password and username are incorrect");*/

        double salary, netpay,insu, tax;
        salary = S1.nextDouble();
        insu = salary * 0.10;
        netpay = (salary-insu) + (salary-(salary*tax);
        if (salary >= 100000)
            tax = 0.3;
        System.out.println("Netpay is " + netpay);
        else if (salary < 100000 && salary >= 80000)
            tax = 0.25;
        System.out.println("Netpay is " + netpay);
        else if (salary <80000)










    }
}
