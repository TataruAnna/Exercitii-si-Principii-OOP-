package Ex_6;

public class StudentAccount extends BankAccount{
    private final int maxDepositAmount;


    public StudentAccount(int balance, String accountNumber, int maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public int getMaxDepositAmount() {
        return maxDepositAmount;
    }

    @Override
    public int withdraw(int amount) {
       if(amount <= getBalance()){
           setBalance(getBalance()-amount);
       }
        return getBalance();
    }

    @Override
    public int deposit(int amount) {
        if (amount <= maxDepositAmount){
            setBalance(getBalance() + amount);
        }
        return getBalance();

    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "maxDepositAmount=" + maxDepositAmount +
                " balance= " + getBalance() +
                " acount number= " + getAccountNumber() +
                '}';
    }
}
