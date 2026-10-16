// 4. Problem Statement: Write a Java program to accept two numbers and an operator (+, -, *, /). Use a switch statement to perform the selected arithmetic operation.


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char opr = sc.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}

