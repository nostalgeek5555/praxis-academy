package onlineapp;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and I'll get its square root");
        int a = Integer.parseInt(scanner.nextLine());
        if (a > 0)
        {
            System.out.println("The number you entered is greater than 0, so I can calculate it!");
            double o = Math.sqrt(a);
            System.out.println("The square root of " + a + " is " + o);
        }
        else
            System.out.println("I can't calculate the square root of a negative number!");
        System.out.println("Thanks for the input!");
    }
}