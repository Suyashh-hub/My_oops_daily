class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = (initialDeposit > 0) ? initialDeposit : 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Error: Insufficient funds for withdrawal of $" + amount);
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }

    public void checkBalance() {
        System.out.println(accountHolder + "'s Current Balance: $" + this.balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount("Alex Smith", "987654321", 500.0);

        savingsAccount.checkBalance();
        savingsAccount.deposit(150.50);
        savingsAccount.withdraw(200.0);
        savingsAccount.checkBalance();

        System.out.println("\n--- Testing Edge Cases ---");
        savingsAccount.withdraw(1000.00);
        savingsAccount.deposit(-50.0);
    }
}
