package Ex_12;

public class User {
    private String name;
    private Library library;

    public User(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }


    public boolean isBookAvailable(String ISBNCode) { //verific daca cartea este in librarie si e disponibila pt inchiriere
        Book[] bookList = getLibrary().getBookList();
        for (int i = 0; i < getLibrary().getNumberOfBooksAdded(); i++) { //parcurg lista de carti adaugate in librarie
            if (ISBNCode.equals(bookList[i].getISBNCode()) && bookList[i].isStatus()) { //daca cartea cautata se gaseste dupa cod,
                // si este in librarie
                return true;
            }
        }
        return false;

    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", library=" +library.getName() +
                '}';
    }
}
