package Ex_12;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("carte1","Mihai Eminescu", 123);
        Book book2 = new Book("carte2", "Eliade", 456);
        Library library1 = new Library("Diverta",100,100);
        boolean test = library1.addBook(book1);
        boolean test2 = library1.addBook(book2);
        if(test){
            System.out.println("merge1");
        }
        if(test2){
            System.out.println("merge 2");
        }
        User admin = new Admin("Marcel", library1);
    }
}
