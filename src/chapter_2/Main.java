package chapter_2;

/**
 * Created by naohiro on 2014/01/31.
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        Object p = stack.pop();
        Object p2 = stack.pop();
        stack.push(new Object());
    }

}
