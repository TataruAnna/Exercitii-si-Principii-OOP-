package Ex_6;

public class BankingApp {
    public static void main(String[] args) {
        Client client = new Client("Georgel", "Ionica"); //de apelat constructorul cu parametrii dupa ce va fi creat
        BankAccount account1 = new SpendingAccount(700, "numarul1",250); // trebuie completata clasa
        BankAccount account2 = new StudentAccount(500,"numarul2",200); // trebuie completata clasa
        BankAccount account3 = new StudentAccount(500,"numarul3",200); // trebuie completata clasa
        BankAccount account4 = new SpendingAccount(800,"numarul4", 150); // trebuie completata clasa

        client.addAccount(account1);
        client.addAccount(account2);
        client.addAccount(account3);
        client.addAccount(account4);

        client.listAccounts();
        System.out.println(client.checkAccountDetails("numarul3")); //de completat functia
        try {
            client.withdraw(100, "numarul2"); //de completat functia
        }catch(OperationNotSupportedException e){
            System.out.println(e.getMessage());
        }
            System.out.println(client.checkAccountDetails("numarul2"));
//        client.withdraw(100, "numarul2");
//        System.out.println(client.checkAccountDetails("numarul2"));
//        client.deposit(2001, "numarul4");
    }

}
