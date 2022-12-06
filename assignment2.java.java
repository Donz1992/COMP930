
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Question 13
        Scanner S1 = new Scanner(System.in);

        System.out.print("Enter the employee full name: ");
        String fname = S1.nextLine();

        System.out.print("Enter the hourly pay rate: $");
        double hourly_pay = S1.nextDouble();

        System.out.print("Enter the number of hours worked: ");
        double hours = S1.nextDouble();

        System.out.print("Enter tax category {A,B,C,D,E}: ");
        String tax_cat = S1.next();

        System.out.print("Contribution to United Way (Y/N): ");
        String contribution = S1.next();

        double gross_pay;

        if (hours > 40) {
            double overtime = hours - 40;
            gross_pay = overtime * (2 * hourly_pay) + (40 * hourly_pay);
        } else {
            gross_pay = hourly_pay * hours;
        }

        System.out.println("Name: " + fname);
        System.out.println("Gross Pay before deduction: $" + gross_pay);

        double gross_pay_after_charity;

        if (contribution.equals('Y')) {

            gross_pay_after_charity = gross_pay - 20;
            System.out.println("Gross Pay after United Way Charity: $" + gross_pay_after_charity);
        } else
            gross_pay_after_charity = gross_pay;
        System.out.println("Gross Pay: $" + gross_pay_after_charity);

        double tax_deduction = 0;

        if (tax_cat.equals('A')) {
            tax_deduction = 0;
            System.out.println("Total Tax deduction: " + tax_deduction);
        } else if (tax_cat.equals('B')) {

            tax_deduction = 0.10 * gross_pay_after_charity;
            System.out.println("Total Tax deduction: " + tax_deduction);
        } else if (tax_cat.equals('C')) {

            tax_deduction = 0.20 * gross_pay_after_charity;
            System.out.println("Total Tax deduction: " + tax_deduction);
        } else if (tax_cat.equals('D')) {

            tax_deduction = 0.29 * gross_pay_after_charity;
            System.out.println("Total Tax deduction: " + tax_deduction);
        } else if (tax_cat.equals('E')) {
            tax_deduction = 0.35 * gross_pay_after_charity;
            System.out.println("Total Tax deduction: " + tax_deduction);
        } else
            System.out.println("Tax category not valid");

        double net_pay = gross_pay_after_charity - tax_deduction;

        System.out.println("Net pay: $" + net_pay);


//Question 14

        int cent = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int dollar = 100;


        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int cents = 0;


        System.out.println("Please enter an amount of money you have in cents: ");
        cents = S1.nextInt();

        if (cents >= 100) {
            dollar = cents / dollar;
            cents = cents % dollar;
        }
        else if (cents >= 25) {
            quarters = cents / quarter;
            cents = cents % quarter;
        }
        else if (cents >= 10) {
            dimes = cents / dime;
            cents = cents % dime;
        }
        else if (cents >= 5) {
            nickels = cents / nickel;
            cents = cents % nickel;
        }
        else
            cents = cent;



        System.out.printf("Your change is : %d dollar, %d quarters, %d dime, %d nickels, and %d cents.\n", dollar, quarters, dimes, nickels, cents);


        //Question 15
        double income, housecost, totalChildren, schoolChild;
        Scanner S3 = new Scanner(System.in);
        System.out.println("Enter income: ");
        income = S3.nextDouble();

        System.out.println(" Enter housing cost: ");
        housecost = S3.nextDouble();

        System.out.println("How many children do you have: ");
        totalChildren = S3.nextDouble();

        System.out.println("How many of your children are still in school: ");
        schoolChild = S3.nextDouble();

        double tax = 0.18;
        double tax_reduction, tax_amount;

        if (income <= 10000) {
            tax_amount = 0;
            System.out.println("Income not taxable");
        } else if (income <= 10000 && housecost >= 8000) {
            tax_amount = income * tax;
            System.out.println("Tax amount is: $" + tax_amount);
        } else
            tax_amount = (income - 10000) * tax;
        System.out.println("Tax amount is: $" + tax_amount);

        double  surtax;
        surtax = 0.15;
        if (totalChildren > 0) {
            tax_reduction = totalChildren * 500;
            tax_amount = ((income - 10000) * tax) - tax_reduction;
            System.out.println("Tax amount with children is: $" + tax_amount);

        } else if (totalChildren > 0 && schoolChild > 0) {
            tax_reduction = ((totalChildren - schoolChild) * 500) + (schoolChild * 1000);
            tax_amount = ((income - 10000) * tax) - tax_reduction;
            System.out.println("Tax amount because of with children is: $" + tax_amount);
        } else
            tax_amount = (income - 10000) * tax;
        System.out.println("Tax amount is: $" + tax_amount);

        double tax_after_surtax;
        if (tax_amount >= 2000){
            tax_after_surtax = (tax_amount * surtax) + tax_amount;
        System.out.println("Tax amount after surtax is: " + tax_after_surtax);
    }
        else
            System.out.println("No surtax applied");

        if (housecost < 6000 && totalChildren > 2 && schoolChild > 0)
            System.out.println("Citizen is eligible for refund");
        else
            System.out.println("Citizen not eligible for refund");


    }
}





