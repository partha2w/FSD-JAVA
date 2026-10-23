// Task 2: Bank Account Management
// Scenario: A bank needs a secure system to manage customer account balances. Customers should not be able to change their balance directly.

// Requirements:
// 1. Create a class BankAccount with private variables accountNumber, accountHolder, and balance.
// 2. Initialize account details using a constructor.
// 3. Create a deposit(double amount) method.
// 4. Create a withdraw(double amount) method.
// 5. Prevent withdrawals when the amount exceeds the available balance.
// 6. Create a getBalance() method to display the balance without allowing direct modification.
// Expected output:
// Account Holder: Ravi
// Initial Balance: 10000
// Deposit Amount: 2000
// Withdrawal Amount: 3000
// Available Balance: 9000
// Insufficient balance!


class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Amount: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, "Ravi", 10000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);

        account.withdraw(3000);

        System.out.println("Available Balance: " + account.getBalance());

        account.withdraw(10000);
    }
}
