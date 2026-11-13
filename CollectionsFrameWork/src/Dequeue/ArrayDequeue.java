package Dequeue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) {

        Deque<String> names = new ArrayDeque<>();

        names.addLast("Ravi");
        names.addLast("Priya");
        names.addLast("Amit");

        System.out.println(names);
    }
}



