package Ex_12;

public class Library {
    private String name;
    private Book[] bookList;
    private Client[] clientList;
    private int numberOfBooksAdded;
    private int numberOfClientsAdded;

    public Library(String name, int numberOfTotalBooks, int numberOfMaxClients) {
        this.name = name;
        this.bookList = new Book[numberOfTotalBooks];
        this.clientList = new Client[numberOfMaxClients];
        this.numberOfBooksAdded=0;
        this.numberOfClientsAdded=0;

    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public Client[] getClientList() {
        return clientList;
    }

    public void setClientList(Client[] clientList) {
        this.clientList = clientList;
    }

    public boolean addBook(Book book){

        bookList[numberOfBooksAdded]=book;
        numberOfBooksAdded++;
        return true;
    }
}
