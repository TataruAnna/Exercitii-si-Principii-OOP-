package Ex_12;

public class Book {
    private String title;
    private String author;
    private String ISBNCode;
    private int totalNumberOfCopies;
    private int borrowedNumberOfCopies;

    private boolean status; //  statusul e true daca cartea e in biblioteca si false daca e imprumutata

    public Book(String title, String author, String ISBNCode) {
        this.title = title;
        this.author = author;
        this.ISBNCode = ISBNCode;
        this.status=true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBNCode() {
        return ISBNCode;
    }

    public void setISBNCode(String ISBNCode) {
        this.ISBNCode = ISBNCode;
    }

    public int getTotalNumberOfCopies() {
        return totalNumberOfCopies;
    }

    public void setTotalNumberOfCopies(int totalNumberOfCopies) {

        this.totalNumberOfCopies = totalNumberOfCopies;
    }

    public int getBorrowedNumberOfCopies() {
        return borrowedNumberOfCopies;
    }

    public void setBorrowedNumberOfCopies(int borrowedNumberOfCopies) {
        this.borrowedNumberOfCopies = borrowedNumberOfCopies;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBNCode='" + ISBNCode + '\'' +
                ", totalNumberOfCopies=" + totalNumberOfCopies +
                ", borrowedNumberOfCopies=" + borrowedNumberOfCopies +
                ", status=" + status +
                '}';
    }
}
