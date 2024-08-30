package AutomationTask3;

public class Account {
    // Data members
    private String accountNumber,Account_Holder_Name;
    private double balance;

    // No-argument constructor
    public Account() {
        this.Account_Holder_Name="Kumaran";
        this.accountNumber = "56987456235";
        this.balance = 50369;
    }

    // Constructor with two arguments
    public Account(String AccountNumber,String Accountholdername ,double Balance) {
        this.Account_Holder_Name =Accountholdername;
        this.accountNumber = AccountNumber;
        this.balance = Balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
           balance=balance+amount;
            System.out.println("Deposite: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance =balance-amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to get account number
    public String getAccountNumber() {
        return accountNumber;
    }



    // Main method for testing
    public static void main(String[] args) {
        // Using the no-argument constructor
        Account account1 = new Account();
        System.out.println("Account Number: " + account1.getAccountNumber() + ", Account Holder Name : "+ account1.Account_Holder_Name);
        System.out.println("Initial Balance: " + account1.checkBalance());
        account1.deposit(1000);
        System.out.println("After Deposite: " + account1.checkBalance());
        account1.withdraw(500);
        System.out.println("Final Balance: " + account1.checkBalance());

        // Using the constructor with arguments
        Account account2 = new Account("123456789","Ranjith", 2000);
        System.out.println("Account Number: " + account2.getAccountNumber() +",  Account Holder Name : "+account2.Account_Holder_Name) ;
        System.out.println("Initial Balance: " + account2.checkBalance());
        account2.deposit(1500);
        System.out.println("After Deposite: " + account2.checkBalance());
        account2.withdraw(3000);
        System.out.println("Final Balance: " + account2.checkBalance());
    }
}
