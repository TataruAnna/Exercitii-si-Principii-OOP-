package Ex_6;

public abstract class BankAccount {
    private int balance;
    private String accountNumber;

    public BankAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void addAccount(Client client){

    }
    public abstract int withdraw (int amount) throws OperationNotSupportedException;

    public abstract int deposit(int amount) throws OperationNotSupportedException;
}
