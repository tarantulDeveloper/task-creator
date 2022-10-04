package D._2;

import java.util.ArrayList;

public class Stack {
    protected ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void add(int number) {
        stack.add(number);
    }

    public int pop() {
        return stack.remove(stack.size() -1);
    }

    public ArrayList<Integer> getStack() {
       return stack;
    }

    public void print() {
        System.out.println(stack);
    }
}
