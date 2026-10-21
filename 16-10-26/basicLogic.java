
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        boolean eligible = (age >= 18) && (mark >= 50);

        System.out.println("Eligible: " + eligible);

        sc.close();
    }
}
