package Ex_6;

import org.w3c.dom.ls.LSOutput;

public class Client {
    private String firstName;
    private String lastName;
    private BankAccount[] accounts;
    private int numberOfAccountsAdded;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new BankAccount[20];
        numberOfAccountsAdded = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public int getNumberOfAccountsAdded() {
        return numberOfAccountsAdded;
    }

    public void setNumberOfAccountsAdded(int numberOfAccountsAdded) {
        this.numberOfAccountsAdded = numberOfAccountsAdded;
    }

    public boolean addAccount(BankAccount account) {
        accounts[numberOfAccountsAdded] = account;
        numberOfAccountsAdded++;
        return true;
    }

    public void listAccounts() {
        for (int i = 0; i < numberOfAccountsAdded; i++) {
            System.out.println(accounts[i]);
        }
    }

    public int deposit(int amount, String accountNumber) throws OperationNotSupportedException{
        //caut in accounts contul cu numarul account number
        //depozitez in el suma de bani amount
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            return Integer.MIN_VALUE;

        }
        return account.deposit(amount);
    }

    public int withdraw(int amount, String accountNumber) throws OperationNotSupportedException{
        //caut in accounts contul cu numarul account number
        //depozitez in el suma de bani amount
        BankAccount account = findAccount(accountNumber);
        if (account == null) {
            return Integer.MIN_VALUE;

        }
        return account.withdraw(amount);
    }

    //withdraw a la fel ca deposit
    public BankAccount findAccount(String accountNumber) {

        for (int i = 0; i < numberOfAccountsAdded; i++) {
            if (accountNumber.equals(accounts[i].getAccountNumber())) {
                return accounts[i];
            }
        }
        return null;
    }

    public String checkAccountDetails(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if(account==null){
            return "nu exista contul";
        }
        return account.toString() + this.lastName + " " + this.lastName;

    }
}
