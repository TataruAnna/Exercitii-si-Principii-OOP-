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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBooksAdded() {
        return numberOfBooksAdded;
    }

    public void setNumberOfBooksAdded(int numberOfBooksAdded) {
        this.numberOfBooksAdded = numberOfBooksAdded;
    }

    public int getNumberOfClientsAdded() {
        return numberOfClientsAdded;
    }

    public void setNumberOfClientsAdded(int numberOfClientsAdded) {
        this.numberOfClientsAdded = numberOfClientsAdded;
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

    public Book getBookDetailsByCode(String ISBNCode) {
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if (ISBNCode.equals(bookList[i].getISBNCode())) {
                return bookList[i];

            }
        }
        return null;
    }
    public boolean addBook(Book book){
        book.setTotalNumberOfCopies(1);
        for (int i = 0; i <numberOfBooksAdded ; i++) {
            if((bookList[i].getTitle().equals(book.getTitle()))&& (bookList[i].getAuthor().equals(book.getAuthor()))){
                bookList[i].setTotalNumberOfCopies(bookList[i].getTotalNumberOfCopies()+1);
                book.setTotalNumberOfCopies(book.getTotalNumberOfCopies()+1);
            }
        }
        bookList[numberOfBooksAdded]=book;
        numberOfBooksAdded++;


        return true;
    }
    public boolean addClient(Client client){
        clientList[numberOfClientsAdded]= client;
        numberOfClientsAdded++;
        return true;
    }

    public boolean isBookInList(String ISBNCode){
        for (int i = 0; i <numberOfBooksAdded ; i++) {
            if(ISBNCode.equals(bookList[i].getISBNCode())){
                return true;
            }
        }
        return false;
    }

    public int findIndexOfBook(String ISBNCode){
        for (int i = 0; i <numberOfBooksAdded ; i++) {
            if(ISBNCode.equals(bookList[i].getISBNCode())){
                return i;
            }
        }
        return -1;
    }
    public void viewListOfAllBooks(){
        for (int i = 0; i <numberOfBooksAdded ; i++) {
            System.out.println(bookList[i].getTitle() + " "
                    + bookList[i].getAuthor()+ " "
                    + bookList[i].getISBNCode()+" "
                    + bookList[i].getTotalNumberOfCopies() + " "
                    + bookList[i].isStatus());

        }
    }
    public void viewListOfAllClients(){
        for (int i = 0; i <numberOfClientsAdded ; i++) {
            System.out.println(clientList[i].getName());
        }
    }
}
