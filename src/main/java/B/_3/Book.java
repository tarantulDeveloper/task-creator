package B._3;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static void printBooks(Printable[] printable) {
        for (Printable pr : printable) {
            if (pr instanceof Magazine) {
                pr.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("The name if this Book is: " + name);
    }
}
