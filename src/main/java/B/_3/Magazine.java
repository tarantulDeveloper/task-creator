package B._3;

import java.util.Arrays;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static void printMagazines(Printable[] printable) {
        for (Printable pr : printable) {
            if (pr instanceof Magazine) {
                pr.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("The name of this Magazine is: " + name);
    }
}
