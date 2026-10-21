// Task 8: Bank Account Types
// Problem Statement: Create a BankAccount class with account number and balance. Create two child classes, SavingsAccount and CurrentAccount, that inherit from BankAccount. Each child class should display its account type along with the inherited details.
// Sample Output:
// Savings Account
// Account Number: 1001
// Balance: 25000

// Current Account
// Account Number: 1002
// Balance: 50000

public class bank{
    public static void main(String[] args){
        SavingsAccount S1 = new SavingsAccount(1001,25000);
        CurrentAccount S2 = new CurrentAccount(1002,50000);

        S1.Display();
        S2.Display();
    }
}

class BankAccount{
    int accntNo;
    int balance;

    BankAccount(int newAccnt,int newBalance){
        this.accntNo = newAccnt;
        this.balance = newBalance;
    }

    void displayDetails(String type) {
    System.out.println(type);
    System.out.println("Account Number: " + accntNo);
    System.out.println("Balance: " + balance);
}
}

class SavingsAccount extends BankAccount{
    String type;

    SavingsAccount(int accntNo,int balance){
        super(accntNo,balance);
        this.type = "Savings Account";
    }

    void Display() {
        displayDetails("Savings Account");
    }
}

class CurrentAccount extends BankAccount{
    String type;

    CurrentAccount(int accntNo,int balance){
        super(accntNo,balance);
        this.type = "Current Account";
    }

    
    void Display() {
        displayDetails("Current Account");
    }
}