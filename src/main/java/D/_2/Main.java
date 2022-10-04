package D._2;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        //adding elements to our stack
        stack.add(5);
        stack.add(3);
        stack.add(4);

        //printing whole stack
        stack.print();

        //printing deleted element
        System.out.println(stack.pop());

        //printing whole stack again
        stack.print();


        StackDescendant stackDescendant = new StackDescendant();
        //sorting
        System.out.println(stackDescendant.sort(stack.getStack()));

    }
}
