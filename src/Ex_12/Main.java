package Ex_12;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("carte1","autor1", "abc123");
        Book book2 = new Book("carte2", "autor2", "cbd258");
        Book book3 = new Book("carte3", "autor3", "xyz258");
        Book book4 = new Book("carte4", "autor4", "qwe586");
        Book book5 = new Book("carte5", "autor5", "tyu789");
        Book book6 = new Book("carte6", "autor6", "pli254");
        Book book7 = new Book("carte7", "autor7", "fds456");
        Book book8 = new Book("carte8", "autor8", "wer478");
        Book book9= new Book("carte2", "autor2", "asd963");
        Book book10= new Book("carte1", "autor1", "dfg963");
        Book book11= new Book("carte1", "autor1", "dfg9613");
        Library library1 = new Library("Diverta",100,100);
        Client client1 = new Client("Popescu Ion", library1, 25);
        Client client2 = new Client("Nechifor Ciprian", library1, 25);
        Client client3 = new Client("Maria Ana", library1, 25);
        Client client4 = new Client("Denisa Ursu", library1, 25);
        Client client5 = new Client("Domitian Sebastian", library1, 25);

        Admin admin = new Admin("Marcel Purcel", library1);

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        library1.addBook(book6);
        library1.addBook(book7);
        library1.addBook(book8);
        library1.addBook(book9);
        library1.addBook(book10);
        library1.addBook(book11);

        library1.addClient(client1);
        library1.addClient(client2);
        library1.addClient(client3);
        library1.addClient(client4);
        library1.addClient(client5);


        Book[] books = library1.getBookList();

//        library1.viewListOfAllClients();
//        Client clientTest = admin.isClientInList("Popescu Ion");
//        System.out.println(clientTest.toString());
//        admin.changeMaxNumberOfBorrowedBooks("Popescu Ion", 10);
//        System.out.println(client1.toString());



        client1.viewAvailableBooks();
        System.out.println();
        client1.borrowBook("abc123");
        client1.borrowBook("dfg963");
        client1.borrowBook("dfg9613");


        client1.borrowBook("cbd258");
        System.out.println("clientul vede cartile imprumutate:");
//       client1.viewBorrowedBooks();
//        System.out.println("Cartile vazute de admin:");

        System.out.println("clietul returneaza cartea abc123");
       client1.returnBook("abc123");

//        System.out.println("Cartile vazute de admin:");
//        admin.viewAvailableBooks();
//        System.out.println("Cartile vazute de client: ");
//        System.out.println();
//        client1.viewAvailableBooks();
//        System.out.println("toate cartile: ");
//        library1.viewListOfAllBooks();
//        client1.viewBorrowedBooks();


        try{
            admin.listBookDetails("abc123");
            admin.listAllBooks(library1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
