package B._3;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("Dune");
        Book book3 = new Book("Atlas of Heart");

        Magazine magazine1 = new Magazine("Bishkekchanka");
        Magazine magazine2 = new Magazine("Hell Boy");
        Magazine magazine3 = new Magazine("New York Times");

        Printable[] printables = new Printable[6];
        printables[0] = book1;
        printables[1] = book2;
        printables[2] = book3;
        printables[3] = magazine1;
        printables[4] = magazine2;
        printables[5] = magazine3;

        Book.printBooks(printables);
        Magazine.printMagazines(printables);




    }
}
