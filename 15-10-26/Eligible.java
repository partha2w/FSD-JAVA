// 2. Problem Statement: Write a Java program to accept a person's age and display "Eligible to Vote" if the age is 18 or above.

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >=18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
