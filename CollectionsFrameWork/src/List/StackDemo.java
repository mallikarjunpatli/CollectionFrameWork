package List;


// Stack extends Vector
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // Add elements
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);

        // View the top element
        System.out.println(s.peek());

        // Remove the top element
        System.out.println(s.pop());

        // Print the remaining stack
        System.out.println(s);
    }
}
