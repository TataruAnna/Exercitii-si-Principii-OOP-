package Ex_12;

public class Admin extends User {


    public Admin(String name, Library library) {
        super(name, library);
    }


    public boolean deleteBook(String ISBNCode){

        //sterge cu totul cartea cu toate copiile ei din librarie
        //cartea sau copiile ei nu trebuie sa fie imprumutate
        return true;
    }

    public boolean deleteBook(String ISBNCode, int numberOfCopies){

        //sterge o copie sau mai multe  a cartii  din lista
        return true;
    }
    public void listAllBooks(Library library)throws Exception{
        Book[] bookList = library.getBookList();
        if(library.getNumberOfBooksAdded()==0){
            throw new Exception("Nu sunt carti in lista de carti a librariei");
        }
        for (int i = 0; i < library.getNumberOfBooksAdded() ; i++) {
            System.out.println(bookList[i].getISBNCode()+" "
                    + bookList[i].getTitle()+ " "
                    + bookList[i].getAuthor() + " "
                    + bookList[i].getTotalNumberOfCopies()+ " "
                    + bookList[i].getBorrowedNumberOfCopies()+" "
                    + bookList[i].isStatus());
        }

    }

    //listBookDetails() - Va printa detaliile unei singure carti din biblioteca, in functie de codul ISBNCode
    public void listBookDetails(String ISBNCode) throws Exception{
        Book book = getLibrary().getBookDetailsByCode(ISBNCode);
            if(!ISBNCode.equals(book.getISBNCode())){
                throw new Exception("Cartea nu exista in lista librariei! ");
            }
            System.out.println("Cartea cu codul: "+ book.getISBNCode() + " are titlul: "
                    + book.getTitle() + " si autorul: "
                    + book.getAuthor() + ". In total sunt "
                    + book.getTotalNumberOfCopies() + " copii, din care imprumutate "
                    + book.getBorrowedNumberOfCopies() );

    }
    //viewBorrowedBooks() - Va lista codurile ISBNCode ale cartilor imprumutate de un client, in functie de numele clientului primi ca parametru.
    // Atentie: toate metodele vor trebui sa primeasca ca parametru in plus o biblioteca

    public Client isClientInList(String name){
        Client[] clientList = getLibrary().getClientList();
        int n = getLibrary().getNumberOfClientsAdded();
        for (int i=0;i<n;i++){
            if(name.equals(clientList[i].getName())){
                return clientList[i];
            }

        }
        return null;
    }
    public void viewBorrowedBooks(String name){
        Client existingClient = isClientInList(name);
        if(existingClient!=null){
            existingClient.viewBorrowedBooks();
        }

    }
    public void changeMaxNumberOfBorrowedBooks(String name,int maxNumberOfBorrowedBooks){
        Client existingClient = isClientInList(name);
        //caut in lista de clienti a librariei numele clientului
        if(existingClient!=null){
            existingClient.setMaxNumberOfBorrowedBooks(maxNumberOfBorrowedBooks);
        }
        // daca il gasesc ii setez (schimb) numarul maxim de carti pe care le poate imprumuta


    }
}
