package Ex_12;

import jdk.jshell.ImportSnippet;

import java.util.Arrays;

public class Client extends User {
    private String[] borrowedBooksCodes;
    private int numberOfBorrowedbooks;
    private int maxNumberOfBorrowedBooks;

    public Client(String name, Library library, int maxNumberOfBorrowedBooks) {
        super(name, library);
        this.borrowedBooksCodes = new String[maxNumberOfBorrowedBooks];
        this.numberOfBorrowedbooks = 0;
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

//    public boolean isBookAvailable(String ISBNCode) { //verific daca cartea este in librarie si e disponibila pt inchiriere
//        Book[] bookList = getLibrary().getBookList();
//        for (int i = 0; i < getLibrary().getNumberOfBooksAdded(); i++) { //parcurg lista de carti adaugate in librarie
//            if (ISBNCode.equals(bookList[i].getISBNCode()) && bookList[i].isStatus()) { //daca cartea cautata se gaseste dupa cod,
//                // si este in librarie
//                return true;
//            }
//        }
//        return false;
//
//    }

//    public void viewAvailableBooks() {
//        Book[] bookList = getLibrary().getBookList();
//        for (int i = 0; i < getLibrary().getNumberOfBooksAdded(); i++) {
//            if (bookList[i].isStatus()) {
//                System.out.println(bookList[i].toString());
//            }
//        }
//
//    }

    public boolean borrowBook(String ISBNCode) {

        // la toate copiile cu titlul la fel trebuie crescut BorrowedNumberOfCopies ->
        //merge prin lista, gaseste cartea cu acel cod, si creste numarul de carti imprumutate + seteaza cartea imprumutata pe false
        //adauga codul in borrowedBookCodes
        Book[] bookList = getLibrary().getBookList();
        int n = getLibrary().getNumberOfBooksAdded();
        Book borrowedBook = getLibrary().getBookDetailsByCode(ISBNCode); // imi returneaza cartea cu codul cerut ca sa ii pot accesa autor/titlu

        if (numberOfBorrowedbooks < n && maxNumberOfBorrowedBooks <= numberOfBorrowedbooks && borrowedBook!=null) {  //numarul de carti imprumutate trebuie sa fie mai mic decat numarul de carti totale
                if (borrowedBook.getBorrowedNumberOfCopies() < borrowedBook.getTotalNumberOfCopies()) { //daca numarul de copii imprumutate e mai mic decat numarul total de copii
                    borrowedBooksCodes[numberOfBorrowedbooks] = borrowedBook.getISBNCode(); // imi copiez codul in lista de imprumutate
                    numberOfBorrowedbooks++; //cresc numarul de carti imprumutate

                    for (int i = 0; i <getLibrary().getNumberOfBooksAdded() ; i++) {
                        if(borrowedBook.getTitle().equals(bookList[i].getTitle())&& borrowedBook.getAuthor().equals(bookList[i].getAuthor())){
                            bookList[i].setBorrowedNumberOfCopies((bookList[i].getBorrowedNumberOfCopies()+1));
                        }
                    }
                    changeStatusOfBook(ISBNCode, false);
                    return true;
                } else{
                    return false;
                }



        }
        return true;
        //dupa ce imprumut cartea dorita, verific in lista librariei daca mai exista aceasi carte si ii incrementez numarul de copii imprumutate

    }

//    public Book isDuplicateBook(Book book){
//        Book[] bookList = getLibrary().getBookList();
//        for (int i = 0; i <getLibrary().getNumberOfBooksAdded() ; i++) {
//            if(book.getTitle().equals(bookList[i].getTitle())&& book.getAuthor().equals(bookList[i].getAuthor())){
//                return bookList[i];
//            }
//        }
//        return null;
//    }
//    public void setNumberOfBorrowedBookDuplicate(Book book){
//        book.setBorrowedNumberOfCopies((book.getBorrowedNumberOfCopies()+1));
//    }
    public int findIndexOfBorrowedBook(String ISBNCode){
    for (int i = 0; i <numberOfBorrowedbooks ; i++) {
        if(ISBNCode.equals(borrowedBooksCodes[i])){
            return i;
        }
    }
    return -1;
}
    public boolean returnBook(String ISBNCode) {
        Book[] bookList = getLibrary().getBookList();
        Book returnedBook = getLibrary().getBookDetailsByCode(ISBNCode);
        if (numberOfBorrowedbooks != 0) {  //daca numarul de carti imprumutate e diferit de 0 , adica daca am carti imprumutate
            int index = findIndexOfBorrowedBook(ISBNCode); //caut indexul unde se afla cartea cautata in lista de carti imprumutate
            for (int i = index; i < numberOfBorrowedbooks - 1; i++) { // parcurg lista de coduri imprumutate si sterg codul imprumutat
                borrowedBooksCodes[i] = borrowedBooksCodes[i + 1];
            }
            borrowedBooksCodes[numberOfBorrowedbooks - 1] = null;
            numberOfBorrowedbooks--;

            for (int i = 0; i <getLibrary().getNumberOfBooksAdded() ; i++) {
                if(returnedBook.getTitle().equals(bookList[i].getTitle())&& returnedBook.getAuthor().equals(bookList[i].getAuthor())){
                    bookList[i].setBorrowedNumberOfCopies((bookList[i].getBorrowedNumberOfCopies()-1));

                }
            }
            changeStatusOfBook(ISBNCode, true);
            return true;
        }

        return false;
    }
    public void viewAvailableBooks() {
        Book[] bookList = getLibrary().getBookList();

        for (int i = 0; i < getLibrary().getNumberOfBooksAdded(); i++) {
            if (bookList[i].getTotalNumberOfCopies()>bookList[i].getBorrowedNumberOfCopies() && !isCodeBorrowed(bookList[i].getISBNCode())) { //daca codul este imprumutat si daca numarul de copii totale este mai mare decat numarul de copii imprumutate
                System.out.println(bookList[i].toString());
            }
        }

    }
    public void viewBorrowedBooks() {
        for (int i = 0; i < numberOfBorrowedbooks; i++) {
            System.out.print(borrowedBooksCodes[i]);
            System.out.println();
        }
    }
    public boolean isCodeBorrowed(String ISBNCode){
        for (int i = 0; i < numberOfBorrowedbooks; i++) {
            if(ISBNCode.equals(borrowedBooksCodes[i])){
                return true;
            }
        }
        return false;
    }
    public void changeStatusOfBook(String ISBNCode, boolean status){
       Book[] bookList = getLibrary().getBookList();
        for (int i = 0; i < getLibrary().getNumberOfBooksAdded(); i++) {
            if(ISBNCode.equals(bookList[i].getISBNCode())){
                bookList[i].setStatus(status);
            }
        }
    }

    @Override
    public String toString() {
        return "client{" +
                "name='" + getName() + '\'' +
                ", library=" + getLibrary().getName() +
                ", numberOfBorrowedbooks=" + numberOfBorrowedbooks +
                ", maxNumberOfBorrowedBooks=" + maxNumberOfBorrowedBooks +
                '}';
    }
}
