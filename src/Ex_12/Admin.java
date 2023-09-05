package Ex_12;

public class Admin extends User {


    public Admin(String name, Library library) {
        super(name, library);
    }


    public boolean deleteBook(String ISBNCode){
        //sterge cu totul cartea cu toate copiile ei din librarie
        return true;
    }

    public boolean deleteBook(String ISBNCode, int numberOfCopies){

        //sterge o copie sau mai multe  a cartii  din lista
        return true;
    }
    public void listAllBooks(){

    }

    //listBookDetails() - Va printa detaliile unei singure carti din biblioteca, in functie de codul ISBNCode
    public void listBookDetails(String ISBNCode){

    }
    //viewBorrowedBooks() - Va lista codurile ISBNCode ale cartilor imprumutate de un client, in functie de numele clientului primi ca parametru.
    // Atentie: toate metodele vor trebui sa primeasca ca parametru in plus o biblioteca

    public void viewBorrowedBooks(String name){

    }
    public int changeMaxNumberOfBorrowedBooks(String name){
        //caut in lista de clienti a librariei numele clientului
        // daca il gasesc ii setez numarul maxim de carti pe care le poate imprumuta
        //clientList[i].set
        return 2;
    }
}
