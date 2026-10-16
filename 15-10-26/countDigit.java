// Problem Statement: Write a Java program to count the number of digits in a positive integer using a for loop.
// Sample Output:
// Enter a number: 12345
// Number of digits: 5

import java.util.Scanner;

public class countDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }

        System.out.println(count);
    }
}
