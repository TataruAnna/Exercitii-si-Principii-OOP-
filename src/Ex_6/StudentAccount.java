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
    public int withdraw(int amount) throws OperationNotSupportedException{
       if(amount < getBalance()){
           throw new OperationNotSupportedException(" You cannot withdraw more than you have in your student account ");
       }
        setBalance(getBalance()-amount);
        return getBalance();
    }

    @Override
    public int deposit(int amount) throws OperationNotSupportedException{
        if (amount > maxDepositAmount){
            throw new OperationNotSupportedException("You cannot deposit more than " + maxDepositAmount);
        }
        setBalance(getBalance() + amount);
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
