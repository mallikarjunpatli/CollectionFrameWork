package List;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list);

        // Add element at a specific index
        list.add(1, 100);
        System.out.println(list);

        // Get an element
        System.out.println(list.get(0));

        // Update an element
        list.set(0, 50);
        System.out.println(list);

        // Remove element by index
        list.remove(1);
        System.out.println(list);

        // Search for an element
        System.out.println(list.contains(20));

        // Find index
        System.out.println(list.indexOf(20));

        // Get size
        System.out.println(list.size());

        // Add at the beginning and end
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list);

        // Remove first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // Traverse the list
        for (Integer number : list) {
            System.out.println(number);
        }

        // Remove all elements
        list.clear();
        System.out.println(list);
    }
}
