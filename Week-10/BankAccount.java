public class BankAccount {
    // Private attributes: These are "hidden" from other classes for security 
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor to set up the account safely
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        // Validation: Ensure starting balance is not negative 
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Warning: Initial balance cannot be negative. Set to 0.");
        }
    }

    // Public method to add money safely
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    //public method to withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Balance cannot go negative.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn Rs. " + amount);
        }
    }
    // Public getter to view the balance without allowing direct modification 
    public double getBalance() {
        return balance;
    }
}