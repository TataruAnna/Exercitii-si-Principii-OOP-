package Ex_6;

public class SpendingAccount extends BankAccount{
    private int maxWithdrawlAmount;

    public SpendingAccount(int balance, String accountNumber, int maxWithdrawlAmount) {
        super(balance, accountNumber);
        this.maxWithdrawlAmount = maxWithdrawlAmount;
    }

    public int getMaxWithdrawlAmount() {
        return maxWithdrawlAmount;
    }

    public void setMaxWithdrawlAmount(int maxWithdrawlAmount) {
        this.maxWithdrawlAmount = maxWithdrawlAmount;
    }

    @Override
    public int withdraw(int amount) throws OperationNotSupportedException {
        if(amount > maxWithdrawlAmount + getBalance()){
           throw new OperationNotSupportedException(" nu poti retrage mai mult decat "+ maxWithdrawlAmount + " plus "+ getBalance());
        }
        setBalance(getBalance() - amount);
        return getBalance();
    }

    @Override
    public int deposit(int amount) throws OperationNotSupportedException{
        setBalance(getBalance()+amount);
        return getBalance();
    }

    @Override
    public String toString() {
        return "SpendingAccount{" +
                " maxWithdrawlAmount=" + maxWithdrawlAmount +
                " balance= " + getBalance() +
                " acount number= " + getAccountNumber() +
                '}';
    }
}
