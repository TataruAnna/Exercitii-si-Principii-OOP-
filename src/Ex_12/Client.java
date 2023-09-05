package Ex_12;

public class Client extends User{
    private String[] borrowedBooksCodes;
    private int numberOfBorrowedbooks;
    private int maxNumberOfBorrowedBooks;

    public Client(String name, Library library, int maxNumberOfBorrowedBooks) {
        super(name, library);
        this.borrowedBooksCodes = new String[maxNumberOfBorrowedBooks];
        this.numberOfBorrowedbooks=0;
    }

    public String[] getBorrowedBooksCodes() {
        return borrowedBooksCodes;
    }

    public void setBorrowedBooksCodes(String[] borrowedBooksCodes) {
        this.borrowedBooksCodes = borrowedBooksCodes;
    }

    public int getNumberOfBorrowedbooks() {
        return numberOfBorrowedbooks;
    }

    public void setNumberOfBorrowedbooks(int numberOfBorrowedbooks) {
        this.numberOfBorrowedbooks = numberOfBorrowedbooks;
    }

    public int getMaxNumberOfBorrowedBooks() {
        return maxNumberOfBorrowedBooks;
    }

    public void setMaxNumberOfBorrowedBooks(int maxNumberOfBorrowedBooks) {
        this.maxNumberOfBorrowedBooks = maxNumberOfBorrowedBooks;
    }

    public boolean isBookAvailable(String ISBNCode){

        return true;

    }
    public void viewAvailableBooks(){
        //numarul de carti imprumutate trebuie sa fie mai mic decat numarul de carti totale
    }

    public boolean borrowBook(String ISBNcode){
        //merge prin lista, gaseste cartea cu acel cod, si creste numarul de carti imprumutate
        //adauga codul in borrowedBookCodes
        return true;
    }

    public boolean returnBook(String ISBNCode){
        return true;
    }

}
