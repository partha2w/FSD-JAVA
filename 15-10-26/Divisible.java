// 3. Problem Statement: Write a Java program to accept a number and display a message if it is divisible by 5.

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num%5==0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }

        sc.close();
    }
}
