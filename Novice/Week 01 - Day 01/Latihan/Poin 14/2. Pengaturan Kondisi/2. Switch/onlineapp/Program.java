package onlineapp;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        System.out.println("Enter the first number: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Choose one of the following operations: ");
        System.out.println("1 - addition");
        System.out.println("2 - substraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        int option = Integer.parseInt(scanner.nextLine());
        double result = 0;
        switch (option) {
            case 1:
                result = a + b;
            break;
            
            case 2:
                result = a - b;
            break;

            case 3:
                result = a * b;
            break;

            case 4:
                result = a / b;
            break; 
        }

        if ((option > 0) && (option < 5))
        {
            System.out.println("Result: " + result);
        }
        else 
        {
            System.out.println("Invalid option");
        }
        System.out.println("Thank you for using my calculator: by nostalgeek");
    }
}