import java.util.Scanner;

public class ATM {

    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (bankAccount.getBalance() >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
            System.out.println("Deposit of $" + amount + " successful.");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is $" + bankAccount.getBalance());
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        ATM atm = new ATM(bankAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Have a nice day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
